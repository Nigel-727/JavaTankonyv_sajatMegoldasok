/*
 * Ismételjük át amit az objektumokról tizennyolc éve tanultunk
 */

package fejezet_09;

public class Háromszög3 {

  //privát osztály-adattag(ok):
  private static Háromszög 
          háromszög1, háromszög2, háromszög3;
  //publikus osztály-metódus:
  public static void main(String[] args) {
    System.out.println("Műveletek =oldalú 3szögeket +valósító objektumokkal\n");
    //
    háromszög1 = new Háromszög(15);
    System.out.println("A háromszög1 objektum osztálya: " 
            + háromszög1.getClass()); //class [packagename.Classname]
    System.out.println("A háromszög1 objektum osztályának ősosztálya: "
            + háromszög1.getClass().getSuperclass()); //őstől örökölt a... függvény, amivel...
    System.out.println("hárömszög1\n oldalhossza: "
            + háromszög1.getOldalhossz());
    System.out.println(" kerülete: "+háromszög1.kerület());
    System.out.println(" területe: "+háromszög1.terület());
    System.out.println("A háromszög1 objektum megszólítva:\n"
            + háromszög1); //toString() hívása
    System.out.println("háromszög1 oldalának módosítási kísérlete -3-ra...");
    háromszög1.setOldalhossz(-3);
    System.out.println("A háromszög1 objektum toString() metódusának meghívása:\n"
            + háromszög1.toString());
    //
    háromszög2 = new Háromszög(10.5); //zaklassunk mást is
    System.out.println("\nA háromszög2 objektum megszólítva:\n"
            + háromszög2);
    System.out.println("Megyegyezik-e a két háromszög "
            + "(háromszög1 és háromszög2)? "
            + (háromszög1.equals(háromszög2)?"igen":"nem"));
    //
    háromszög3 = new Háromszög(1); //még egy játszótárs
    System.out.println("\nA háromszög3 objektum megszólítva:\n"
            + háromszög3);
    System.out.println("Megyegyezik-e a két háromszög "
            + "(háromszög1 és háromszög3)? "
            + (háromszög1.equals(háromszög3)?"igen":"nem")); //jah, most már
  }
} //class Háromszög3

//lehetne akár külön .java fájlban is:
class Háromszög {
  private double oldalhossz; //privát példány-adattag
  public Háromszög(double a) { //publikus konstruktor, 1 db valós argumentummal
    setOldalhossz(a);
  }
  public void setOldalhossz(double oldalhossz) { //"setter" metódus a privát adattagok beállításához
    if (oldalhossz<=0)
      oldalhossz=1;
    this.oldalhossz = oldalhossz; 
  }      
  public double getOldalhossz() {
    return oldalhossz;
  }
  public double kerület() {
    return 3*oldalhossz; 
  }
  public double terület() {
    return oldalhossz*oldalhossz*Math.sqrt(3)/4;
  }
  @Override //egy _felülírt_ metódus definíciója következik:
  public String toString() {
    return "\"Hozzám szóltál?!?! (toString()) Én lenni egyenlőoldalú háromszög!\n" 
            + " oldalaim hossza: " + oldalhossz 
            + " kerületem " + extra.Format.left(kerület(), 0, 2) 
            + " területem: " + extra.Format.left(terület(), 0, 2) 
            + "\"";
  }
  //Na de ezt most hogy...? mikor kellene _@Override_? 
  //mi az alaphelyzet, általában mire használjuk az equals-t?
  public boolean equals(Háromszög $szög) {
    return $szög.getOldalhossz() == oldalhossz;
  }
} //class Háromszög