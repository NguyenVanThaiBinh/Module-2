package linky;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Binh");
        arrayList.add("Hu");
        arrayList.add("Mam");


        Iterator<String> itr =  arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
