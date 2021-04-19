package DSA_James_Exerice;

import java.util.Stack;

public class ReverseArrayByStack {
    public static void main(String[] args) {

        // reverse intger array
        int[] arr = {1, 2, 3, 4, 5};
        Stack<Integer> Sstack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            Sstack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sstack.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }





    }
}
