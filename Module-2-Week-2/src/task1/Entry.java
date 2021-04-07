package task1;

import javax.security.auth.Subject;

public class Entry {
    public static void main(String[] args) {
        SuperClass a = new Subclass();

        System.out.println(a.x);

        System.out.println(((Subclass)a).x);
    }
}

class SuperClass {
    int x = 10;
}

class Subclass extends SuperClass {
    int x = 20;
}

