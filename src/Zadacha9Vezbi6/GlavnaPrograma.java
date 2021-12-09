package Zadacha9Vezbi6;

import java.util.ArrayList;
import java.util.List;
public class GlavnaPrograma {

    public static void main(String[] args) {
        List<Fakultet> lista = new ArrayList<Fakultet>();

        Fakultet f =  new Fakultet("FIKT",12,1000);
        lista.add(f);
        lista.add(new Fakultet("TFB", 7, 900));
        lista.add(new Fakultet("FEIT", 15, 1300));
        lista.add(new Fakultet("FINKI", 16, 1400));
        lista.add(new Fakultet("PMF", 8, 850));

        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getIme());
            System.out.println(lista.get(i).getBrojSmerovi());
            System.out.println(lista.get(i).getVkupnoStudenti());
        }
    }
}
