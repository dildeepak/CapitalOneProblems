package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFSExampleRecursive {

	public static void main(String[] args) {

		Map<String, List<String>> graph= new HashMap<>();
		
		graph.put("A", Arrays.asList("B","C"));
		graph.put("B", Arrays.asList("D"));
		graph.put("C", Arrays.asList("E"));
		graph.put("D", new ArrayList<>());
		graph.put("E", new ArrayList<>());
		
		Set<String> visited= new HashSet<>();
		
		dfs(graph,"A",visited);
	}

	private static void dfs(Map<String, List<String>> graph, String current, Set<String> visited) {

		if(visited.contains(current)) {
			return;
		}
		visited.add(current);
		System.out.println(current);
		
		for(String neighbor: graph.getOrDefault(current, new ArrayList<>())) {
			dfs(graph,neighbor,visited);
		}
	}

}
