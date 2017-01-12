package fejezet_08;

import fejezet_07.LegközelebbiPrímszám;

public class PrímekÉsNemPrímek {
  
  public static void main(String[] args) {
    
//    int[] tömb = new int[200]; //<- a feladatspecifikáció szerint
    int[] tömb = new int[50];
    int n = tömb.length; //utálom a literálokat
    System.out.println(n
            +" elemű tömbben 3-jegyű random számok --"
            + "Írjuk ki konzolra a prímeket & nem prímeket!");
    
    //feltöltjük
    for (int i = 0; i < n; i++) 
      tömb[i] = (int)(Math.random()*900+100); //900 db 3-jegyű van, 100 a legkisebb
    //kiválogatom előbb, két külön tömbbe
    int prímDb = 0, nemprímDb = 0; //gyűjtő tömb elemszáma
    int[] prímek = new int[n],  //mert lehet akár n db prím (ha mind az)
            nemprímek = new int[n];
    for (int i = 0; i < n; i++) {
      int x = tömb[i]; //ne kéregessük le újra+újra
      if (LegközelebbiPrímszám.prím(x))
        prímek[prímDb++] = x;
      else
        nemprímek[nemprímDb++] = x;
    }
    //kiírom (output):
    System.out.println("A prímek: ");
    for (int i = 0; i < prímDb; i++) 
      System.out.print(prímek[i]+" ");
    System.out.println("");
    System.out.println("A nemprímek: ");
    for (int i = 0; i < nemprímDb; i++) 
      System.out.print(nemprímek[i]+" ");
    System.out.println("");
  }
}
