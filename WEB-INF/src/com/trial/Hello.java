package com.trial;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello Jersey";
	}

	@GET
	@Path("user")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser() {
		return new User(1,"Tejas", "7588645145");
	}

}
