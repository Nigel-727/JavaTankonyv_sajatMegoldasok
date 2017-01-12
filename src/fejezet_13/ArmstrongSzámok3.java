package fejezet_13;

import java.util.ArrayList;

/**
 *
 * @author Nigel-727
 */
public class ArmstrongSzámok3 {
  
  private static boolean armstrong(final int SZÁM) {
    ArrayList<Integer> számjegyek = new ArrayList<>(); //ezúttal nem egyszerű tömbbel
    int szám=SZÁM;
    do 
      számjegyek.add(szám%10);
    while((szám/=10) != 0);
    int hatványÖsszeg = 0, 
        számjegyDb = számjegyek.size();
    for (Integer számjegy : számjegyek) //VAGY for(i..) és .get(i)
      hatványÖsszeg += Math.pow(számjegy, számjegyDb);
    return SZÁM == hatványÖsszeg;
  }
  
  public static void main(String[] args) {
    System.out.println("Még mindig az Armstrong-számok... *** THREE\n"
            + "\tEltárolom ám az összes 10millió alattit!!!\n");
    final int MAX = 
            10_000_000; //iLoveJava
//            2000; //#teszt
//              2_000_000; //#teszt
    ArrayList<Integer> armStrongs = new ArrayList<>();
    for (int i = 100; i <= MAX; i++) 
      if (armstrong(i))
        armStrongs.add(i);
    System.out.println("Az Armstrong-számok 100 és "+MAX+" között:\n"
            + armStrongs);
  }//main()
}//class

/*output:
Az Armstrong-számok 100 és 10000000 között:
[153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315]
BUILD SUCCESSFUL (total time: 10 seconds)
*/