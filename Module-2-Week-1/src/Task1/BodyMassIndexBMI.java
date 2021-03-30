import java.util.Scanner;

public class BodyMassIndexBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your weight :");
        double weight = scanner.nextDouble();
        System.out.println("Input your height :");
        double height = scanner.nextDouble();

        double bmi = weight/(Math.pow(height,2));

        if (bmi < 18)
            System.out.printf("%-20.9f%s", bmi, "Underweight");
        else if (bmi < 25.0){
            System.out.printf("%30.2f%s", bmi, "Normal \n");
            System.out.printf("%-20.2f%s", bmi, "Normal");
        }

        else if (bmi < 30.0)
            System.out.printf("%3.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
