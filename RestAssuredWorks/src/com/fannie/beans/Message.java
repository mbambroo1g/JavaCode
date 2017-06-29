package com.fannie.beans;

public class Message {
	private String author;
	private int messageId;
	private String msg;

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


}