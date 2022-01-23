import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student jeden = new Student();
            jeden.imie = "Ania";
            jeden.nazwisko = "Nowak";
            jeden.wiek = 21;
            jeden.statusStudent = true;

        Student dwa = new Student();
            dwa.imie = "Robert";
            dwa.nazwisko = "Kowalski";
            dwa.wiek = 25;
            dwa.statusStudent = false;

        Student trzy = new Student();
        trzy.imie = "Kasia";
        trzy.nazwisko = "Krol";
        trzy.wiek = 21;
        trzy.statusStudent = true;

        Student[] studenci = {jeden, dwa, trzy};

        for (Student student : studenci) {
            String absolwent;
            if (student.statusStudent) {
                absolwent = "Student " + student.imie + " " + student.nazwisko + " ma aktywny status studenta.";
            } else {
                absolwent = "Student " + student.imie + " " + student.nazwisko +" ma nieaktywny status studenta.";
            }
            System.out.println(student.imie + " " + student.nazwisko + ", wiek: " + student.wiek + "\n" + absolwent + "\n");
        }
    }
}
