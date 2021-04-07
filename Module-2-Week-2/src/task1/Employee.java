package task1;

public class Employee extends Person{
    private int salary;
    public Employee(String name,String address,int salary){
        super(name,address);
        this.salary = salary;
    }
    public void display(){
        super.display();
        System.out.println("Salary: "+salary);
    }
}