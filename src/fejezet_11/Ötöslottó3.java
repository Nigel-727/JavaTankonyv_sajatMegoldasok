package fejezet_11;

/**
 * Nem egy korábbi progit írok át, hanem újat 
 * @author Nigel727
 */
public class Ötöslottó3 {

  private static int[] fillLottery(int elemszám, int maxVél) {
    int[] számok = new int[elemszám];
    for (int i = 0; i < számok.length; i++) //TODO muszáj nullázni?
      számok[i] = 0;
    //Kiltöltöm a szelvényt (ezúttal WITHOUT logikai tömb):
    int ideteszem = 0; 
    do {      
      int újszám = (int)(Math.random()*maxVél+1);      
      int i = 0; //Alább eldöntöm, benne van-e már a tömbben:
      while (i<ideteszem && !(számok[i]==újszám)) 
        i++;      
      if (i==ideteszem) //ha nem volt benne
        számok[ideteszem++] = újszám; //végére teszem
    } while (ideteszem < elemszám); //amíg a tömbben nincs elemszám darab elem
    //Rendezem (ezúttal MINIMUMKIVÁLASZTÁSSAL):
    for (int külső = 0; külső < elemszám-1; külső++) { // 0- tól db-2 -ig
      int minHely = külső;      
      for (int belső = külső+1; belső < elemszám; belső++) { // i+1-től db-1 -ig
        if ( számok[belső] < számok[minHely] ) //minimumKIVÁLASZTÁS
          minHely = belső;
      }//belső
      if (minHely!=külső) { //csak akkor cserélünk ha szükséges (=volt kisebb)
        int csere = számok[külső]; 
        számok[külső] = számok[minHely];
        számok[minHely] = csere;
      }//if
    }//külső
    return számok;
}
  public static void main(String[] args) {
    System.out.println("\"Ötöslottó3\" *** Kitöltök ám (akármilyen) lottószelvényt rendezetten!!!\n");
    int[] számaim = fillLottery(
            5, 90
//            6, 45
    );
    System.out.print("Íme, a számok : ");
    for (int tipp : számaim) {
      System.out.print(tipp + " ");
    }
    System.out.println();
  }//main()
}//class