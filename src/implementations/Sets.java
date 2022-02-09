package implementations;

import java.util.Arrays;
import java.util.*;

public class Sets {
    public static void main(String[] args) {
        String[] things = {"apple", "bob", "ham", "bob", "bacon"};
        List<String> list = Arrays.asList(things);

        System.out.printf("%s ", list);
        System.out.println();

        //using hashset to remove any duplicates within the given set
        Set<String> set = new HashSet<String>(list);
        System.out.printf("%s ", set);
    }
}
