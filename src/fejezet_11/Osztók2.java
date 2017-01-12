package fejezet_11;

/**
 *
 * @author Nigel727
 */
public class Osztók2 {

  //output: növekvő sorrendben a szám osztói
  static int[] egySzámOsztói(int szám) {
    int[] osztók = new int[szám /2+1]; //TODO hányan lehetnek max?
    int db = 0; 
    osztók[db++]=1; //minden szám osztható 1-gyel
    for (int i = 2; i <= szám/2; i++) 
      if (szám%i==0) //ha osztható vele
        osztók[db++]=i;
    osztók[db++]=szám; //minden szám osztható önmagával
    //takarékos tömbbe másolni:
    int[] ezkellneked = new int[db];
    for (int i = 0; i < db; i++) 
      ezkellneked[i] = osztók[i];
    return ezkellneked; 
  }
  
  //metszet prog.tétellel meghatározza a közös osztókat
  //output: fenti egyetlen sztringgé összefűzve
  static String kétSzámKözösOsztói(int szám1, int szám2) {
    int[] halmaz1 = egySzámOsztói(szám1), //Tutira halmaz...
            halmaz2 = egySzámOsztói(szám2); //...mert minden szám csak 1x szerepelhet.
    //METSZET programozási tétel alkalmazása:
    int[] metszet = new int[Math.min( //Metszethalmaz elemszámának maximuma:...
            halmaz1.length, halmaz2.length)]; //...a kisebb elemszámú halmaz számossága.
    //végiglépkedünk az egyik (TODO a kisebb elemszámú) halmaz elemein egyesével,
    //és ha megtaláljuk (!: lineáris keresés, kihasználni h rendezett) a másikban, akkor a metszet végére fűzzük
    int metszetDb = 0; 
    for (int külső = 0; külső < halmaz1.length; külső++) { //prog.tétel KIVÁLOGATÁS: azokat amik mind2-ben szerepelnek
      int belső=0; //belső ciklus hasonlít a másik halmaz elemeivel; prog.tétel ELDÖNTÉS:
      while (belső<halmaz2.length && 
//              !(halmaz1[külső]==halmaz2[belső])) //rendezetlen tömb esetén is OK
              !(halmaz1[külső]<=halmaz2[belső])) { //!: _kihasználva_ a tömb rendezettségét
        belső++;
      }//while
      if (belső<halmaz2.length 
              && halmaz1[külső]==halmaz2[belső] ) //!: a fenti _kihasználás_ miatt kell a plusz vizsgálat
        metszet[metszetDb++] = halmaz1[külső]; //vagy: halmaz2[belső]; beletesszük
    }//külső
    //Minden készen áll az output összeállításához:
    String ezkellneked = "[";
    if (metszetDb!=0) { //ha van közös elem (nem volt diszjunkt a két halmaz)
      for (int i = 0; i < metszetDb-1; i++) //hátulról a második elemig
        ezkellneked += metszet[i] + ", ";
      ezkellneked += metszet[metszetDb-1]; //hátulról az első elem
    } 
    return ezkellneked + "]"; //TODO
  }
  
  public static void main(String[] args) {
    System.out.println("\"Osztók2\" *** Visszaadom ám tömbben a számok közös osztóit rendezetten!!!\n");
    final int   
//                EGYIKSZÁM = 2016,
                EGYIKSZÁM = 6,
                MÁSIKSZÁM = 12;
//                MÁSIKSZÁM = 1344;
//                MÁSIKSZÁM = 2016;
    System.out.println(""
            + EGYIKSZÁM + " és " + MÁSIKSZÁM
            + " közös osztói: " 
            + kétSzámKözösOsztói(EGYIKSZÁM, MÁSIKSZÁM)
    );
  }//main()
}//class