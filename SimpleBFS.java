package ABC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class SimpleBFS {
	public static void main(String[] args) {
		HashMap<String,List>house=new HashMap<String,List>();
		
		house.put("Living room",Arrays.asList("kitchen","Bathroom","studyroom"));
		
		house.put("kitchen",Arrays.asList("bathroom"));
		
		house.put("bedroom",Arrays.asList("balcony"));
		
		house.put("studyroom",new ArrayList<String>());
		
		house.put("bathroom",new ArrayList <String>());
		
		house.put("balcony",new ArrayList<String>() );
		
		System.out.println("exploring the house using BFS starting from living room");
		
		
	}
	public static void BFS(HashMap<String,List<String>>house,String startRoom) {
		Queue<String>queue=new LinkedList<>();
		Set<String>visited =new HashSet();
		queue.add(startRoom);
		visited.add(startRoom);
		 while(!queue.isEmpty()) {
			 String currentRoom=queue.poll();
			 System.out.println("visited:"+currentRoom);
			 for(String neighbor:house.get(currentRoom)) {
				 if(!visited.contains(neighbor)) {
					 queue.add(neighbor);
					 visited.add(neighbor);
				 }
			 }
			 
			 
		 }
		
		
		
				
		
		// TODO Auto-generated method stub

	}

}
