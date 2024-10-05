
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        ArrayList  s = new ArrayList<>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add("Podi");
        s.add(40);
        s.add("Amit");
        s.add(null);




       ListIterator itr = s.listIterator();

      while(itr.hasNext()){
          System.out.println(itr.next());
      }
      System.out.println("====================================");

      while (itr.hasPrevious()){
          System.out.println(itr.previous());
      }



    }
}
