import re
import logging
import settings

numeric_test = re.compile("^\d+$")

def to_list(o, arg = None):
	logging.error(arg)
	if arg:
		"""
		Gets an attribute of an object dynamically from a string name
		http://stackoverflow.com/questions/844746/performing-a-getattr-style-lookup-in-a-django-template/1112236#1112236
		"""
		if hasattr(o, str(arg)):
			o = getattr(o, arg)
		elif hasattr(o, 'has_key') and o.has_key(arg):
			o = o[arg]
		elif numeric_test.match(str(arg)) and len(o) > int(arg):
			o = o[int(arg)]
		else:
			return []
			
	if isinstance(o, list):
		return o
	else:
		return [o]

def split(o, separator):
    s = (u"%s" %o)
    return s.split(unicode(separator))