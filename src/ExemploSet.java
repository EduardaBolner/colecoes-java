public class ExemploSet {
  
}
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Bruno");
        hashSet.add("Ana");
        hashSet.add("Daniel");
        hashSet.add("Bruno");
        hashSet.add("Carlos");
        hashSet.add("Ana");

        System.out.println("HashSet:");
        System.out.println(hashSet);

        System.out.println();

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Bruno");
        linkedHashSet.add("Ana");
        linkedHashSet.add("Daniel");
        linkedHashSet.add("Bruno");
        linkedHashSet.add("Carlos");
        linkedHashSet.add("Ana");

        System.out.println("LinkedHashSet:");
        System.out.println(linkedHashSet);

        System.out.println();

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Bruno");
        treeSet.add("Ana");
        treeSet.add("Daniel");
        treeSet.add("Bruno");
        treeSet.add("Carlos");
        treeSet.add("Ana");

        System.out.println("TreeSet:");
        System.out.println(treeSet);
    }
}