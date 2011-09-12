package de.itemis.itemisapp;

import java.io.Serializable;
import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@SuppressWarnings("serial")
@Root(strict = false)
public class User implements Serializable {

	@Element(required = false)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Element(required = false)
	private String repos;

	public String getRepos() {
		return repos;
	}

	public void setRepos(String repos) {
		this.repos = repos;
	}

	@Element(required = false)
	private String followers;

	public String getFollowers() {
		return followers;
	}

	public void setFollowers(String followers) {
		this.followers = followers;
	}

	@Element(required = false)
	private String login;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
