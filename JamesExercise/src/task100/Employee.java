package task100;

public class Employee extends Person{
    private int salary;
    public Employee(String name,String age,int salary){
        super(name, age);
        this.salary =salary;
    }


    @Override
    public void display() {
        System.out.println("Name: "+super.getName());
        System.out.println("Age: "+super.getAge());
        System.out.println("Salary: "+this.salary);
    }
}
