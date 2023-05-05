package com.soft.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/providr")
public class ServiceProvider {

	@Path("/home")
	@GET
	public String showMessage() {
		
		return "welome rest web servicess";
	}
}
