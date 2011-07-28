package de.itemis.itemisapp;

import java.io.Serializable;
import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@SuppressWarnings("serial")
@Root(strict = false)
public class Carreer implements Serializable {

	@Element(required = false)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ElementList(required = false, inline = true, entry = "link")
	private ArrayList<Link> link;

	public ArrayList<Link> getLink() {
		return link;
	}

	public void setLink(ArrayList<Link> link) {
		this.link = link;
	}

	@ElementList(required = false, inline = true, entry = "job")
	private ArrayList<JobOffer> job;

	public ArrayList<JobOffer> getJob() {
		return job;
	}

	public void setJob(ArrayList<JobOffer> job) {
		this.job = job;
	}

}
