package com.rakuten.prj.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author rohan
 *
 */

public class ArrayUtilTest {

	@Test
	void testGetSum() {
		int[] values = { 45, 10, -5 };
		int expected = 50;
		assertEquals(expected, ArrayUtil.getSum(values));
	}

	@Test
	void testGetOccurence() {
		int[] values = { 43, 6, 77, 6, 12, 6 };
		int expected = 3;
		assertEquals(expected, ArrayUtil.getOccurence(values, 6));
	}

	@Test
	void testSort() {
		int[] nos = { 6, 2, 78, 12, 90 };
		ArrayUtil.sort(nos);
		int[] expected = { 2, 6, 12, 78, 90 };
		assertArrayEquals(expected, nos);
	}

	@Test
	void testComparable() {
		String[] names = { "George", "Brad", "Lee", "Charlie" };
		ArrayUtil.sort(names);
		String[] sorted = { "Brad", "Charlie", "George", "Lee" };
		assertArrayEquals(sorted, names);
	}

}