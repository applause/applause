from django.shortcuts import render_to_response
import providers


def CommitListByAllCommitsByRepository(request, path):
    data = providers.allCommitsByRepository(path)
    return render_to_response('generated/CommitList.html', {'data': data})

def UserDetailsByUserData(request, login):
    data = providers.userData(login)
    return render_to_response('generated/UserDetails.html', {'data': data})

def RepositoryListByAllRepositoriesByUser(request, login):
    data = providers.allRepositoriesByUser(login)
    return render_to_response('generated/RepositoryList.html', {'data': data})

