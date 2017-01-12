package fejezet_08;

public class MátrixLegkisebbEleme {
  
  public static void main(String[] args) {
    int[][] mátrix = new int[7][10]; //<-a feladatspecifikáció szerint
//    int[][] mátrix = new int[3][5]; //ez itt két literál, de ne szaporítsuk
    int sorDb = mátrix.length, oszlopDb = mátrix[0].length; //mert utálom a literálokat
    System.out.println("Mátrix "
            + "(" + sorDb + "*" + oszlopDb + ")"
            + " - a legkisebb elem helyének & értékének meghatározása");
    //a feltöltés:
    for (int i = 0; i < sorDb; i++) {
      for (int j = 0; j < oszlopDb; j++) {
        mátrix[i][j] = (int)(Math.random()*sorDb*oszlopDb+1); //praktikusan választunk értékkészletet
        System.out.print(
                extra.Format.right(mátrix[i][j],3) +" ");
      }
      System.out.println("");
    }
    //az ADATFELDOLGOZÁS:
    int minSora = 0, minOszlopa = 0; //a legkisebb értékű elem helye (kezdetben: mátrix[0][0])
    //
    /*A feladat nehézsége (amennyiben nem akarunk Integer.MIN_VALUE-t és társait használni)
    Ezúttal nem egydimenziós tömbről van szó, ahol a 2. elemtől vizsgálhatunk az adathalmaz végéig, 
    hanem mátrixról, ahol a többi sorban már az 1. elemtől kell vizsgálni ismét.
    */
    //megoldás#1: letojjuk a nehézséget, megoldjuk izomból: a [0][0]. elemet saját magával is hasonlítjuk
    for (int i = 0; i < sorDb; i++) 
      for (int j = 0; j < oszlopDb; j++) 
        if (mátrix[i][j] < mátrix[minSora][minOszlopa]) { //_<_ miatt a legelső; _<=_ : a legutolsót találná meg
          minSora = i; 
          minOszlopa = j;
        }
    //megoldás#2: gondolkodunk, ...
    //...
    //output:
    System.out.println("A legkisebb elem helye: " 
            + (minSora+1) + ". sor, " //indextranszformáció KIFELÉ
            + (minOszlopa+1) + ". oszlop; " 
            + "értéke: " + mátrix[minSora][minOszlopa] 
    );
  }
}