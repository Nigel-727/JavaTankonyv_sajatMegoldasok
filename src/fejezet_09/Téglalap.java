/*
 * A Téglalap2 osztály használja az itt készült osztályt
 * Nincs benne main() !
 */
package fejezet_09;
/**
 *
 * @author Nigel-727
 */
public class Téglalap {
  //példány-adattagok:
  private double a, b; //privát példány-adattagok
  //példány-metódusok:
  public Téglalap(double a, double b) { //konstruktor
    setAB(a, b);
  }
  public void setAB (double a, double b) {
    if (0<a && 0<b) {
      this.a = a; this.b = b;
    } else {
      this.a = 1; this.b = 2; //most nem vacakolunk annak eldöntésével h melyik volt a hibás adat
    }
  }
  public double getA() {
    return a;
  }
  public double getB() {
    return b;
  }
  public double kerület() {
    return 2*a+2*b;
  }
  public double terület() {
    return a*b;
  }
  public String toString() {
    return "Téglalap ("
            + "a: " + a + ", "
            + "b: " + b
            + ")";
  }
  public boolean equals(Téglalap tégla) {
    double a1=tégla.getA(); double b1=tégla.getB();
    return a==a1 ? b==b1 : a==b1 ? b==a1 : false;
  }
} //class Téglalap