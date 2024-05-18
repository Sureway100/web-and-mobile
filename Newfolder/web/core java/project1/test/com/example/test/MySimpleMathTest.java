package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MySimpleMathTest {

	@Test
	void testWithValues() {
		
		assertEquals(1, new MySimpleMath().calculateSum(new int[] {1,2,3,4,5, 6}));
	}
	
	@Test
	void testWithZeroValues() {
		
		int[] myArrays = {};
		MySimpleMath MyMath = new MySimpleMath();
		
		int result = MyMath.calculateSum(myArrays);
		
		int expected = 0;
		
		assertEquals(expected, result);
//		assertNull
//		assertNotNull
//		assertTrue
//		assertFalse
//		assertArrayEquals(expected, result)
		
//		@BeforeEach 
//		@AfterEach
	}

}
