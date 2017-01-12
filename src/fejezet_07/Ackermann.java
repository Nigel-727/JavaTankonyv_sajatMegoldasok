package fejezet_07;

public class Ackermann {
  
  public static void main(String[] args) {
    System.out.println("Ackermann-függvény rekurzív megvalósítása");
    System.out.println(""+ackermann(3,2));
    System.out.println(""+ackermann(2,3));
    System.out.println(""+ackermann(0,4));
    System.out.println(""+ackermann(4,0));
    System.out.println(""+ackermann(3, 4));
    System.out.println(""+ackermann(4,1));
  }

  private static long ackermann(int m, long n) { //m: sor; n: oszlop
    if (m < 0 || n < 0)
      return -1; // TODO: legalább kivételt dobni vagy vmi
    else if (m == 0) // A 0. sorban... ; az else sehol nem volna muszáj
      return n + 1; // ...oszlopindex + 1.
    else if (n == 0) // A 0. oszlopban (kivéve a 0. sort)
      return ackermann(m - 1, 1); // előző sor 1. oszlop
    else
      return ackermann(m - 1, // előző sor
              ackermann(m, n - 1)); // képlettel számított oszlop: ugyanazon sor, előző oszlop
  }
}
