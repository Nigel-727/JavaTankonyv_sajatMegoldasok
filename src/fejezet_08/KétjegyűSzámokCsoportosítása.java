package fejezet_08;

public class KétjegyűSzámokCsoportosítása {

  //utálom a literálokat, ezért bonyolítom a megoldást 
  //az alábbi mátrix tartalmazza a csoportok határait (alsó, felső)
  //(lehetne tömb is), de ebben a megoldásban nem akarok annyira általánosítani
  private static int[][] tartományhatárok  //{alsóH, felsőH} 
          = { {10,19}, {20,29}, {30,39}, {40,49}, //tfh. ez mind OK
            {50,59}, {60,69}, {70,79}, {80,89}, {90,99} };
  private static int[] tartománybanDb 
          = new int[tartományhatárok.length]; //számlálók tömbje
//  private static final int N = 200; //<-a feladatspecifikácóban
  private static final int N = 20;
  private static final int[] tömb = new int[N];
  
  public static void main(String[] args) {
    System.out.println("Feladatspecifikáció bölcsésznyelven: bla, bla, bla");
    //adatbevitel (random ezúttal):
    for (int i = 0; i < N; i++) 
      tömb[i] = (int)(Math.random()*90+10); //90 db kétjegyű [10..99]
    //inicializálás (tömb)
    for (int i: tartománybanDb)
      tartománybanDb[i] = 0; //nullázás foreach-csel(!?)
    //adatfeldolgozás:
    for (int i = 0; i < N; i++) { //végig a tömb elemein
      //kiválasztás tétel (MELYIK tartományba esik az érték)
      int j = 0;
      while (!
              (tartományhatárok[j][0]<=tömb[i] && tömb[i]<=tartományhatárok[j][1])
      ) 
        j++;
      tartománybanDb[j]++;
    }
    //output
    System.out.println("A tömb elemei:");
    for (int i = 0; i < N; i++) 
      System.out.print(
              tömb[i] 
                      + (!(0==(i+1)%15) ? " " : "\n")
      );
    System.out.println();
    //
    for (int i = 0; i < tartományhatárok.length; i++) 
      System.out.println("- "
              +tartományhatárok[i][0] + "-"
              +tartományhatárok[i][1] 
              +" csoportban "
              +tartománybanDb[i] + " szám található."
      );
  } //main()
}
