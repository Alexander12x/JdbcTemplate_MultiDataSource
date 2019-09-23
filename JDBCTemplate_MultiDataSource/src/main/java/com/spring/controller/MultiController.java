package com.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.MultiService;

@RestController
@RequestMapping("api/multi")
public class MultiController {

	@Autowired
	private MultiService service;

	@GetMapping
	public List<Map<String, Object>> execute(@RequestParam String tenantId, @RequestParam String query) {
		return service.executeQuery(query);
	}
}
