package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSExample {

	public static void main(String[] args) {

		Map<String, List<String>> graph= new HashMap<>();
		
		graph.put("A", Arrays.asList("B","C"));
		graph.put("B", Arrays.asList("D"));
		graph.put("C", Arrays.asList("E"));
		graph.put("D", new ArrayList<>());
		graph.put("E", new ArrayList<>());
		
		bfs(graph, "A");
	}
	private static void bfs(Map<String,List<String>> graph, String start) {
		
		Queue<String> queue= new LinkedList<>();
		Set<String> visited=new HashSet<>();
		
		queue.offer(start);
		visited.add(start);
		
		while(!queue.isEmpty()) {
			String current=queue.poll();
			System.out.println(current);
			
			for(String neighbor:graph.getOrDefault(current, new ArrayList<>())) {
				if(!visited.contains(neighbor)) {
					visited.add(neighbor);
					queue.offer(neighbor);
				}
			}
		}
		
	}

}
