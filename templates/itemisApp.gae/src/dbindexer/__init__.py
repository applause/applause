from django.conf import settings
from django.utils.importlib import import_module

_MODULE_NAMES = getattr(settings, 'DB_INDEX_MODULES', ())

def autodiscover():
    """
    Automatically loads database index definitions from db_indexes modules in
    installed apps.
    """
    import imp
    from django.conf import settings
    from django.utils.importlib import import_module

    for app in settings.INSTALLED_APPS:
        # For each app, we need to look for an search_indexes.py inside that app's
        # package. We can't use os.path here -- recall that modules may be
        # imported different ways (think zip files) -- so we need to get
        # the app's __path__ and look for search_indexes.py on that path.

        # Step 1: find out the app's __path__ Import errors here will (and
        # should) bubble up, but a missing __path__ (which is legal, but weird)
        # fails silently -- apps that do weird things with __path__ might
        # need to roll their own index registration.
        try:
            app_path = import_module(app).__path__
        except AttributeError:
            continue

        # Step 2: use imp.find_module to find the app's search_indexes.py. For some
        # reason imp.find_module raises ImportError if the app can't be found
        # but doesn't actually try to import the module. So skip this app if
        # its search_indexes.py doesn't exist
        try:
            imp.find_module('dbindexes', app_path)
        except ImportError:
            continue

        # Step 3: import the app's search_index file. If this has errors we want them
        # to bubble up.
        import_module("%s.dbindexes" % app)

def load_indexes():
    for name in _MODULE_NAMES:
        try:
            import_module(name)
        except ImportError:
            pass