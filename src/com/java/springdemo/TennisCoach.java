package com.java.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class TennisCoach implements Coach {

//	@Qualifier("happyFortuneService")
	@Autowired
	private FortuneService happyFortuneService;

	// constructor injection
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "practice back hand volley";
	}

	// setter injection
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	// method injection
//	@Autowired
//	public void addFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	// init method for bean lifecycle check
	@PostConstruct
	public void startUp() {
		System.out.println("start up...");
	}

	// destroy method for bean lifecycle check
	@PreDestroy
	public void cleanUP() {
		System.out.println("clean up...");
	}

	@Override
	public String getDailyFortune() {
		return happyFortuneService.getFortune();
	}

}
