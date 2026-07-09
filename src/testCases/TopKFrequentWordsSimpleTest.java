package testCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import capitalOne.TopKFrequentWordsSimple;

class TopKFrequentWordsSimpleTest {

	@Test
    void testStandardCaseWithTieBreaker() {
        // "i" appears 3 times, "love" appears 2 times, "my" ,"princess" & "coding" appears 1 time.
        // "my" ,"coding" and "princess" tie in frequency (1), but "coding" comes first alphabetically.
        String[] words = {"i", "love", "my", "princess", "i", "love", "coding"};
        int k = 2;
        
        List<String> expected = Arrays.asList("i", "love");
        List<String> actual = TopKFrequentWordsSimple.topKFrequent(words, k);
        
        assertEquals(expected, actual, "Should return the top 2 elements sorted by highest frequency.");
    }

    @Test
    void testPureAlphabeticalTieBreaker() {
        // Every single word appears exactly 4 times. 
        // The output must be sorted 100% alphabetically because frequencies are identical.
        String[] words = {
            "the", "day", "is", "sunny", "the", "the", "the", 
            "sunny", "sunny", "sunny", "is", "is", "is", "day", "day", "day"
        };
        int k = 4;
        
        // Alphabetical order: "day", "is", "sunny", "the"
        List<String> expected = Arrays.asList("day", "is", "sunny", "the");
        List<String> actual = TopKFrequentWordsSimple.topKFrequent(words, k);
        
        assertEquals(expected, actual, "When frequencies tie completely, sort order must be strictly alphabetical.");
    }

    @Test
    void testSingleElementArray() {
        // Edge Case: Only 1 word exists, k = 1
        String[] words = {"hello"};
        int k = 1;
        
        List<String> expected = Arrays.asList("hello");
        List<String> actual = TopKFrequentWordsSimple.topKFrequent(words, k);
        
        assertEquals(expected, actual);
    }

    @Test
    void testKEqualsTotalUniqueWords() {
        // Edge Case: k matches the total number of unique words in the array.
        String[] words = {"banana", "apple", "banana"};
        int k = 2;
        
        // "banana" (2 times) comes before "apple" (1 time)
        List<String> expected = Arrays.asList("banana", "apple");
        List<String> actual = TopKFrequentWordsSimple.topKFrequent(words, k);
        
        assertEquals(expected, actual);
    }

    @Test
    void testCaseSensitivity() {
        // Edge Case: Identical words with different capitalization are treated as unique keys.
        // "apple" (1 time), "Apple" (1 time). "Apple" comes before "apple" in ASCII lexicographical sorting.
        String[] words = {"apple", "Apple"};
        int k = 2;
        
        List<String> expected = Arrays.asList("Apple", "apple");
        List<String> actual = TopKFrequentWordsSimple.topKFrequent(words, k);
        
        assertEquals(expected, actual, "Uppercase letters should sort before lowercase letters natively.");
    }
}
