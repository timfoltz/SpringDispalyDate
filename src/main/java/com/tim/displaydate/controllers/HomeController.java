package com.tim.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model	) {
		model.addAttribute("dojoName", "Burbank");
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model	) {
		String pattern = "EEEEE, dd MMMMM, yyy";
		SimpleDateFormat  date = new SimpleDateFormat(pattern);
		String today = date.format(new Date());
		model.addAttribute("date",today);
		return "dateTemplate.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model	) {
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("hh:mm a");
		LocalTime time = LocalTime.now();
		String now = time.format(pattern);
		model.addAttribute("time",now);
		return "timeTemplate.jsp";
	}
	
}
