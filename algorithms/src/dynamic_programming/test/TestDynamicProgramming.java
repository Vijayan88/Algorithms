package dynamic_programming.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dynamic_programming.Fibonacci;
import dynamic_programming.LongestCommonSubSequence;

public class TestDynamicProgramming {

	@Test
	public void testFibonacci() {
		Fibonacci obj = new Fibonacci();
		assertEquals(obj.series(10),55);
		assertEquals(obj.series(13),233);
		assertEquals(obj.series(14),377);
	}
	
	@Test
	public void testLongestCommonSubsequence() {
		LongestCommonSubSequence obj = new LongestCommonSubSequence();
		assertEquals(obj.lengthOfLongestCommonSubSequence("ABCDGH", "AEDDHR"),3);
		assertEquals(obj.lengthOfLongestCommonSubSequence("AGGTAB", "GXTXAYB"),4);
	}

}
