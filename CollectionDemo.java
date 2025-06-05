package ABC;
import java.util.*;

public class CollectionDemo {
    // Constructor
    public CollectionDemo() {
        System.out.println("CollectionDemo object created!");
    }

    public void demonstrateCollections() {
        //array list
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // 2. LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Frog");
        System.out.println("LinkedList: " + linkedList);

        // 3. HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Red"); // Duplicate element
        System.out.println("HashSet: " + hashSet);

        // 4. HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: " + hashMap);
    }

    public static void main(String[] args) {
        CollectionDemo demo = new CollectionDemo();
        demo.demonstrateCollections();
    }
}
