import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeueTest {
    public static void main(String... args) {

        ArrayDeque<String> aq = new ArrayDeque<String>();
        aq.add("A");
        aq.add("B");
        aq.add("C");

        //offerFirst-adds elements at the front of the ArrayDeque
        aq.offerFirst("D");

        //offerLast inserts the element at the last of ArrayDeque
        aq.offerLast("E");

        String x = aq.descendingIterator().next();
        System.out.println("x =" +  x);

        Iterator<String> itr = aq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        String l = aq.pop();
        System.out.println(l);

        System.out.println("----------------------------");

         itr = aq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        aq.removeLast();


    }
}