package fejezet_08;

public class KockaDobás4 {
  
  public static void main(String[] args) {
    System.out.println("\"KockaDobás4\" -- Kockadobás statisztikája (2 kockával egyszerre)");
    int dobásokszáma;
    while (!(0 < (dobásokszáma = extra.Console.readInt("dobások száma (pozitív egész) =? "))))
      ;
    //dobás:
    int[] dobások = new int[dobásokszáma];
    for (int i = 0; i < dobásokszáma; i++) 
      dobások[i] = 
              (int)(Math.random()*6+1) + (int)(Math.random()*6+1); 
    //összegzés/inicializálás
    int[] összegek = new int[11]; //számlálók tömbje, indexelés: BELSŐ ábrázolással
    for (int i: összegek)
      összegek[i] = 0;
    //összegzés/feldolgozás
    for (int i = 0; i < dobásokszáma; i++) 
      összegek[dobások[i]-2]++; //indextranszformáció: le kell vonni az alsóhatárt
    //maximumkiválasztás; kell tudni melyik legyen a leghosszabb oszlop h kiszámolhassuk az arányt
    int maxHely = 0; //az összegek tömb legnagyobb elemének indexe
    for (int i = 1; i < összegek.length; i++) //ciklus végig a számlálók tömbjén
      if (összegek[maxHely] < összegek[i])
        maxHely = i;
    //output
    final int LEGHOSSZABBOSZLOP = 40; //feladatspecifikácó szerint
    double arány = (double)LEGHOSSZABBOSZLOP / összegek[maxHely];
    System.out.println(dobásokszáma+" dobásból a grafikon:");
    System.out.println("összeg | darab | oszlop");
    for (int i = 0; i < összegek.length; i++) {
      //kiírásnál váltás KÜLSŐ indexre:
      System.out.print(extra.Format.right(i+2, 6)+" |"
              +extra.Format.right(összegek[i], 6)+" | ");
      //oszlopdiagram rajzolása:
      for (int j = 0; j < Math.round(arány*összegek[i]); j++) 
        System.out.print("*");
      System.out.println("");
    }
  } //main()
} //class