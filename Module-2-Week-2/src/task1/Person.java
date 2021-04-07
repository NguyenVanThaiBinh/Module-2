package task1;

public class Person {
    private String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }

}

