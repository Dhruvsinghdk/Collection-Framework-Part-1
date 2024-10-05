import java.util.*;


public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        System.out.println(s.size());
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        System.out.println(s.size());
        s.remove(3);

        System.out.println(s);
        System.out.println(s.size());

    }
}
