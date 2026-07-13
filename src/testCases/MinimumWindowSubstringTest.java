package testCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capitalOne.MinimumWindowSubstring;

class MinimumWindowSubstringTest {

	private final MinimumWindowSubstring solution = new MinimumWindowSubstring();

    @Test
    void testStandardCase() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        assertEquals("BANC", solution.minWindow(s, t));
    }

    @Test
    void testSingleCharacterMatch() {
        String s = "a";
        String t = "a";
        assertEquals("a", solution.minWindow(s, t));
    }

    @Test
    void testNoMatchPossible() {
        String s = "a";
        String t = "aa";
        assertEquals("", solution.minWindow(s, t));
    }

    @Test
    void testDuplicatesInTarget() {
        String s = "AAADOBECODEBANC";
        String t = "AA";
        assertEquals("AA", solution.minWindow(s, t));
    }

    @Test
    void testTargetAtTheVeryEnd() {
        String s = "XYZBCAB";
        String t = "AB";
        assertEquals("AB", solution.minWindow(s, t));
    }

}
