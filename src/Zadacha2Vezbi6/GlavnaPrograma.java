package Zadacha2Vezbi6;

import java.util.ArrayList;
import java.util.List;

public class GlavnaPrograma {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Makedonija");
        lista.add("Albanija");
        lista.add("Grcija");
        lista.add("Turcija");
        lista.add("Bugarija");

        System.out.println("Dadenata listata sodrzhi "+ lista.size()+" elementi.");

        if(lista.size() == 3) {
            lista.add("Italija");
            lista.add("Srbija");

            System.out.println(lista);
        }
        else {
            System.out.println(lista);
        }
    }
}