package com.dailycodebuffer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to github";

	public static void main(String[] args)
	{
	}
		SpringApplication.run(HelloworldApplication.class, args);
	}

}


/*
…or create a new repository on the command line
		echo "# github-actions-example" >> README.md
		git init
		git add README.md
		git commit -m "first commit"
		git branch -M main
		git remote add origin https://github.com/santoshdalaigithub/github-actions-example.git
		git push -u origin main*/


/*…or push an existing repository from the command line
		git remote add origin https://github.com/santoshdalaigithub/github-actions-example.git
		git branch -M main
		git push -u origin main*/
