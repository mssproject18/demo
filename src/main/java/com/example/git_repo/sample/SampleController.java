package com.example.git_repo.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/hello")
	public String greeting() {
		return "hello world!.";
	}

}
