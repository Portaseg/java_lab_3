import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        List<Student> studentList = new ArrayList<>();

        Student student = new Student(new Osoba("Artur","Nowak",1234),Wydzialenum.Chemii);
        studentList.add(student);
        student = new Student(new Osoba("Robert","Janowski",6347), Wydzialenum.Fizyki);
        studentList.add(student);
        student = new Student(new Osoba("Ania","Zietar",2367), Wydzialenum.Biologii);
        studentList.add(student);
        student = new Student(new Osoba("Kasia","Zajac",9123),Wydzialenum.Ekonomii);
        studentList.add(student);
        student = new Student(new Osoba("Lukasz","Deering",8123), Wydzialenum.Biologii);
        studentList.add(student);

        for (Student lista : studentList) {
            System.out.println(lista);
        }
      //  System.out.println(osoba1.toString()+ osoba2 + osoba3 + osoba4);


    }
}
