package io.cricinfostarter.infoCntrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricInfoController {

	@RequestMapping("/hello")
	public String sayHello()
	{
		return "Hello World";
	}
}
