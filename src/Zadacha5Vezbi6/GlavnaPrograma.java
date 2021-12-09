package Zadacha5Vezbi6;
import java.util.ArrayList;
import java.util.List;
public class GlavnaPrograma {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.add(20);
        lista.add(25);

        System.out.println("Vtoriot element vo dadenata lista e: "+lista.get(1));
    }
}
