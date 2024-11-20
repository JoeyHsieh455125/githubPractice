package com.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.model.Chat;

@SpringBootTest
public class ChatMapperTest {
	@Autowired
	private ChatMapper chatMapper;
	
//	@Test
	public void insertChatTest() {
		chatMapper.insertChat(new Chat("OPOPOP", "UUUU", "654"));
	}
	
//	@Test
	public void selectAllChatTest() {
		chatMapper.selectAllChat().forEach(System.out::println);
	}
	
//	@Test
	public void selectChatByIdTest() {
		chatMapper.selectChatById(42).forEach(System.out::println);
	}
	
//	@Test
	public void selectChatByIdRangeTest() {
		chatMapper.selectChatByIdRange(4, 20).forEach(System.out::println);
	}
	
//	@Test
	public void updateChatTest() {
		Chat chat = chatMapper.selectChatById(42).get(0);
		
		chat.setName("XXXXXXX");
		
		chatMapper.updateChat(chat);
	}
	
	@Test
	public void deleteChatTest() {
		chatMapper.deleteChat(42);
	}
}
