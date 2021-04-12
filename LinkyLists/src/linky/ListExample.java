package linky;


import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Binh");
        list.add("Hu");
        list.add("Ga");


        ListIterator<String> itr = list.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-------");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
