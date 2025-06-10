package ABC;
import java.util.*;
public class SocialcircleDFS {

	
	    private Map<String, List<String>> graph;

	    public SocialcircleDFS(Map<String, List<String>> graph) {
	        this.graph = graph;
	    }
	    public List<String> findSocialcircle(String person) {
	        List<String> result = new ArrayList<>();
	        Set<String> visited = new HashSet<>();
	        dfsRecursive(person, visited, result);
	        return result;
	    }
	    private void dfsRecursive(String node, Set<String> visited, List<String> result) {
	        if (visited.contains(node)) return;
	        visited.add(node);
	        result.add(node);

	        for (String neighbor : graph.getOrDefault(node, Collections.emptyList())) {
	            dfsRecursive(neighbor, visited, result);
	        }
	    }
	    public List<String> findSocialcircleIterative(String person) {
	        List<String> result = new ArrayList<>();
	        Set<String> visited = new HashSet<>();
	        Deque<String> stack = new ArrayDeque<>();

	        stack.push(person);
	        visited.add(person);

	        while (!stack.isEmpty()) {
	            String node = stack.pop();
	            result.add(node);

	            for (String neighbor : graph.getOrDefault(node, Collections.emptyList())) {
	                if (!visited.contains(neighbor)) {
	                    visited.add(neighbor);
	                    stack.push(neighbor);
	                }
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Map<String, List<String>> graph = new HashMap<>();
	        graph.put("Alice", Arrays.asList("Bob", "Carol"));
	        graph.put("Bob", Arrays.asList("Alice", "Dave"));
	        graph.put("Carol", Arrays.asList("Alice"));
	        graph.put("Dave", Arrays.asList("Bob"));
	        graph.put("Eve", Arrays.asList("Frank"));        
	        graph.put("Frank", Arrays.asList("Eve"));

	        SocialcircleDFS sc = new SocialcircleDFS(graph);

	        System.out.println("Recursive from Alice: " + sc.findSocialcircle("Alice"));
	        System.out.println("Iterative from Alice: " + sc.findSocialcircleIterative("Alice"));
	        System.out.println("Recursive from Eve: "   + sc.findSocialcircle("Eve"));;
	        System.out.println("Iterative from Eve: "   + sc.findSocialcircleIterative("Eve"));;
	    }
}