package Zadacha10Vezbi6;

import java.util.ArrayList;
import java.util.List;
public class GlavnaPrograma {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Ananas");
        l1.add("Portokal");
        l1.add("Limon");
        List<String> l2 = new ArrayList<String>();
        l2.add("Kalinka");
        l2.add("Jabolko");
        l2.add("Praska");

        l1.addAll(l2);

        System.out.println(l1);
    }
}
