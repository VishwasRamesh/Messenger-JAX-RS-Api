package com.vishwas.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vishwas.messenger.model.Message;
import com.vishwas.messenger.service.MessageService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Path("/messages")
@Api(value="/message")

public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	
	@GET
	@ApiOperation(value="Gets all the messages",
	notes = "Gives the details of all the messages")
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message =  "Invalid url"),
			@ApiResponse(code = 404, message = "Resource not found")
	})
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	@POST
	@ApiOperation(value="Posts a new message",
	notes = "Creates a new message and adds it to database")
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message =  "Invalid url"),
			@ApiResponse(code = 405, message = "Invalid Input")
	})
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message getMesage(@ApiParam(value = "Message object that needs to be added to the message", required = true) Message message) {
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	@ApiOperation(value="Modifies an already existing message",
	notes = "Modifies an existing message. Message is must be specified as parameter")
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message =  "Invalid url"),
			@ApiResponse(code = 404, message = "Resource not found")
	})
	
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long id, @ApiParam(value = "Message object that needs to be added to the message", required = true)Message message) {
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	@ApiOperation(value = "Deletes a message")
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
	        @ApiResponse(code = 404, message = "Message not found")
	})
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageId") long id) {
		messageService.removeMessage(id);
	}
	
	@GET
	@Path("/{messageId}")
	@ApiOperation(value = "Finds Message by id", 
    			notes = "Fetches a message by id. The id must be provided in long format", 
    			response = Message.class, 
    			responseContainer = "List")
	@ApiResponses(value = { 
			@ApiResponse(code = 400, message = "Invalid message id value")
	})
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long id) {
		return messageService.getMessage(id);
	}
}
