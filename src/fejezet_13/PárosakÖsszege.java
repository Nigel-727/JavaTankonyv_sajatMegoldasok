package fejezet_13;

import java.util.ArrayList;

/**
 * feltölteni 300-elemű arraylistet (tömblista) [-50; +50] vélletlen egészekkel;
 * output: a páros elemek összege!
 * 
 * @author Nigel-727
 */
public class PárosakÖsszege {
  public static void main(String[] args) {
    System.out.println("Kiírom ám a tömblista páros elemeinek összegét!!!\n");
    ArrayList<Integer> arrlist=new ArrayList<>();
    //feltöltés; tétel "..."
    while (arrlist.size() < 300) //spórolunk a változók számán, mégis drágább (időben) mivel fv-t hívogatunk
      arrlist.add((int)(Math.floor(Math.random()*101-50))); //!: floor(-14.9)==-15; (int)-14.9==-14
    //tétel "összegzés"(!?);
    int összeg=0;
    for (Integer integer : arrlist) 
      if (integer%2==0)
        összeg+=integer;
    //
    System.out.println("A páros tömblistaelemek összege: " + összeg);
  }//main()
}//class
