public class Student {

    private Osoba osoba;
    private Wydzialenum wydzial;

    public Student() {

    }

    public Student(Osoba osoba, Wydzialenum wydzial) {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public Wydzialenum getwydzial() {
        return wydzial;
    }

    public void setOsoba(Osoba osoba){
        this.osoba = osoba;
    }

    public void setWydzial(Wydzialenum wydzial){
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        return "Student [" + osoba + ", wydzial: " + wydzial + "]";
    }

}
        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */