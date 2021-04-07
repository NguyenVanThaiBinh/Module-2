package task1;

public class Account {
    private int balance = 0;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if(amount > balance){
            System.out.println("That amount exceeds your current balance");
            return;
        }
        balance -= amount;
    }
    public void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+ balance);
    }


}
