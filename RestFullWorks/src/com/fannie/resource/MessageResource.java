package com.fannie.resource;

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
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.fannie.entity.Message;
import com.fannie.service.MessageService;

@Path("/message")
public class MessageResource {
	static MessageService messageService = new MessageService();


	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteMessage(@PathParam("messageId") int messageId)
			throws JSONException {
		String message =   messageService.deleteMessage(messageId);

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", message);

		return Response.status(200).entity(jsonObject.toString()).build();
	}


	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") int messageId) {
		Message message = messageService.getMessage(messageId);
		System.out.println(message);
		return message;
	}


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}


	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message postMessage(Message message) {
		return messageService.insertMessage(message);
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message updateMessage(Message message) {
		return messageService.updateMessage(message);
	}

}
