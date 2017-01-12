package fejezet_08;

public class Kenó1 {
  
  public static void main(String[] args) {
    System.out.println("Kenó1");
    //10 db számot húznak, mind 1..80 tartományban
    //logikai tömbbel kell
    final int ENNYISZÁMBÓLDB = 80;
    boolean[] kihúzva = new boolean[ENNYISZÁMBÓLDB];
    for (int i = 0; i < kihúzva.length; i++) {
      kihúzva[i] = false;
    }
    int jóDb = 0;
    final int ENNYIKELLDB = 10;
    while (jóDb < ENNYIKELLDB ) {
      int vél = (int)(Math.random()*kihúzva.length);
      if (!kihúzva[vél]) {
        kihúzva[vél] = true;
        jóDb++;
      }
    }
    System.out.println("A kenó nyerőszámai emelkedő számsorrendben:");
    for (int i = 0; i < kihúzva.length; i++) {
      if (kihúzva[i])
              System.out.print(i+1+" ");
    }
    System.out.println();
  }
}
