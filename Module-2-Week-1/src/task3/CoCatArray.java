package task3;

public class CoCatArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = new int[6];
        for(int i = 0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for(int i = 0;i<arr2.length;i++){
            arr3[i+3] = arr2[i];
        }
        for (int x:arr3
             ) {
            System.out.print(x +" ");

        }
    }
}
