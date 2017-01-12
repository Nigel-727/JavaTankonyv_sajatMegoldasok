package fejezet_08;

public class MelyikbőlVanTöbb {

  private static int[] tömb = new int[6];
//  private static int[] tömb = new int[30];
//  private static int[] tömb = new int[300]; //<-ezt kéri a feladatspecifikáció
  
  private static void kiírTömb() { //csúnya, tudom
    for (int i = 0; i < tömb.length; i++) {
      System.out.print(
              extra.Format.right(tömb[i], 3)
              + (0!=(i+1)%25 ? " " : "\n") //sortörés minden 25. szám után
      );
    }
    System.out.println("");
  }
  
  public static void main(String[] args) {
    System.out.println("\"MelyikbőlVanTöbb\"");
    for (int i = 0; i < tömb.length; i++) {
      tömb[i] = (int)(Math.random()*101-50);
    }
    //teszt kiírás
    kiírTömb();
    //megszámolás
    short pozDb = 0, negDb = 0;
    for (int i = 0; i < tömb.length; i++) {
      int x = tömb[i];
      if (x < 0)
        negDb++;
      else if (x > 0)
        pozDb++;
      //a 0-kat nem számoljuk sehová
    }
    //megmondjuk az eredményt:
    short különbség = (short) (pozDb - negDb);
    System.out.println("Ebből van több: "
            + (0<különbség ? "pozitív számból" : különbség<0 ? "negatív számból" : "egyenlőek")            
    );
  } //main
  
}
