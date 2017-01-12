package fejezet_08;

public class KockaDobás3 {
  
  public static void main(String[] args) {
    System.out.println("Két kockával történő N db dobás összegei");
    System.out.println("Adja meg N-t (>=1, egész)");
    int n;
    while ((n = extra.Console.readInt("? ")) < 1) {
      System.out.println("A szám legyen legalább 1");
    }
    //alábbi _számlálók_ tömbje; megvalósítás: index"transzformációval"
    int[] dobásösszegek = new int[11]; // 0..10 mint index => kiírásnál: 2..12 mint összeg
    for (int i = 0; i < n; i++) {
      int dobás1 = (int)(Math.random()*6+1);
      int dobás2 = (int)(Math.random()*6+1);
      dobásösszegek[(dobás1+dobás2)-2]++; //manipuláljuk a tömbindexet, hogy ne pazaroljuk el a 0, 1 indexeket
    }
    //fejlécet rajzolunk
    for (int i = 2; i <= 12; i++) {
      System.out.print(extra.Format.right(i, 5));
    }
    System.out.println("\n"
            + "-----------------------------------------------------------");
    //a számlálók kiírása
    for (int i = 0; i <= 10; i++) {
      System.out.print(extra.Format.right(dobásösszegek[i], 5));
    }
    System.out.println();
  } //main()
} //class
