package com.task.LandingPage_Backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.LandingPage_Backend.Entity.LandingPage;

@Repository
public interface LandingRepo extends JpaRepository<LandingPage, Integer> {

}
