package Task2;

public class DemoArray2 {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5};
//        for(int i =0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        int arr[]= new int[5];
        int []arr= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        for (int item : arr) {
            System.out.println(item);
        }


    }
}
