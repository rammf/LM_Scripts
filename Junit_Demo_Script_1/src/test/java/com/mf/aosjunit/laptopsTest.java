package com.mf.aosjunit;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import com.mf.aosjunit.laptops;

public class laptopsTest   {
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
		
	//int totalNumber = 20;
	 
	
	@Test
	public void laptopsPositiveTest() {
		//System.out.println("The Number is " + randomNumber);
		System.out.println("The Link Nmme is Laptops");
		laptops.dummycode(randomNumber);
		laptops.fibonacciRecusion(randomNumber);
	}
 
	@Test
	public void laptopsNegativeTest() {

		laptops.fibonacciLoop(randomNumber);
	}

	
}

