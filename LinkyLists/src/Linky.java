import java.util.Iterator;
import java.util.LinkedList;

public class Linky {
    public static void main(String[] args) {
        LinkedList<Integer> linky =  new LinkedList();

        linky.add(6);
        linky.add(1);
        linky.add(9);

        Iterator  it = new linky.iterator();
        while(it.hasNext()){
            if ((int) it.next() == 1) {
                System.out.println("We dound 1");
            }
        }




    }
}
