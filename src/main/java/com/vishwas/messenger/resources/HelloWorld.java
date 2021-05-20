package com.vishwas.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.ExternalDocs;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.ApiResponse;

@SwaggerDefinition(
        info = @Info(
        		title = "Messenger API",
                description = "Gets the messages",
                version = "V1.0.0",
                contact = @Contact(
                   name = "Vishwas", 
                   email = "vishwas@swagger.io", 
                   url = "http://swagger.io"
                ),
                license = @License(
                   name = "Apache 2.0", 
                   url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS}, 
        externalDocs = @ExternalDocs(value = "Swagger", url = "https://swagger.io/")
)


	@Path("/hello")
	@Api(value="/hello")
	public class HelloWorld {
	@ApiOperation(value="Prints Hello world, for test purpose!",
			notes = "Printing the hello world for testing the swagger document generation")
	
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message =  "Invalid url"),
			@ApiResponse(code = 404, message = "Resource not found")
			})

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello World";
	}
}
