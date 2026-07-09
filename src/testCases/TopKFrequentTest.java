package testCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import capitalOne.TopKFrequentBruteForce;

class TopKFrequentTest {

	@Test
	void testStandardCase() {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int[] expected = { 1, 2 };

		int[] actual = TopKFrequentBruteForce.topKFrequent(nums, k);

		// Sort both arrays so order doesn't cause a false failure
		Arrays.sort(actual);
		Arrays.sort(expected);

		assertArrayEquals(expected, actual, "Should return the two most frequent elements.");
	}

	@Test
	void testSingleElementArray() {
		// Edge Case: Array has only 1 element, k = 1
		int[] nums = { 1 };
		int k = 1;
		int[] expected = { 1 };

		int[] actual = TopKFrequentBruteForce.topKFrequent(nums, k);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testAllElementsHaveSameFrequency() {
		// Edge Case: All unique numbers appear exactly once.
		// Any subset of size k is technically a valid answer.
		int[] nums = { 10, 20, 30 };
		int k = 2;

		int[] actual = TopKFrequentBruteForce.topKFrequent(nums, k);

		assertEquals(k, actual.length, "Result array must be of size K.");
		// Verify that the elements chosen actually existed in the original array
		for (int num : actual) {
			assertTrue(num == 10 || num == 20 || num == 30, "Returned element was not in the input.");
		}
	}

	@Test
	void testNegativeNumbers() {
		// Edge Case: Handling negative numbers cleanly
		int[] nums = { -1, -1, -2, 2, 2, 2 };
		int k = 1;
		int[] expected = { 2 }; // 2 appears three times

		int[] actual = TopKFrequentBruteForce.topKFrequent(nums, k);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testKEqualsTotalUniqueElements() {
		// Edge Case: Asking for all unique elements (K equals map size)
		int[] nums = { 5, 5, 6, 7, 7, 7 };
		int k = 3; // There are exactly 3 unique numbers (5, 6, 7)
		int[] expected = { 5, 6, 7 };

		int[] actual = TopKFrequentBruteForce.topKFrequent(nums, k);

		Arrays.sort(actual);
		Arrays.sort(expected);

		assertArrayEquals(expected, actual);
	}

}
