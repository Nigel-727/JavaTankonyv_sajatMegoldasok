package fejezet_13;

import java.util.*;

/**
 *
 * @author Nigel-727
 */
public class Kenó3 {
  public static void main(String[] args) {
    System.out.println("Kiírok ám egy kenón megjátszható számkombinációt!!!\n");
    ArrayList<Integer> szelvény = new ArrayList();
    while (szelvény.size() < 10) { //!: vagyis, meg tudunk spórolni egy ciklusváltozót
      int újszám; //kell mert létrehozás után is hivatkozunk rá
      while (szelvény.contains(újszám=(int)(Math.random()*80+1)))
        ; //lépkedés amíg olyat választunk amit már választottunk
      szelvény.add(újszám); //egyúttal .size() értéke is nő
    }//külső ciklus
    Collections.sort(szelvény);
    System.out.println("Íme, a szelvény: " + szelvény);
  }//main()
}
