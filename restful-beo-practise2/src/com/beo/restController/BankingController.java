package com.beo.restController;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.beo.restController.Customers;

@Path("/bank")
public class BankingController {
	
	@GET
	@Path("/{firstname}/{lastname}")
	@Produces(MediaType.TEXT_HTML)
	public String hello(@PathParam("firstname")String fname,@PathParam("lastname")String lname){
		return "<h1>Hello Beo!!</h1>"+fname+"--"+lname;
	}
	
	@GET
	@Path("/customers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customers> getAllCustomer(){
		List<Customers> listCustomers = new ArrayList<>();
		Customers cust1 = new Customers(100,"Beo");
		Customers cust2 = new Customers(101,"Beo1");
		Customers cust3 = new Customers(102,"Beo2");
		listCustomers.add(cust1);
		listCustomers.add(cust2);
		listCustomers.add(cust3);
		
		return listCustomers;
	}

}
