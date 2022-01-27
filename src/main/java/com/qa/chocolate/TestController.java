package com.qa.chocolate;
//Back End speaks to front end with request

//type of request shown by annotation

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // speak to front end(map info through), allow us to use requests in controller,
				// may or may not return, but if it does it is in a certain format
public class TestController {

	@GetMapping("/test")
	public String hello() {
		return "hello world";
	}

}
