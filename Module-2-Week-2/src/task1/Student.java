package task1;

class Student extends Person {
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

   private double gpa;

    public Student(String name, int age, String address, double gpa) {
        super(name,age,address);
        this.gpa = gpa;
    }
    public void dispay(){
        super.display();
        System.out.println("GPA: "+this.gpa);
    }

}
