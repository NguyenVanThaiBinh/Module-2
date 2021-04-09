package task100;
interface Fly {
     void getFly();
}
interface Jump{
    void getJump();
}
  class Person1 implements Fly,Jump{
    @Override
    public void getFly() {
        System.out.println("I can fly");
    }

    @Override
    public void getJump() {
        System.out.println("I can jump");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
    Person1 p1 = new Person1();
    p1.getFly();
    p1.getJump();

    }
}
