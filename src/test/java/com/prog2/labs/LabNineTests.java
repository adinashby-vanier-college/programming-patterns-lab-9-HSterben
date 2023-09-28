package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabNineTests {

	@Test
	void groupStringsTest1() {
		String[] input = { "abc", "bcd", "acef", "xyz", "az", "ba", "a", "z" };
		List<List<String>> actualList = LabNine.groupStrings(input);

		String[][] actual = new String[actualList.size()][];
		String[] blankArray = new String[0];

		for (int i = 0; i < actualList.size(); i++) {
			actual[i] = actualList.get(i).toArray(blankArray);
		}

		String[][] expected = { { "acef" }, { "a", "z" }, { "abc", "bcd", "xyz" }, { "az", "ba" } };

		Arrays.sort(actual, (a, b) -> a[0].compareTo(b[0]));
		Arrays.sort(expected, (a, b) -> a[0].compareTo(b[0]));

		System.out.println(Arrays.deepToString(expected));

		assertArrayEquals(expected, actual);
	}

	@Test
	void groupStringsTest2() {
		String[] input = { "a" };
		List<List<String>> actualList = LabNine.groupStrings(input);

		String[][] actual = new String[actualList.size()][];
		String[] blankArray = new String[0];

		for (int i = 0; i < actualList.size(); i++) {
			actual[i] = actualList.get(i).toArray(blankArray);
		}

		String[][] expected = { { "a" } };

		Arrays.sort(actual, (a, b) -> a[0].compareTo(b[0]));
		Arrays.sort(expected, (a, b) -> a[0].compareTo(b[0]));

		System.out.println(Arrays.deepToString(expected));

		assertArrayEquals(expected, actual);
	}

	@Test
	void groupStringsTest3() {
		String[] input = { "qwr", "dsa", "r", "qq", "eqgd" };
		List<List<String>> actualList = LabNine.groupStrings(input);

		String[][] actual = new String[actualList.size()][];
		String[] blankArray = new String[0];

		for (int i = 0; i < actualList.size(); i++) {
			actual[i] = actualList.get(i).toArray(blankArray);
		}

		String[][] expected = { { "qwr" }, { "dsa" }, { "r" }, { "qq" }, { "eqgd" } };

		Arrays.sort(actual, (a, b) -> a[0].compareTo(b[0]));
		Arrays.sort(expected, (a, b) -> a[0].compareTo(b[0]));

		System.out.println(Arrays.deepToString(actual));

		assertArrayEquals(expected, actual);
	}

	@Test
	void groupStringsTest4() {
		String[] input = { "pp", "qq", "ewq", "fxr", "rtui" };
		List<List<String>> actualList = LabNine.groupStrings(input);

		String[][] actual = new String[actualList.size()][];
		String[] blankArray = new String[0];

		for (int i = 0; i < actualList.size(); i++) {
			actual[i] = actualList.get(i).toArray(blankArray);
		}

		String[][] expected = { { "pp", "qq" }, { "ewq", "fxr" }, { "rtui" } };

		Arrays.sort(actual, (a, b) -> a[0].compareTo(b[0]));
		Arrays.sort(expected, (a, b) -> a[0].compareTo(b[0]));

		System.out.println(Arrays.deepToString(actual));

		assertArrayEquals(expected, actual);
	}
}