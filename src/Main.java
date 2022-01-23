import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    enum LiczbyEnum{
        JEDEN, DWA, TRZY, CZTERY, PIEC, SZESC
    }

    enum StatusEnum{
        KONTYNUUJEMY, KONIEC
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        while(true) {
            System.out.println("Podaj liczbe: ");
            int element = scan.nextInt();


            if (element == 0) {
                System.out.println(StatusEnum.KONIEC);
                break;
            } else {
                System.out.println(StatusEnum.KONTYNUUJEMY);
            }

            switch (element) {
                case 1 -> System.out.println(LiczbyEnum.JEDEN);
                case 2 -> System.out.println(LiczbyEnum.DWA);
                case 3 -> System.out.println(LiczbyEnum.TRZY);
                case 4 -> System.out.println(LiczbyEnum.CZTERY);
                case 5 -> System.out.println(LiczbyEnum.PIEC);
                case 6 -> System.out.println(LiczbyEnum.SZESC);
                default -> System.out.println("Liczba niepoprawna.");
            }
        }


        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
        * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

    }
}
