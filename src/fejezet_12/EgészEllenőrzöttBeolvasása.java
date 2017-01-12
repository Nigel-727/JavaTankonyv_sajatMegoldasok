package fejezet_12;

/**
 *
 * @author Nigel-727
 */
public class EgészEllenőrzöttBeolvasása {
  
  public static void main(String[] args) {
    System.out.println("Írja az egész számot befele most, de gyorsan, és nem ám betűt vagy törtet!!!");
    boolean vége = false;
    do {
      String próbaegész = extra.Console.readLine("? ");
      try { //egyébként fontos: _ciklusban ne_ legyen try
        Long.parseLong(próbaegész);
        System.out.println("OK");
        vége = true;
      }
      catch (Exception e) { //itt "NumberFormatException"
        System.out.println("\tNem jó ám a szám!");
      }
    } while (!vége);
  }
}
