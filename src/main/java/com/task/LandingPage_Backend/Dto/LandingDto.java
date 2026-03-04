package com.task.LandingPage_Backend.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LandingDto {
	
	 @NotBlank(message = "First Name is required")
	    private String firstName;

	    @NotBlank(message = "Last Name is required")
	    private String lastName;

	    @NotBlank(message = "Company Name is required")
	    private String companyName;

	    @NotBlank(message = "Work Email is required")
	    @Email(message = "Invalid Email Address")
	    private String workEmail;

	    @NotBlank(message = "Job Title is required")
	    private String jobTitle;

	    @NotBlank(message = "Number of Employees is required")
	    private String employees;

	    @NotBlank(message = "Country is required")
	    private String country;

}
