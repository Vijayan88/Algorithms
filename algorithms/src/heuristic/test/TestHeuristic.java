package heuristic.test;

import static org.junit.Assert.*;

import org.junit.Test;

import heuristic.Fibonacci;
import heuristic.LongestCommonSubSequence;

public class TestHeuristic {

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
		assertEquals(obj.lengthOfLongestCommonSubSequence("ABCDGH", "AEDDHR",6,6),3);
		assertEquals(obj.lengthOfLongestCommonSubSequence("AGGTAB", "GXTXAYB",6,7),4);
	}

}
