package ABC;
import java.util.*;
public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String>StudentMap=new HashMap<>();
		StudentMap.put(1,"kamal");
		StudentMap.put(2, "teja");
		StudentMap.put(3, "jai");
		StudentMap.remove(3);
		StudentMap.put(4,"lali");
		
		System.out.println(StudentMap);
		if(StudentMap.containsKey(7)) {
			System.out.println("key '1' exists with value:"+StudentMap.get(1));
	    
		}
		else {
			System.out.println ("\nAll key-value pairs:");
			for(Map.Entry<Integer,String>entry:StudentMap.entrySet()) {
				System.out.println("key:"+entry.getKey()+",Value:"+entry.getValue());
			
			}
			
}
		
		// TODO Auto-generated method stub

	}

}
