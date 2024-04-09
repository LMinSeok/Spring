package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {
	public String title;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dueDate;
	
}
