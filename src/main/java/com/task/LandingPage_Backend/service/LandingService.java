package com.task.LandingPage_Backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.LandingPage_Backend.Entity.LandingPage;
import com.task.LandingPage_Backend.Repository.LandingRepo;

@Service
public class LandingService {

	 @Autowired
	    private LandingRepo leadRepository;

	    public void saveLead(LandingPage request) {

	        LandingPage landingpage = new LandingPage();
	        landingpage.setFirstName(request.getFirstName());
	        landingpage.setLastName(request.getLastName());
	        landingpage.setCompanyName(request.getCompanyName());
	        landingpage.setWorkEmail(request.getWorkEmail());
	        landingpage.setJobTitle(request.getJobTitle());
	        landingpage.setEmployees(request.getEmployees());
	        landingpage.setCountry(request.getCountry());

	        leadRepository.save(landingpage);
	    }
}
