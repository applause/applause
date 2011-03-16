package de.itemis.itemisapp;

import java.io.Serializable;
import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@SuppressWarnings("serial")
@Root(strict = false)
public class Speaker implements Serializable {

	@Element(required = false)
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Element(required = false)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Element(required = false)
	private String bio;

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	@Element(required = false)
	private String pictureurl;

	public String getPictureurl() {
		return pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}

	@ElementList(required = false, inline = true, entry = "sessions")
	private ArrayList<Session> sessions;

	public ArrayList<Session> getSessions() {
		return sessions;
	}

	public void setSessions(ArrayList<Session> sessions) {
		this.sessions = sessions;
	}

}
