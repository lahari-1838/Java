package ABC;
import java.util.*;
public class graph {

	public static void main(String[] args) {
		Map<String,List<String>>graph=new HashMap<>();
		graph.put("Alice",Arrays.asList("Bob"));
	    graph.put("Bob",Arrays.asList("Alice","Charlie"));
		graph.put("Charlie",Arrays.asList("bob"));
		
		

	}

}
