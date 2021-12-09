package Zadacha4Vezbi6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class GlavnaPrograma {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(80);
        lista.add(1200);
        lista.add(3);
        lista.add(16);
        lista.add(97);

        Collections.sort(lista);

        System.out.println(lista);
    }
}
