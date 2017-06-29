package com.fannie.entity;

public class Message {
	private  String author;
	private int messageId;
	private String msg;


	public Message() {
	}

	public Message(int messageId, String msg, String author) {
		super();
		this.messageId = messageId;
		this.msg = msg;
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
	public int getMessageId() {
		return messageId;
	}
	public String getMsg() {
		return msg;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", msg=" + msg + ", author="
				+ author + "]";
	}

}