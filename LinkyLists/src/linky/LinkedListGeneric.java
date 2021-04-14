package linky;
 import java.util.*;
 class Student{
     String name;
     int age;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
     public String toString(){
         return "Student with name: "+this.name+" age: "+this.age;
     }
     public Student(){

     }
 }
public class LinkedListGeneric {
    public static void main(String[] args) {
        LinkedList<Student> listStudents = new LinkedList<>();

        Student student1 = new Student("Binh Hu",23);
        Student student2 = new Student("Phuong Uyen",23);
        Student student3 = new Student("Bin Laden",69);

        listStudents.add(student3);
        listStudents.add(student2);
        listStudents.add(student1);

        extracted(listStudents);


    }

    private static void extracted(LinkedList<Student> listStudents) {
        for (Student student: listStudents) {
            System.out.println(student.toString());
        }
    }

}
