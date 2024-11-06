package lab6;
import java.util.HashSet;
public class AppendHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("HashSet before appending: " + set);

        String newElement = "Mango";

        set.add(newElement);

        System.out.println("HashSet after appending: " + set);
    }
}
