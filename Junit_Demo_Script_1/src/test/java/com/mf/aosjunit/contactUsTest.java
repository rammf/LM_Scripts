package com.mf.aosjunit;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import com.mf.aosjunit.contactUs;

public class contactUsTest {
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
	


	@Test
	public void contactUsPositiveTest() {
		//System.out.println("The Number is " + randomNumber);
		System.out.println("The Link Nmme is Contact Us");
		contactUs.dummycode(randomNumber);
		contactUs.fibonacciRecusion(randomNumber);
		//Assert.fail();
	}
 
	@Test
	public void contactUsNegativeTest() {
		contactUs.fibonacciLoop(randomNumber);
	}
 
}

