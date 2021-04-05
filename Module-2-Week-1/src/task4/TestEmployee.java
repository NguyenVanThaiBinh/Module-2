package task4;

public class TestEmployee {
    public static void main(String[] args) {
        Employee em1 = new Employee(1,1000,"Binh","Hu");

        System.out.println(em1.getName());
        em1.setId(5);
        System.out.println(em1.toString());


    }
}
