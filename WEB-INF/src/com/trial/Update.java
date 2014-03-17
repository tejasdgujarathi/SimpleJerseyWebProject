package com.trial;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/update")
public class Update {

	@POST
	@Path("{newNumber}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User updateContactNumber(@PathParam("newNumber") String newNumber, User u) {
		u.updateContactNumber(newNumber);
		return u;
	}
}
