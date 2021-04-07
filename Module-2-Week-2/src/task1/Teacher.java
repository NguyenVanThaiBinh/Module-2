package task1;

public class Teacher extends Person{
   public Teacher(String name,int age,String address,int salary){
       super(name, age, address);
       this.salary = salary;
   }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void display(){
       super.display();
        System.out.println("Salary: "+this.salary);
    }

    int salary;

}
