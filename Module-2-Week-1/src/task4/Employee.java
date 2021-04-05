package task4;

public class Employee {
    public Employee(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Employee(){

    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    int id, salary;
    String firstName, lastName;

    public String getName() {
        return "First name is: " + this.firstName + "  \nLast name: " + this.lastName;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }
    public int raiseSalary(int percent){
        return this.salary*percent;
    }
    public String toString(){
        return "Employee Id: "+this.id +" name: "+this.firstName+
                " "+this.lastName+" Salary: "+this.salary;
    }
}
