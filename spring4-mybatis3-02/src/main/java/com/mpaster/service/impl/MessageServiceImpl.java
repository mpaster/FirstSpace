package com.mpaster.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpaster.dao.MessageMapper;
import com.mpaster.model.Message;
import com.mpaster.service.IMessageService;

@Service("messageService")
public class MessageServiceImpl implements IMessageService {

	@Autowired
	private MessageMapper messageMapper;
	
	@Override
	public Message getMessage(int mesgeId) {
		return messageMapper.selectByPrimaryKey(mesgeId);
	}

	@Override
	public void addMessage(Message mesge) {
		this.messageMapper.insert(mesge);
		
	}

	@Override
	public void deleteMessage(int mesgeId) {
		this.messageMapper.deleteByPrimaryKey(mesgeId);
	}

	@Override
	public void updateMessage(Message mesge) {
		this.messageMapper.updateByPrimaryKey(mesge);
		
	}

	@Override
	public List<Message> getAll() {
		return this.messageMapper.selectAll();
	}

}
