package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	// SERVICE (CHAMA + INJETA)
	private FortuneService fortuneService;
	
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Football Coach Response";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
