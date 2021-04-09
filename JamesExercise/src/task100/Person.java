package task100;

public abstract class Person {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public abstract void display();
}