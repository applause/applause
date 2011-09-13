package de.itemis.itemisapp;

import static de.itemis.base.StringUtils.*;

public class ProviderFactory {

	public static allCommitsByRepositoryProvider getAllCommitsByRepositoryProvider(
			String path) {
		String feedUrl = "http://github.com/api/v2/xml/commits/list/" + path
				+ "/master";
		return new allCommitsByRepositoryProvider(feedUrl);
	}

	public static userDataProvider getUserDataProvider(String login) {
		String feedUrl = "http://github.com/api/v2/xml/user/search/" + login;
		return new userDataProvider(feedUrl);
	}

	public static allRepositoriesByUserProvider getAllRepositoriesByUserProvider(
			String login) {
		String feedUrl = "http://github.com/api/v2/xml/repos/show/" + login;
		return new allRepositoriesByUserProvider(feedUrl);
	}

}
