import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
//a)
        Punkt punktA = new Punkt(7);
        punktA.toString();
        System.out.println("punktA: " + punktA);
//b)
        punktA = new Punkt(1, 2, 3);
        punktA.toString();
        System.out.println("\npunktA: " + punktA);
//c)
        punktA.setpX(100);
        punktA.setpY(100);
        punktA.setpZ(100);

        punktA.toString();
//d)
        System.out.println("\npX: " + punktA.getpX() + "\npY: " + punktA.getpY() + "\npZ: " + punktA.getpZ());
//e)
        System.out.printf("\nx = %d, y = %d z = %d\n", punktA.getpX(), punktA.getpY(), punktA.getpZ());

        System.out.println("\nsuma dla pkt A: " + punktA.suma());

        System.out.println("r1 dla pkt A:" + punktA.roznica());

        System.out.println("r2 dla pkt A:" + punktA.roznica(punktA.getpX(), punktA.getpY(), punktA.getpZ()));
    }
}
