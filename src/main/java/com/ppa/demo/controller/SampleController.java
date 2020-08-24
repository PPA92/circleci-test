package com.ppa.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public @ResponseBody Car sample() {
		Car car = new Car("Fit", 2012, 1.3, "5523");
		return car;
	}
}
