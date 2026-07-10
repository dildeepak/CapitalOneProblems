package testCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import capitalOne.MergeIntervalSimple;

class MergeIntervalSImpleTest {

	private MergeIntervalSimple solver;

    @BeforeEach
    void setUp() {
        solver = new MergeIntervalSimple();
    }

    @Test
    void testStandardOverlappingCase() {
        int[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, solver.merge(input));
    }

    @Test
    void testCompletelyNestedIntervals() {
        // Edge Case: The first interval completely encloses the second
        int[][] input = {{1, 4}, {2, 3}};
        int[][] expected = {{1, 4}};
        assertArrayEquals(expected, solver.merge(input));
    }

    @Test
    void testTouchingBoundaries() {
        // Edge Case: Intervals meet exactly at the same point
        int[][] input = {{1, 5}, {5, 10}};
        int[][] expected = {{1, 10}};
        assertArrayEquals(expected, solver.merge(input));
    }

    @Test
    void testUnsortedInput() {
        // Edge Case: Input is scrambled and relies heavily on sorting
        int[][] input = {{15, 18}, {8, 10}, {2, 6}, {1, 3}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, solver.merge(input));
    }

    @Test
    void testMultipleNestedAndOverlapping() {
        // Edge Case: Multiple combinations of nesting and standard overlaps
        int[][] input = {{1, 10}, {2, 3}, {4, 5}, {6, 7}, {8, 9}};
        int[][] expected = {{1, 10}};
        assertArrayEquals(expected, solver.merge(input));
    }

    @Test
    void testIdenticalIntervals() {
        // Edge Case: Duplicate intervals
        int[][] input = {{1, 4}, {1, 4}, {1, 4}};
        int[][] expected = {{1, 4}};
        assertArrayEquals(expected, solver.merge(input));
    }

    @Test
    void testSingleElementIntervals() {
        // Edge Case: Points instead of spans (start equals end)
        int[][] input = {{1, 1}, {1, 2}, {2, 2}};
        int[][] expected = {{1, 2}};
        assertArrayEquals(expected, solver.merge(input));
    }

    @Test
    void testSingleIntervalInput() {
        // Edge Case: Array contains exactly one interval
        int[][] input = {{5, 10}};
        int[][] expected = {{5, 10}};
        assertArrayEquals(expected, solver.merge(input));
    }

    @Test
    void testEmptyInput() {
        // Edge Case: No intervals provided
        int[][] input = {};
        int[][] expected = {};
        assertArrayEquals(expected, solver.merge(input));
    }

}
