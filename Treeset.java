package ABC;
import java.util.TreeSet;
import java.util.Treeset;
public class TreesetExample {
	public static void main(string[] args) {
		TreeSet<Integer> numbers = new Treeset<Integer>();
		numbers.add(50);
		numbers.add(20);
		numbers.add(40);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(60);
		System.out.println(numbers);
		System.out.println(numbers.first());
		System.out.println(numbers.higher(30));
	}
}
