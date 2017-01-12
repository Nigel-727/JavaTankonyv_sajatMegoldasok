package fejezet_11;

/**
 * véletlentömb
 * output: hányszor fordul elő a legnagyobb elem
 * 
 * @author Nigel727
 */
public class MaximálisTömbelemekSzáma { //11.4.7
  
  private static final int N = 20;
  private static int[] tömb = new int[N]; //0..alapon indexelt
  
  public static void main(String[] args) {
    System.out.println("Megmondom ám h a tömbben hányszor fordul elő a legnagyobb elem!!!\n");
    System.out.print("Íme, a tömb:\n[ ");
    for (int i = 0; i < N; i++) {
      tömb[i] = (int)(Math.floor(Math.random()*41-20)); //!: így O.K. negatív számokkal
      System.out.print(tömb[i]+" ");
    }
    System.out.println("]");
    //
    int maxÉrt = tömb[0]; //kezdetben a legelső elem
    int maxDb = 1; //számlálót "nullázzuk"
    for (int i = 1; i < N; i++) //a második elemtől indul a vizsgálat
      if (maxÉrt < tömb[i]) { //ha nagyobb...
        maxÉrt = tömb[i]; //...mentjük
        maxDb = 1; //...számlálót "nullázzuk"
      }
      else if (maxÉrt == tömb[i]) //ha nem az első előfordulása...
        maxDb++; //...számlálót növeljük
    System.out.println("A legnagyobb elem: " + maxÉrt 
            + ", előfordulásainak száma: " + maxDb + ".");
  }//main()
}
