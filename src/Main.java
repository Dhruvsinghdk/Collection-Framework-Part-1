import java.util.*;


public class Main {
    public static void main(String[] args) {
       ArrayList<String> s = new ArrayList<>();
        System.out.println(s.size());
       s.add("Rohan");
       s.add("Amit");
       s.add("Podi");
       s.add("Soham");
       s.add("java");

        System.out.println(s.size());
        s.remove("Amit");
        s.remove(3);
        System.out.println(s);
        System.out.println(s.size());

    }
}
