package Zadacha5Vezbi7;
import java.util.Set;
import java.util.TreeSet;

public class GlavnaPrograma {

    public static void main(String[] args) {
        Set<String> mnozestvo1 = new TreeSet<String> ();
        mnozestvo1.add("Crvena");
        mnozestvo1.add("Zelena");
        mnozestvo1.add("Zholta");

        Set<String> mnozestvo2 = new TreeSet<String> ();
        mnozestvo2.add("Crvena");
        mnozestvo2.add("Crna");
        mnozestvo2.add("Zelena");

        System.out.println("Presekot od dvete mnozestva e:");
        mnozestvo1.retainAll(mnozestvo2);
        System.out.println(mnozestvo1);

        System.out.println("Unijata od dvete mnozestva e:");
        mnozestvo1.addAll(mnozestvo2);
        System.out.println(mnozestvo1);
    }
}
