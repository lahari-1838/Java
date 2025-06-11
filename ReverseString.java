package ABC;
import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		ArrayList<String>words=new ArrayList<>();
		words.add("Ammu");
		words.add("Lms");
		words.add("Yv");
		
		Collections.reverse(words);
		System.out.println("Reversed words:"+words);
	}

}
