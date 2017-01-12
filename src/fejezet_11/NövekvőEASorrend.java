package fejezet_11;

/**
 *
 * @author Nigel727
 */
public class NövekvőEASorrend { //11.4.12
  
  public static boolean isAscending(int[] tomb) {
    int előző = tomb[0]; 
    int i = 1; 
    while (i<tomb.length && előző<=tomb[i])
      előző = tomb[i++];    
    return i==tomb.length; //ha végiglépkedtünk (úgy h igaz maradt a _<=_)
  }
  
  public static void main(String[] args) {
    System.out.println("Megmondom EA, de meg ám!!!\n");
    System.out.println("A tömb (nemszigorúan) növekvő-e? "
            + isAscending(new int[] { 
//              4, 7, 12, 20, 21, 28  //IGEN
              4, 7, 12, 20, 20, 28  //igen (bár nemszigorúan növekvő)
//                4, 7, 12, 20, 19, 28  //NEM
            }) + "");
  }
}//class