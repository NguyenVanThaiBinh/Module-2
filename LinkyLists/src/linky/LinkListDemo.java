package linky;

import java.util.*;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();
        linky.add("Binh");
        linky.add("Hu");
        linky.add("Mam");
        linky.add("Nem");


        Iterator itr = linky.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("");
        System.out.println("-------------");
        System.out.println("Update LinkList: ");
        linky.set(1, "NGU");
        Object[] arr = linky.toArray();
        for (Object obj : arr) {
            System.out.println(obj);

        }

    }


}
