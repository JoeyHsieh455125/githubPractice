package com.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Chat {
	private Integer id;
	private String name;
	private String subject;
	private String content;

	public Chat(String name, String subject, String content) {
		super();
		this.name = name;
		this.subject = subject;
		this.content = content;
	}
}
