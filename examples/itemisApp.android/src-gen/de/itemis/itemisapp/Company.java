package de.itemis.itemisapp;

import java.io.Serializable;
import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@SuppressWarnings("serial")
@Root(strict = false)
public class Company implements Serializable {

	@Element(required = false)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ElementList(required = false, inline = true, entry = "office")
	private ArrayList<Office> office;

	public ArrayList<Office> getOffice() {
		return office;
	}

	public void setOffice(ArrayList<Office> office) {
		this.office = office;
	}

}
