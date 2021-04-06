package task5;

import java.time.LocalDate;
import java.time.Period;


public class MyClass {
    public  static int getAge(int year, int month, int dayOfMonth) {
        return Period.between(
                LocalDate.of(year, month, dayOfMonth),
                LocalDate.now()
        ).getYears();
    }
    public static   void main(String[] args) {

        System.out.println(getAge(1998,10,22));


    }

}




