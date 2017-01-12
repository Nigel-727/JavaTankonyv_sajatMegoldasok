package fejezet_08;

public class Kenó2 {

  public static void main(String[] args) {
    System.out.println("Kenó2 "
            + "//most nem 80-elemű logikai tömbbel, hanem 10-elemű tömbbel");
    final int LEGNAGYOBBSZÁM = 80;
    int[] nyerőszámok = new int[10];
    int jóDb = 0;
    while (jóDb < nyerőszámok.length) {
      int szám = (int)(Math.random()*LEGNAGYOBBSZÁM);
      //egy eldöntés tétel megmondja, húztuk-e már:
      int i = 0;
      while (i<jóDb && !(szám==nyerőszámok[i])) {
        i++;
      }
      if (i>=jóDb) //még nem volt, vagyis jó szám
        nyerőszámok[jóDb++] = szám;
    }
    for (int i : nyerőszámok)
      System.out.print(i+" ");
    System.out.println();
  }
}
