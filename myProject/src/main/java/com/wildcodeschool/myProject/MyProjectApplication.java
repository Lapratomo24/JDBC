package com.wildcodeschool.myProject;

import jdk.jfr.Frequency;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>" +
				"<li><a href='/doctor/1'>Shinra Kishitani</a></li>" +
				"<li><a href='/doctor/2'>Tony Tony Chopper</a></li>" +
				"<li><a href='/doctor/3'>Wendy Marvell</a></li>" +
				"<li><a href='/doctor/4'>Senku Ishigami</a></li>" +
				"</ul>";
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String shinra() {
		return "Shinra Kishitani - Durarara";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String chopper() {
		return "Tony Tony Chopper - One Piece";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String wendy() {
		return "Wendy Marvell - Fairy Tail";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String senku() {
		return "Senku Ishigami - Dr. Stone";
	}

}