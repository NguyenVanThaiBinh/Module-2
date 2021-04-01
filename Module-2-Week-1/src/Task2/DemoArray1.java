package Task2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DemoArray1 {
    public static int m (int...x) {
        int b = 0;
        for(int a:x){
            b+=a;
        }
        return b;
    }

    public static void main(String[] args) {
        int a []= {1,2,3};

        System.out.println(m(a));
//        String[] a = {"Jonh", "Mary", "Caly", "Tomy"};
//        Arrays.sort(a);
//        for(String x : a ){
//            System.out.println(x);
//        }

//        List<String> names = Arrays.asList("Khanh", "Thanh", "Dung"); // make stream
//
//        names.stream()
//                .filter(s -> s.startsWith("K"))
//                .forEach(System.out::println);

//        int[][] matrix = new int[3][3];
//        int [] [] maxtrix2 = {  {1,2,3},
//                                {4,5,6},
//                                {7,8,9}     };
//        int maxRow = 0,inDexOfMaxRow = 0;
//        for(int i = 0; i < maxtrix2.length; i++){
//            maxRow += maxtrix2[0][i];
//        }
//        System.out.println(maxRow);
//        for(int i = 1; i < maxtrix2.length; i++){
//            int totalRow = 0;
//            for(int j = 0; j < maxtrix2[i].length; j++){
//                totalRow += maxtrix2[i][j];
//            }
//            if(totalRow > maxRow){
//                maxRow = totalRow;
//                inDexOfMaxRow = i;
//            }
//        }
//        System.out.println("Row " + inDexOfMaxRow + " has the maximum sum of " + maxRow);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter " + matrix.length + " rows and " +
//                matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = input.nextInt();
//            }
//        }

    }
}
