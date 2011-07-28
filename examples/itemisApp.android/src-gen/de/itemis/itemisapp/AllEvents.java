package de.itemis.itemisapp;

import java.io.Serializable;
import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@SuppressWarnings("serial")
@Root(strict = false)
public class AllEvents implements Serializable {

	@ElementList(required = false, inline = true, entry = "news")
	private ArrayList<Event> news;

	public ArrayList<Event> getNews() {
		return news;
	}

	public void setNews(ArrayList<Event> news) {
		this.news = news;
	}

	@ElementList(required = false, inline = true, entry = "activity")
	private ArrayList<Event> activity;

	public ArrayList<Event> getActivity() {
		return activity;
	}

	public void setActivity(ArrayList<Event> activity) {
		this.activity = activity;
	}

	@ElementList(required = false, inline = true, entry = "workshop")
	private ArrayList<Event> workshop;

	public ArrayList<Event> getWorkshop() {
		return workshop;
	}

	public void setWorkshop(ArrayList<Event> workshop) {
		this.workshop = workshop;
	}

}
