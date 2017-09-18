package com.beo.restController;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customers {
	
	int id;
	String name;
	public Customers(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Customers() {
		super();		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
