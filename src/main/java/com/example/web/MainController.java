package com.example.web;

import java.util.Date;

import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/pages", method = RequestMethod.GET)
	public void main() {
		PrettyTime p = new PrettyTime();
		System.out.println(p.format(new Date()));
		//prints: “moments from now”

		System.out.println(p.format(new Date(System.currentTimeMillis() + 1000*60*10)));
	}
}
