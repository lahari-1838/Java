package ABC;

public class zoograph {
	import java.util.*;

	
	    private Map<String, List<String>> graph;

	    public zoograph() {
	        graph = new HashMap<>();
	        buildGraph();
	    }

	    private void buildGraph() {
	        addEdge("Entrance", "Reptile House");
	        addEdge("Entrance", "Bird Sanctuary");
	        addEdge("Entrance", "Mammal Zone");
	        
	        addEdge("Reptile House", "Snake Pit");
	        
	        addEdge("Bird Sanctuary", "Parrot Pavilion");
	        
	        addEdge("Mammal Zone", "Lion Den");
	        addEdge("Mammal Zone", "Elephant Enclosure");
	    }

	    private void addEdge(String from, String to) {
	        graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
	        graph.putIfAbsent(to, new ArrayList<>()); // Ensure destination exists even if no further connections
	    }

	    public void printGraph() {
	        for (Map.Entry<String, List<String>> entry : graph.entrySet()) {
	            System.out.println(entry.getKey() + " connects to: " + entry.getValue());
	        }
	    }

	    public static void main(String[] args) {
	        zoograph zoograph = new zoograph();
	        zoograph.printGraph();
	    
	


}

