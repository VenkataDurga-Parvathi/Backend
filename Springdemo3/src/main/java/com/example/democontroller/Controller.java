package com.example.democontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoservice.Service;
@RestController
@RequestMapping("/run")
public class Controller {
	@Autowired
	 Service hw;
	
	@GetMapping("/test1")
	public  String run() {
		return hw.hello();
	}

}