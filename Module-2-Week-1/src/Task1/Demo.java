package Task1;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong 5");
        for(int i = 0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println("");

        }
        System.out.println("");
        for(int i = 5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");

            }
            System.out.println("");

        }
        System.out.println("");
        int n =6;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++)
                System.out.print(" ");

            for(int j = 1; j <= i; j++)
                System.out.print(" *");

            System.out.println("");
        }
    }
}
