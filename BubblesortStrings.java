package ABC;
import java.util.*;
public class BubblesortStrings {
	public static void main(String[] args) {
		ArrayList<String> birds=new ArrayList<String>();
		birds.add("parrot");
		birds.add("sparrow");
		birds.add("cheeku");
		
		for (int i = 0; i < birds.size() - 1; i++) {
            for (int j = 0; j < birds.size() - i - 1; j++) {
                if (birds.get(j).compareTo(birds.get(j + 1)) > 0) {
                    // Swap birds[j] and birds[j + 1]
                    String temp = birds.get(j);
                    birds.set(j, birds.get(j + 1));
                    birds.set(j + 1, temp);
                }
            }
        }

        // Print sorted list
        System.out.println("Sorted birds list:");
        for (String bird : birds) {
            System.out.println(bird);
        }
    }
}
