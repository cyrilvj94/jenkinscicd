package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/welcome")
public class BookController {
	
	@GetMapping()
	public String welcome() {
		return "reading books";
	}
	
	@GetMapping("/books")
	public String bookName() {
		return "Game of thrones";
	}
}