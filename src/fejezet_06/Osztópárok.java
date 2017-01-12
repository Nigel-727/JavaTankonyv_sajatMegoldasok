package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class Osztópárok {

  public static void main(String[] args) {
    System.out.println("Egész szám pozitív osztópárjainak meghatározása");
    //ciklus 2-től a négyzetgyökig; ami osztható az a jó szám
    int szám = 1; //nem muszáj az értékadás 
    boolean ok = true; //szintén
    do {
      if (!(ok = 0 < (szám = extra.Console.readInt("szám = ? ")))) 
        System.out.println("Ejnye-bejnye, próbáld újra!");
    } while (!ok);
    //a szám négyzetgyökéig vizsgáljuk, mi osztja
    double négyzetgyök = Math.sqrt(szám);
    int i; //kívül, h a ciklus után is éljen
    for (i = 1; i <= négyzetgyök; i++) {
      if (0==szám%i) { //_i_ osztója a _szám_-nak
        System.out.println(""+i+" * "+(szám/i));
      }
    }
  }
}
