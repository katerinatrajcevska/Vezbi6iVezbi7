package Zadacha11Vezbi6;

import java.util.ArrayList;
import java.util.List;

public class GlavnaPrograma {

    public static void main(String[] args) {
        List<String> l1 =  new ArrayList<String>();
        l1.add("Piperka");
        l1.add("Cveklo");
        l1.add("Zelka");

        List<String> l2 = new ArrayList<String>();
        l2.add("Piperka");
        l2.add("Cveklo");
        l2.add("Morkov");

        l1.retainAll(l2);

        System.out.println(l1);
    }
}
