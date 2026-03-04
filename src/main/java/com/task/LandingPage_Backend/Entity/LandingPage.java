package com.task.LandingPage_Backend.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="landing")
public class LandingPage {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String firstName;
	    private String lastName;
	    private String companyName;
	    private String workEmail;
	    private String jobTitle;
	    private String employees;
	    private String country;

	    private LocalDateTime createdAt = LocalDateTime.now();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getWorkEmail() {
			return workEmail;
		}

		public void setWorkEmail(String workEmail) {
			this.workEmail = workEmail;
		}

		public String getJobTitle() {
			return jobTitle;
		}

		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}

		public String getEmployees() {
			return employees;
		}

		public void setEmployees(String employees) {
			this.employees = employees;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}

		@Override
		public String toString() {
			return "LandingPage [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", companyName="
					+ companyName + ", workEmail=" + workEmail + ", jobTitle=" + jobTitle + ", employees=" + employees
					+ ", country=" + country + ", createdAt=" + createdAt + "]";
		}
	    
	    

}
