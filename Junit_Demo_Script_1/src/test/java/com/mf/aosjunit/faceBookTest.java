package com.mf.aosjunit;

import java.util.Random;

import org.junit.Test;

import com.mf.aosjunit.faceBook;

public class faceBookTest {
			
	Random ran = new Random();
	int range = 6;
	int randomNumber = ran.nextInt(range) + 1;
	
	//int totalNumber = 20;
	 
	@Test
	public void faceBookPositiveTest() {
		//System.out.println("The Number is " + randomNumber);
		System.out.println("The Link Nmme is Face Book");
		faceBook.dummycode(randomNumber);
		faceBook.fibonacciRecusion(randomNumber);
	}
	 
	@Test
	public void faceBookNegativeTest() {
		faceBook.fibonacciLoop(randomNumber);
		
	}
	
}

