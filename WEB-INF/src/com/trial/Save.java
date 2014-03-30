package com.trial;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sun.jersey.api.core.InjectParam;
import com.sun.jersey.spi.inject.Inject;

@Path("/save")
public class Save {

	@InjectParam
	private SaveService saveService;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateContactNumber(User u) {
		try {
			saveService.save(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.ok().build();
	}
}
