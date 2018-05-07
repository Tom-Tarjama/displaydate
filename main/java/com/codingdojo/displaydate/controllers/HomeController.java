package com.codingdojo.displaydate.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/your_server")
	public String index(Model model) {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		DateFormat dateFormat = new SimpleDateFormat("EEEE', the 'd' of 'MMM', ' yyyy");
		Date date = new Date();
		model.addAttribute("date", dateFormat.format(date));
			return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		DateFormat timeFormat = new SimpleDateFormat("h:mm a");
		Date time = new Date();
		model.addAttribute("time", timeFormat.format(time));
			return "time.jsp";
	}

}
