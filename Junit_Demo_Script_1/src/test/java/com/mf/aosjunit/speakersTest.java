package com.mf.aosjunit;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import com.mf.aosjunit.speakers;

public class speakersTest   {
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
	
	
	//int totalNumber = 20;
	 
	@Test
	public void speakersPositiveTest() {
		//System.out.println("The Number is " + randomNumber);
		System.out.println("The Link Nmme is Speakers");
		speakers.dummycode(randomNumber);
		speakers.fibonacciRecusion(randomNumber);
	}
 
	@Test
	public void speakersNegativeTest() {

		speakers.fibonacciLoop(randomNumber);
		
	}
	
}

