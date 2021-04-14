import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Java_7 {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int n = scanner.nextInt();
        // khởi tạo arr
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();
        }
        // tìm số lần xuất hiện của các phần tử
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            addElement(map, arr[i]);
        }
        for (int key : map.keySet()) {//in mang
            System.out.println(key + " - " + map.get(key));
        }


    }


    public static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) { //kiểm tra đã tồn tại element trong maptree chưa
            int count = map.get(element) + 1; //nếu có thì thêm giá trị biến đếm count vào element của maptree
            map.put(element, count);
        } else {
            map.put(element, 1); //nếu không thì tạo giá trị mới và gán element = 1
        }
    }
}