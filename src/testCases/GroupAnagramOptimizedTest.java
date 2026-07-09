/**
 * 
 */
package testCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import capitalOne.GroupAnagramsOptimized;

/**
 * @author dilde
 *
 */
class GroupAnagramOptimizedTest {
	
	 // Quick inline conversion: turns a List<List<String>> into a Set of sorted lists
    private Set<List<String>> toNormalizedSet(List<List<String>> list) {
        return list.stream()
                .map(inner -> inner.stream().sorted().collect(Collectors.toList()))
                .collect(Collectors.toSet());
    }

	@Test
    void testStandardCase() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        List<List<String>> actual = GroupAnagramsOptimized.groupAnagrams(input);
        
        // Define expected groups
        List<List<String>> expected = Arrays.asList(
            Arrays.asList("bat"),
            Arrays.asList("nat", "tan"),
            Arrays.asList("ate", "eat", "tea")
        );

        assertEquals(toNormalizedSet(expected), toNormalizedSet(actual), 
                "The correct groupings should match regardless of row or word order.");
      
    }
	
	@Test
    void testEmptyArrayInput() {
        String[] input = {};
        List<List<String>> actual = GroupAnagramsOptimized.groupAnagrams(input);
        
        assertTrue(actual.isEmpty(), "An empty array input should return an empty result list.");
    }
	
	@Test
    void testEmptyStringInput() {
        String[] input = {""};
        List<List<String>> actual = GroupAnagramsOptimized.groupAnagrams(input);
        
        List<List<String>> expectedSet = Arrays.asList(Arrays.asList(""));
        assertEquals(toNormalizedSet(expectedSet), toNormalizedSet(actual));
    }
	
	@Test
    void testAllIdenticalAnagrams() {
        String[] input = {"abc", "abc", "abc"};
        List<List<String>> actual = GroupAnagramsOptimized.groupAnagrams(input);
        
        List<List<String>> expectedSet = Arrays.asList(Arrays.asList("abc", "abc", "abc"));
        assertEquals(toNormalizedSet(expectedSet), toNormalizedSet(actual));
    }
	
	@Test
	void  testNoAnagramsPresent() {
		String[] input= {"cat" , "dog" , "bird"};
		List<List<String>> actual = GroupAnagramsOptimized.groupAnagrams(input);
		
		List<List<String>> expected = Arrays.asList(Arrays.asList("cat") , Arrays.asList("dog"), Arrays.asList("bird"));
		
		assertEquals(toNormalizedSet(expected),toNormalizedSet(actual));
	}
	
	  @Test
	    void testSingleCharacterInputs() {
	        String[] input = {"a"};
	        List<List<String>> actual = GroupAnagramsOptimized.groupAnagrams(input);
	        
	        List<List<String>> expectedSet = Arrays.asList(Arrays.asList("a"));
	        assertEquals(toNormalizedSet(expectedSet), toNormalizedSet(actual));
	    }

}
