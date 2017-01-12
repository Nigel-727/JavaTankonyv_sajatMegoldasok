package fejezet_09;

/**
 *
 * @author Nigel-727 
 */
public class TengerimalacEgyNapja {
  public static void main(String[] args) {
    System.out.println("\"TengerimalacEgyNapja\"\n");
    Emlősállat házikedvencünk = new Emlősállat("tengerimalac", "Egon", 4);
    
    for (int óra = 0; óra < 24; óra++) {
      System.out.println(óra + " óra előtt " + házikedvencünk.név + ":\n"
              + házikedvencünk);
      System.out.print(óra + " órától " + házikedvencünk.név + " ");
      switch (óra) {        
        default:
          System.out.println("HARAP, ami után"); 
          házikedvencünk.név = "Sátánka";
//          házikedvencünk.lábDb--; //hiba; privát adattagot elérni nem lehet
          System.out.println(házikedvencünk);
          break;
        case 3: case 4: case 5: case 15: case 16: case 17:
          System.out.println("szaladgál, ami után");
          házikedvencünk.szaladgál(); 
          System.out.println(házikedvencünk);
          break;
        case 7: case 10: case 18: case 19: case 20: case 21:
          System.out.println("táplálkozik, ami után");
          házikedvencünk.táplálkozik();
          System.out.println(házikedvencünk);
          break;
        case 8: case 9: case 11: case 12: case 23: case 0: case 1: case 2:
          System.out.println("alszik, ami után");
          házikedvencünk.alszik();
          System.out.println(házikedvencünk);
          break;
        case 6: case 13: case 22:
          System.out.println("ürít, ami után");
          házikedvencünk.ürít();
          System.out.println(házikedvencünk);
      } //switch
      System.out.println
        ("-----------------------------------------------------------------------");
    } //for
  }
}

class Emlősállat {
  //példány-adattagok:
  private String faj;
  private int lábDb = 4; //létrehozáskor inicializáljuk
  private double tömeg;
  public String név; //mivel public, kívülről is módosítható
  //példány-metódusok:
  public Emlősállat(String f, String n, double t) {
    faj = f; név = n; tömeg = t;
  }
  public void táplálkozik() {
    tömeg += tömeg*
            (1.0/20-Math.random()/20); //a (0, 0.05] intervallumba esik    
  }
  public void ürít() {
    tömeg -= tömeg*(1.0/20-Math.random()/20); 
  }
  public void szaladgál() {
    tömeg -= tömeg*(1.0/10-Math.random()/10); // (0, 0.1] számok
  }
  public void alszik() {
    ;
  }
  public String toString() {
    return "Emlősállat ("
            + "faj: " + faj + ", "
            + "lábDb: " + lábDb + ", "
            + "név: \"" + név + "\", "
            + "tömeg: " + extra.Format.left(tömeg, 0, 3) 
            + ")";
  }
} //class Emlősállat