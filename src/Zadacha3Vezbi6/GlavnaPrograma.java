package Zadacha3Vezbi6;

import java.util.ArrayList;
import java.util.List;
public class GlavnaPrograma {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("INKI");
        lista.add("IKT");
        lista.add("KNI");
        System.out.println("Elementi pred da se dodade element na tretata pozicija vo listata se :");
        System.out.println(lista);

        lista.add(2, "MIS");
        System.out.println("Odkako ke se dodade element na treta pozicija vo lista, elementite se slednite:");
        System.out.println(lista);
    }
}
