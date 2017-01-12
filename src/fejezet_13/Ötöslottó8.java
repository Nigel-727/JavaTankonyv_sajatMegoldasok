package fejezet_13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * E feladat a könyvben is meg van oldva, de most magam is megoldom, gyakorlásféleképpen
 * Téma: típusos tömblisták, Collections osztálymetódusai
 * 
 * @author Nigel-727
 */
public class Ötöslottó8 {//13.3.1
  public static void main(String[] args) {
    System.out.println("Kiírok ám egy ötöslottón megjátszható számkombinációt!!!\n");
    ArrayList<Integer> szelvény = new ArrayList();
    while (szelvény.size() < 5) { //!: vagyis, meg tudunk spórolni egy ciklusváltozót
      int újszám; //kell mert létrehozás után is hivatkozunk rá
      while (szelvény.contains(újszám=(int)(Math.random()*90+1)))
        ; //lépkedés amíg olyat választunk amit már választottunk
      szelvény.add(újszám); //egyúttal .size() értéke is nő
    }//külső ciklus
    Collections.sort(szelvény);
    System.out.println("Íme, a szelvény: " + szelvény);
  }//main()
}//class
