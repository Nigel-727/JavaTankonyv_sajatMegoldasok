package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class PárosPáratlanÖsszegDb {
  public static void main(String[] args) {
    System.out.println("Adjon meg két számot,"
            + "\nmegszámolom hány páros ill. páratlan szám van köztük, "
            + "vmint ezek összegét is");
    int a = extra.Console.readInt("1. egész = ? "),
        b = extra.Console.readInt("2. egész = ? ");
    if (!(a<b))
      System.out.println("Hibás intervallumhatárok!");
    else {
      int párosDb, páratlanDb, párosÖsszeg, páratlanÖsszeg;
      párosDb = páratlanDb = párosÖsszeg = páratlanÖsszeg = 0;
      for (int i = a; i <= b; i++) {
        if (0==i%2) {
          párosDb++;
          párosÖsszeg+=i;
        }
        else {
          páratlanDb++;
          páratlanÖsszeg+=i;
        }
      }
      System.out.println(a+" és "+b+" közötti\n"
              + "párosak száma: "+párosDb+" , páratlanok száma: "+páratlanDb
              + "\npárosak összege: "+párosÖsszeg+" , páratlanok összege: "+páratlanÖsszeg);
    }
  }
}
