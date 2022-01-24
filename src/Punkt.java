/* klasa Punkt */
public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */

    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    private int pX, pY, pZ;

    //pusty constr
        Punkt() {
        }

    // constr pX
        Punkt(int pX) {
            this.pX = pX;
        }

    //constr z wieloma zmiennymi
    Punkt(int pX, int pY, int pZ) {
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }

    //gettery
        public int getpX() {
            return pX;
        }
        public int getpY() {
            return pY;
        }

        //getter do zmiennej pZ niech zwraca return pZ * 10
        public int getpZ() {
            return pZ*10;
        }

    //settery
        public void setpX(int pX) {
            this.pX = pX;
        }
        public void setpY(int pY) {
            this.pY = pY;
        }
        public void setpZ(int pZ) {
            this.pZ = pZ;
        }


    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */

        public int suma(){
            return pX + pY + getpZ();
        }

        public int roznica(){
            return pX - pY - getpZ();
        }

        public int roznica(int x, int y, int z){
            return pX * x - pY * y - getpZ() * z;
        }

       @Override
       public String toString() {
           return "Punkt = {" + "x= " + pX + ", " + "y= " + pY + "z= " + getpZ() + "}";
    }
}
