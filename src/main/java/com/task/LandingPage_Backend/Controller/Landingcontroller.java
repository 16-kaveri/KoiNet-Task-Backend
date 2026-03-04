package com.task.LandingPage_Backend.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.LandingPage_Backend.Entity.LandingPage;
import com.task.LandingPage_Backend.service.LandingService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/leads")
@CrossOrigin(origins = "*")
public class Landingcontroller {

	 @Autowired
	    private LandingService leadService;

	 @PostMapping
	 public ResponseEntity<?> createLead(@Valid @RequestBody LandingPage request) {

	     leadService.saveLead(request);

	     Map<String, String> response = new HashMap<>();
	     response.put("message", "Lead Saved Successfully");

	     return ResponseEntity.ok(response);
	 }
}
