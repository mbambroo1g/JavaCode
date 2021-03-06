package com.fannie.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fannie.connection.GetConnection;
import com.fannie.contracts.IMsgDAO;
import com.fannie.entity.Message;

public class MsgDAO implements IMsgDAO {

	@Override
	public void deleteMessage(int messageId) {
		String sql = "Delete from message where messageId = ?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, messageId);
			System.out.println((gc.ps.executeUpdate() > 0) ? "Record deleted." : "Record not deleted.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Message> getAllMessages() {
		String sql = "Select messageId,message,author from message";
		GetConnection gc = new GetConnection();
		try {
			ArrayList<Message> list = new ArrayList<Message>();
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();

			while (gc.rs.next()) {
				Message temp = new Message();
				temp.setMessageId(gc.rs.getInt(1));
				temp.setMsg(gc.rs.getString(2));
				temp.setAuthor(gc.rs.getString(3));
				list.add(temp);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}


	@Override
	public Message getMessage(int messageId) {

		String sql = "Select messageId,message,author from message where messageId =?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, messageId);

			gc.rs = gc.ps.executeQuery();
			if (gc.rs.next()) {
				Message temp = new Message();
				temp.setMessageId(gc.rs.getInt(1));
				temp.setMsg(gc.rs.getString(2));
				temp.setAuthor(gc.rs.getString(3));
				return temp;
			} else {
				System.out.println("Sorry, record does not exist.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insertMessage(Message message) {
		String sql = "Insert into message values(?,?,?)";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, message.getMessageId());
			gc.ps.setString(2, message.getMsg());
			gc.ps.setString(3, message.getAuthor());
			boolean flag = gc.ps.executeUpdate() > 0;

			if (flag) {
				System.out.println("Record inserted.");
			} else {
				System.out.println("Sorry, record not inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Sorry, record not inserted");
		}
	}

	@Override
	public void updateMessage(String msg, String author,int messageId) {
		String sql = "Update message set message =?, author = ? where messageId =?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setString(1, msg);
			gc.ps.setString(2, author);
			gc.ps.setInt(3, messageId);
			boolean flag = gc.ps.executeUpdate() > 0;
			if (flag) {
				System.out.println("Record updated.");
			} else {
				System.out.println("Sorry, record not updated.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
