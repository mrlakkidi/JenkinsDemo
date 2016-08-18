package com.lessonslab.cxfrestservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.lessonslab.cxfrestservice.model.Profile;

@Path("/")
public interface ProfileService {
	
	@GET
	@Produces({MediaType.APPLICATION_XML})
	@Path("profiles")
	public Response getAllProfiles();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("profiles/{profileName}")
	public Response getProfile(@PathParam("profileName") String profileName);
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@Path("profile")
	public Profile addProfile(@QueryParam("profileName")String profileName, @QueryParam("firstName")String firstName, @QueryParam("lastName")String lastName);
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@Path("profile")
	public Response updateProfile(@QueryParam("profileName")String profileName, @QueryParam("id")Long id, @QueryParam("firstName")String firstName, @QueryParam("lastName")String lastName);
	
	@DELETE
	@Produces({MediaType.APPLICATION_JSON})
	@Path("profile")
	public Profile removeProfile(@PathParam("profileName") String profileName);

}
