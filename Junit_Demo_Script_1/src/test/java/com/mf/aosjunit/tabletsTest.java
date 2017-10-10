package com.mf.aosjunit;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import com.mf.aosjunit.tablets;

public class tabletsTest {
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
	
	
	//int totalNumber = 20;
	 
	@Test
	public void tabletsPositiveTest() {
		//System.out.println("The Number is " + randomNumber);
		System.out.println("The Link Nmme is Tablets");
		tablets.dummycode(randomNumber);
		tablets.fibonacciRecusion(randomNumber);
		//Assert.fail();
	}
 
	@Test
	public void tabletsNegativeTest() {
		tablets.fibonacciLoop(randomNumber);
	}
 
}

