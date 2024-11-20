package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Chat;
import com.service.ChatService;

@RestController
@RequestMapping(path = "/chat")
@CrossOrigin(origins = { "http://127.0.0.1:8080/" })
public class ChatController {

	private final ChatService chatService;

	@Autowired
	public ChatController(ChatService chatService) {
		super();
		this.chatService = chatService;
	}

	@GetMapping("/AllChat")
	public List<Chat> allchat() {
		return chatService.AllChat();
	}

	@PostMapping("/AddChat")
	public String addChat(@RequestBody Chat chat) {
		chatService.addChat(chat);

		return "新增成功";
	}

	@PutMapping("/UpdateChat")
	public String updateChat(@RequestBody Chat chat) {
		chatService.updateChat(chat);
		return "修改成功";
	}

	@DeleteMapping("/DeleteChat/{chatId}")
	public String deleteChat(@PathVariable("chatId") Integer id) {
		chatService.deleteChat(id);

		return "刪除成功";
	}
}
