package fejezet_11;

/**
 *
 * @author Nigel727
 */
public class MásodikLegnagyobbTömbelem {
  
  private final static int N = 
//          2;
          20;
  private static int[] tömb = new int[N+1]; //1-alapon indexelve
  
  public static void main(String[] args) {
    System.out.println("Kiírom ám a csökkenőbe rendezett tömb második legnagyobb elemét (HA van) !!!\n");
    //feltöltés:
    for (int i = 1; i <= N; i++) 
      tömb[i] = (int)(Math.floor(Math.random()*101-50));
    //csökkenőbe rendezés (ezt kihasználva könnyebb a megoldás) :
    for (int i = 1; i <= N-1; i++) 
      for (int j = i+1; j <=N ; j++) 
        if (tömb[i]<tömb[j]) { //ha rossz a sorrend
          int csere=tömb[i]; tömb[i]=tömb[j]; tömb[j]=csere;
        }
//tömb[2]=tömb[1]; //teszteléskor
    //kiírás:
    System.out.print("A csökkenőbe rendezett tömb:\n["); 
    for (int i = 1; i < N; i++) 
      System.out.print(tömb[i] + ", ");
    System.out.println(tömb[N] + "]");
    //a 2. legnagyobb elem KERESÉSE (eldöntés+kiválasztás):
    int i=2;
    int elsőÉrték = tömb[1];        
    while (i<=N && tömb[i]==elsőÉrték)
      i++;
    boolean vanMásodikLegnagyobb = i<=N; //ha találtunk olyat ami különbözött az elsőtől
    System.out.println("A második legnagyobb tömbelem: "
            + (vanMásodikLegnagyobb ? "értéke " + tömb[i] + "." : "nincs ilyen, mivel minden elemérték azonos.")
    );
  }//main()
}//class