package fejezet_12;

/**
 *
 * @author Nigel-727
 */
public class SzövegekTömbje { //12.4.7
  public static void main(String[] args) {
    String[] tömb = new String[10];
    boolean vége = false;
    int tömbIndex = 0;
    String VÉGJEL = "";
    do 
      try {
        String újSzöveg = extra.Console.readLine(": ");
        if (!(újSzöveg.equals(VÉGJEL))) {
          tömb[tömbIndex++]=újSzöveg;
          if (tömbIndex==tömb.length)
            throw new RuntimeException("Qrvára betelt a tömb!!!");
        }
        else
          vége=true;
      } 
      catch(RuntimeException rtE) {
        vége=true; //és semmi más nem történik, pl a hibaüzenet szövegét sem írjuk ki
//        System.out.println(rtE.getMessage()); //amikor mégis
      }
    while (!vége);
    //
    System.out.println();
    if(tömbIndex==0)
      System.out.println("Nincs beolvasott szöveg.");
    else {
      System.out.println("A beolvasott szöveg(ek):");
      for(int i=0; i<tömbIndex; i++)
        System.out.println(tömb[i]);
    }
  } //main()
}
