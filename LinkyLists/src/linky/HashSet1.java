package linky;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Binh");
        set.add("Hu");
        set.add("Mam");
        set.add("Nem");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + ", ");
        }

        System.out.println("------+----");
        for (String obj : set) {
            System.out.println(obj + ", ");

        }
    }
}
