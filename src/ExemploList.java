import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Bruno");
        arrayList.add("Ana");
        arrayList.add("Daniel");
        arrayList.add("Bruno");
        arrayList.add("Carlos");
        arrayList.add("Ana");

        System.out.println("ArrayList:");
        System.out.println(arrayList);

        System.out.println();

        List<String> linkedList = new LinkedList<>();

        linkedList.add("Bruno");
        linkedList.add("Ana");
        linkedList.add("Daniel");
        linkedList.add("Bruno");
        linkedList.add("Carlos");
        linkedList.add("Ana");

        System.out.println("LinkedList:");
        System.out.println(linkedList);
    }
}