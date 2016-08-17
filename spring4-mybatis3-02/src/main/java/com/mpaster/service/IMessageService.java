package com.mpaster.service;

import java.util.List;

import com.mpaster.model.Message;

public interface IMessageService {

	Message getMessage(int mesgeId);
	
	void addMessage(Message mesge);
	
	void deleteMessage(int mesgeId);
	
	void updateMessage(Message mesge);
	
	List<Message> getAll();
}
