import java.util.ListIterator;

public class Tester {

    public static void main(String[] args) {
        LinkedList<String> test = new LinkedList<String>();
        test.addFirst("one");
        test.addFirst("one");
        test.addFirst("one");

        System.out.println(test.getFirst());
        System.out.println(test.listIterator().hasPrevious());



    }


}
