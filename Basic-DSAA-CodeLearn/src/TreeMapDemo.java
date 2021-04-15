import java.util.*;


public class TreeMapDemo {


    public static void main(String args[]) {
        // khoi tao map
        TreeMap<String, String> map = new TreeMap<>();
        // them cac phan tu vao map
        map.put("J", "Java");
        map.put("C", "C++");
        map.put("P", "PHP");
        map.put("Py", "Python");
        // hien thi map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }




}