package Task2;

public class ShowStarShap {
    public static void main(String[] args) {
        System.out.println("Draw the square");
        for(int i = 5; i>= 1;i--){
            for(int j = 0 ; j <= 5;j++){
                System.out.printf("* ");
            }
            System.out.println("");
        }

        System.out.println("");
        int n =5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.printf(".");
            for(int j=1;j<=2*i-1;j++) // để in ra 1-3-5...
                System.out.printf("*");
            System.out.println("");
        }
    }
}
