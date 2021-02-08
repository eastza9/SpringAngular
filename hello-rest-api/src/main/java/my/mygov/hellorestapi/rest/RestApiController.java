package my.mygov.hellorestapi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {

	@GetMapping("")
	public String helloWorld()	{
		return "Hello World";
	}
	

}
