package org.example.controller;

import org.example.annotion.WebLog;
import org.example.serive.ExampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *
 * </p>
 *
 * @author zeqiang.sheng
 * @since 2024/2/23
 */
@RequestMapping("/example")
@RestController
public class ExampleController {
	@Resource
	private ExampleService exampleService;
	
	@GetMapping("/test")
	public String test(){
		return exampleService.test();
	}

	@GetMapping("/error")
	@WebLog
	public String error() {
		exampleService.error();
		return "noError";
	}
}
