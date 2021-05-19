package com.vishwas.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@Path("/hello")
@Api(value="/hello", description="Returns Hello world in plain text")
public class HelloWorld {
	@ApiOperation(value="Print Hello world!")
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message =  "Invalid department id supplied"),
			@ApiResponse(code = 404, message = "Department not found")
			})

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello World";
	}
}
