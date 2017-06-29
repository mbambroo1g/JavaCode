package com.fannie.contracts;

import java.util.List;

import com.fannie.entity.Message;

public interface IMsgDAO {
	public void deleteMessage(int messageId);
	public List<Message> getAllMessages();
	public Message getMessage(int messageId);
	public void insertMessage(Message message);
	public void updateMessage(String msg, String author,int messageId);
}
