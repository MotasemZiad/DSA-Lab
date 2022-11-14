import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        Integer i = (Integer) list.iterator().next();
        System.out.println(i);

    }
}
