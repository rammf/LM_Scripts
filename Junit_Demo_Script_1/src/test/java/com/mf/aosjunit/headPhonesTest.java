package com.mf.aosjunit;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import com.mf.aosjunit.headPhones;




public class headPhonesTest   {
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
		
	//int totalNumber = 20;

	@Test
	public void headPhonesPositiveTest() {
		//System.out.println("The Number is " + randomNumber);
		System.out.println("The Link Nmme is Head Phones");
		headPhones.dummycode(randomNumber);
		headPhones.fibonacciRecusion(randomNumber);
	}

	@Test
	public void headPhonesNegativeTest() {
		headPhones.fibonacciLoop(randomNumber);

	}

 	
}

