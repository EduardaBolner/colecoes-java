public class ExemploMap {
  
}
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(33, "Bruno");
        hashMap.put(2, "Ana");
        hashMap.put(1, "Daniel");
        hashMap.put(5, "Bruno");
        hashMap.put(4, "Carlos");
        hashMap.put(6, "Ana");

        System.out.println("HashMap:");
        System.out.println(hashMap);

        System.out.println();

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(33, "Bruno");
        linkedHashMap.put(2, "Ana");
        linkedHashMap.put(1, "Daniel");
        linkedHashMap.put(5, "Bruno");
        linkedHashMap.put(4, "Carlos");
        linkedHashMap.put(6, "Ana");

        System.out.println("LinkedHashMap:");
        System.out.println(linkedHashMap);

        System.out.println();

        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(33, "Daniel");
        treeMap.put(2, "Bruno");
        treeMap.put(1, "Ana");
        treeMap.put(5, "Ana");
        treeMap.put(4, "Carlos");
        treeMap.put(6, "Bruno");

        System.out.println("TreeMap:");
        System.out.println(treeMap);
    }
}
