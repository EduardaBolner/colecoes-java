public class ExemploQueue {
  
}
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        Queue<String> filaLinked = new LinkedList<>();

        filaLinked.add("Bruno");
        filaLinked.add("Ana");
        filaLinked.add("Daniel");
        filaLinked.add("Bruno");
        filaLinked.add("Carlos");
        filaLinked.add("Ana");

        System.out.println("LinkedList Queue:");
        System.out.println(filaLinked);

        System.out.println("Removido: " + filaLinked.poll());
        System.out.println("Removido: " + filaLinked.poll());

        System.out.println(filaLinked);

        System.out.println("\n--------------------\n");

        Queue<String> filaPriority = new PriorityQueue<>();

        filaPriority.add("Bruno");
        filaPriority.add("Ana");
        filaPriority.add("Daniel");
        filaPriority.add("Bruno");
        filaPriority.add("Carlos");
        filaPriority.add("Ana");

        System.out.println("PriorityQueue:");
        System.out.println(filaPriority);

        System.out.println("Removido: " + filaPriority.poll());
        System.out.println("Removido: " + filaPriority.poll());

        System.out.println(filaPriority);
    }
}