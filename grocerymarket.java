package ABC;

import java.util.HashMap;

public class grocerymarket {

	public static void main(String[] args) {
		HashMap<String,Integer> grocery=new HashMap<>();
		grocery.put("choclate",100);
		grocery.put("toys",500);
		grocery.put("gems",60);
		
		// TODO Auto-generated method stub
		
		
		
		
		
		int sum=0;
		for(int values:grocery.values()){
			sum+=values;
		
		System.out.println(sum);
		grocery.replace("toys",500,600);
		grocery.remove("gems",60);
		System.out.println(grocery);
		

	}
	}
}

