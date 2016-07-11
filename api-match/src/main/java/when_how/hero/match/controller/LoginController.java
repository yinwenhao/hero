package when_how.hero.match.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import when_how.hero.match.models.TestModel;
import when_how.hero.match.service.MatchService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	
	private MatchService match;

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public TestModel test2(@Valid TestModel request) {
		return request;
	}
	
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public String test3(@Valid TestModel request) {
		return request.getAaa();
	}

}
