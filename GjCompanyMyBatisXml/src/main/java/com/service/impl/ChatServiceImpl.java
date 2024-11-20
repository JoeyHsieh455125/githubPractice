package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ChatMapper;
import com.model.Chat;
import com.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService {

	private final ChatMapper chatMapper;

	@Autowired
	public ChatServiceImpl(ChatMapper chatMapper) {
		super();
		this.chatMapper = chatMapper;
	}

	@Override
	public void addChat(Chat chat) {
		chatMapper.insertChat(chat);
	}

	@Override
	public List<Chat> AllChat() {
		return chatMapper.selectAllChat();
	}

	@Override
	public Chat readChatById(Integer id) {
		List<Chat> chats = chatMapper.selectChatById(id);

		if (chats.isEmpty()) {
			return null;
		} else {
			return chats.get(0);
		}
	}

	@Override
	public void updateChat(Chat putChat) {
		List<Chat> chats = chatMapper.selectChatById(putChat.getId());
		
		if (chats.isEmpty()) {
			return;
		}
		
		Chat chat = chats.get(0);

		if (putChat.getName() != null) {
			chat.setName(putChat.getName());
		}

		if (putChat.getSubject() != null) {
			chat.setSubject(putChat.getSubject());
		}

		if (putChat.getContent() != null) {
			chat.setContent(putChat.getContent());
		}

		chatMapper.updateChat(chat);
	}

	@Override
	public void deleteChat(Integer id) {
		chatMapper.deleteChat(id);
	}

}
