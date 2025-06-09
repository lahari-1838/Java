package ABC;
import java.util.*;
public class icecreamqueue {

	public static void main(String[] args) {
		Queue<String> kid=new LinkedList<String>();
		kid.add("anvi");
		kid.add("bablu");
		kid.add("cheechu");
		System.out.println(kid);
		System.out.println("first kid:"+kid.peek());
		
		String firstOut=kid.remove();
		System.out.println(firstOut);
		kid.add("lilli");
		System.out.println(kid);
		
		
		// TODO Auto-generated method stub

	}

}
