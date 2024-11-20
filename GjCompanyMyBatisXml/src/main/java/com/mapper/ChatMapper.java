package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.model.Chat;

@Mapper
public interface ChatMapper {

	// create
	void insertChat(Chat chat);

	// read
	List<Chat> selectAllChat();

	List<Chat> selectChatById(Integer id);

	List<Chat> selectChatByIdRange(@Param("start") Integer start, @Param("end") Integer end);

	// update
	void updateChat(Chat chat);

	// delete
	void deleteChat(Integer id);
}
