package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	// SERVICE (CHAMA + INJETA)
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	// METHODS
	@Override
	public String getDailyWorkout() {

		return "Tennis Coach Response";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
