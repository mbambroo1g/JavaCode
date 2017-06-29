package com.fannie.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fannie.contracts.IMsgDAO;
import com.fannie.dao.MsgDAO;
import com.fannie.entity.Message;

/**
 *
 * @author Medha Bambroo
 * @since Jun 2017
 * @version 1.1
 * @see Updated the code to refer to DAO class to interact with DB
 *
 */

public class MessageService {
	IMsgDAO dao = new MsgDAO();
	Message message = new Message();

	Integer messageId = message.getMessageId();
	Map<Integer, Message> messages = new HashMap<Integer, Message>();
	String msg = message.getMsg();

	public MessageService(){
		System.out.println("Constructor invoked for Message Service... ");
		/*
		Message message = new Message(109,"Some message","me");

		messages.put(109, message);*/
	}

	public String deleteMessage (Integer messageId){
		dao.deleteMessage(messageId);
		return message.getMsg();
	}

	public List<Message> getAllMessages(){
		return dao.getAllMessages();
	}

	public Message getMessage(Integer messageId){
		return dao.getMessage(messageId);
	}

	public Message insertMessage(Message message){
		dao.insertMessage(message);
		return message;
	}

	public Message updateMessage(Message message){
		System.out.println(message);
		dao.updateMessage(message.getMsg(),message.getAuthor(),message.getMessageId());
		return message;
	}
}





