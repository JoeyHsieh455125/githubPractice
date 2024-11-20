package com.service;

import java.util.List;

import com.model.Chat;

public interface ChatService {

	void addChat(Chat chat);

	List<Chat> AllChat();

	Chat readChatById(Integer id);

	void updateChat(Chat chat);

	void deleteChat(Integer id);

}
