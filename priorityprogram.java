package ABC;
import java.util.*;
public class priorityprogram {

	public static void main(String[] args) {
		Thread lowPriorityThread=new Thread(()->{
		for(int i=1;i<=5;i++) {
			System.out.println("Low Priority Thread"+i);
		}});
		// TODO Auto-generated method stub

	Thread highpriorityThread=new Thread(()->{
		for(int i=1;i<=5;i++) {
			System.out.println("High Priority Thread"+i);
		}});
		lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
		highpriorityThread.setPriority(Thread.MAX_PRIORITY);
		lowPriorityThread.start();
		highpriorityThread.start();
		
	}

}


