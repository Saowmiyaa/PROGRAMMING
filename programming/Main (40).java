import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(100);
        System.out.println("List: " + l);

        System.out.println("Even numbers:");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
