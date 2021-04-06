package task5;

public class Student {

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        if (score < 0) {
            this.score = 0;
        } else if (score > 10) {
            this.score = 10;
        } else {
            this.score = score;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private int id,age,score;

    public Student(int id, int age, int score, String name, String address) {
        this.id = id;
        this.age = age;
        this.score = score;
        this.name = name;
        this.address = address;
    }

    private String name,address;
    public Student(){

    }


}