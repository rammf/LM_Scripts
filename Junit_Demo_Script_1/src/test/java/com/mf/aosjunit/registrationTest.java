package com.mf.aosjunit;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import com.mf.aosjunit.registration;

public class registrationTest{
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
	
	
	//int totalNumber = 20;


	@Test
	public void registrationPositiveTest() {
		//	System.out.println("The Number is " + randomNumber);
		System.out.println("The Link Nmme is Registration");
		headPhones.dummycode(randomNumber);
		headPhones.fibonacciRecusion(randomNumber);
	}

	@Test
	public void registrationNegativeTest() {
		headPhones.fibonacciLoop(randomNumber);
		//	Assert.fail();
	}

}

