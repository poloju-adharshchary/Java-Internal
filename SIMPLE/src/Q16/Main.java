package Q16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("Java");
        a.add("Python");
        a.add("C");
        a.add("Java");

        System.out.println("ArrayList: " + a);

        a.add(1, "C++");
        System.out.println("After add: " + a);

        System.out.println("Element at index 2: " + a.get(2));

        a.set(0, "HTML");
        System.out.println("After set: " + a);

        a.remove("C");
        System.out.println("After remove: " + a);

        System.out.println("Contains Java: " + a.contains("Java"));
        System.out.println("Size: " + a.size());

        Collections.sort(a);
        System.out.println("After sorting: " + a);

        for (String s : a)
            System.out.println(s);

        a.clear();
        System.out.println("After clear: " + a);
    }
}
