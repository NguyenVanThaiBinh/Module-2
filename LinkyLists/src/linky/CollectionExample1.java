package linky;

import java.util.*;

class CollectionExample1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Binh");
        arrayList.add("Hu");
        arrayList.add("Mam");
        arrayList.add("Nem");
        System.out.println("ArrayList is: ");
        System.out.println("\t"+arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Uyen");
        linkedList.add("Beo");
        linkedList.add("Ngu");
        linkedList.add("Hoc");
        System.out.println("LinkedList is: ");
        System.out.print("\t" + linkedList + "\n");

        Set<String> hashSet = new HashSet<String>();
        hashSet.add("Ngu");
        hashSet.add("Hoc");
        hashSet.add("Uyen");
        hashSet.add("Ngu");
        System.out.println("HashSet is: ");
        System.out.println("\t"+hashSet);

        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows","2000");
        hashMap.put("Windows","XP");
        hashMap.put("Language2","Java");
        hashMap.put("Language2","Java");
        hashMap.put("Language1",".Net");
        System.out.println(hashMap);
    }
}