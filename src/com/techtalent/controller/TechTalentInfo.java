package com.techtalent.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TechTalentInfo {
	@RequestMapping("/welcome")
	public ModelAndView techInfo()
	{
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>TechTalent Welsomes you to the world of Technology</h3></div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

}
