
from django.conf.urls.defaults import patterns

urlpatterns = patterns('',
	
    (r'^$', 'views.CommitListByAllCommitsByRepository', {'path': 'applause/applause'}),
    
	
    (r'^CommitList/allCommitsByRepository/(?P<path>.+?)/$', 'views.CommitListByAllCommitsByRepository'),

    (r'^UserDetails/userData/(?P<login>.+?)/$', 'views.UserDetailsByUserData'),

    (r'^RepositoryList/allRepositoriesByUser/(?P<login>.+?)/$', 'views.RepositoryListByAllRepositoriesByUser'),

)
