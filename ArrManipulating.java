package ABC;

import java.util.ArrayList;
import java.util.Collections;

public class ArrManipulating {
	public static void main(String[] args) {
		ArrayList<String> students=new ArrayList<String>();
		students.add("kamal");
		students.add("latha");
		students.add("kamali");
		students.add("jai");
		students.add("malini");
		students.add("charlie");
		students.add("Alice");
		students.add("bob");
		students.add("teja");
		students.add("sarayu");
		Collections.sort(students);
                students.remove(3);
		students.remove("Alice");
		for(int i=0;i<students.size();i++) {
		System.out.println(students.get(i));

	}
	
	}
}
