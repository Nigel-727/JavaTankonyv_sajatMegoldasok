package fejezet_08;

public class LeggyakoribbSzám {
  
  //Ezúttal legyenek globális változók (De miért épp most? Csak úgy!)
//  static private final int N = 300; //<- a feladatspecifikációban
  static private final int N = 25; 
  static private int[] tömb = new int[N];
  static private final int ALSÓ_H = -50;
  static private final int FELSŐ_H = +50;
  static private final int SORHOSSZ = 10; //outputhoz
  
  public static void main(String[] args) {
    tömb = véletlentömb(N, ALSÓ_H, FELSŐ_H); //N elemű tömböt véletlen int-ekkel két határ között
    kiírTömb(tömb);
    //int számlálótömb[számoldandó értékek száma]; +indextranszformáció kell h ne legyenek negatív indexek
    //(ezzel pluszmunkát csinálunk magunknak, nem volna muszáj tömbben tárolni az előfordulásokat)
    int[] előfordulások = new int[FELSŐ_H - ALSÓ_H + 1];
    //inicializálás
    for (int i = 0; i < előfordulások.length; i++) 
      előfordulások[i] = 0;
    //az ALGORITMUS
    for (int i = 0; i < tömb.length; i++)  //megszámolás programozási tétel
      előfordulások[tömb[i]-ALSÓ_H]++; //indextranszformáció (befelé, a program felé):...
    //...-50-(-50)=0; -49-(-50)=1; 50-(-50)=100; stb
    //maximumkiválasztás programozási tétel:
    int maxHely = 0; //a maximum elem indexe - kezdetben legyen az első elem
    for (int i = 1; i < előfordulások.length; i++)  //az 1. indextől (második elem) kezdünk
      if (előfordulások[maxHely] < előfordulások[i])
        maxHely = i;
    System.out.println("A leggyakrabban előforduló szám: "
            + (maxHely+ALSÓ_H)  //indextranszformáció (visszafelé); MELYIK
            + " (" + előfordulások[maxHely] + " db)" //mi az ÉRTÉKE
    );
  } //main()

  private static int[] véletlentömb(int n, int minért, int maxért) {
    int[] retval = new int[n];
    for (int i = 0; i < retval.length; i++) {
      retval[i] = (int)(Math.random()*(maxért-minért+1)+minért);
    }
    return retval;    
  } //véletlentömb()

  private static void kiírTömb(int[] t) {
    for (int i = 0; i < t.length; i++) {
      System.out.print( extra.Format.right( t[i], 4 )
              +((i+1)%SORHOSSZ!=0 ? " " : "\n") //TODO: miért kell az egész sort zárójelbe tenni?
      );
    }
    System.out.println("");
  } //kiírTömb()
} //class
