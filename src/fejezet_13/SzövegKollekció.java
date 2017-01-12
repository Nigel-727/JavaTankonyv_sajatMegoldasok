/* 
Üres végjelig kell beolvasni szövegeKET (karek,szavak,mondok) konzolról!
Beolvasáskor +output: sorszám; Tárolás: típusos tömblistában; 
Output: listázni: 1) beolvasási sorrendben 2) visszafelé 3) rendezetten 4) összekeverve
*/

package fejezet_13;

/*
import java.util.ArrayList;
import java.util.Collections;
*/
import java.util.*; //a fentiek helyett írható

/**
 *
 * @author Nigel-727 (on win10.desktop)
 */
public class SzövegKollekció { // 13.3.2; NEM gyakorlópélda
  public static void main(String[] args) {
    System.out.println("\"Szövegkollekció\" *** Rendezem ám a beolvasott szövegeket!!!!\n");
    ArrayList<String> arrList = //tömblista<típus> vagyis típusos tömblista
                                  new ArrayList<>();
    //beviteli végjel: ""
    String str;
    while ( !(str=extra.Console.readLine("#"+(arrList.size()+1)+": ")).equals("") ) 
      arrList.add(str); //sorszámoznásnál kihasználjuk h .size() az aktuális méretet adja vissza
    System.out.println("szövegszám: "+arrList.size()+" db"); //itt is kihasználjuk
    if (!arrList.isEmpty()) {
      System.out.println("A szövegek");
      System.out.println("* beviteli sorrendben (as ArrayList):\t\t\t" + arrList);
      //alábbi nem volt kérés, viszont a könyvben szerepel a függvény
      System.out.println("* delimeter-rel elválasztva (as String):\t\t" 
              + String.join(", ", arrList)); //!: String.join() 2-paraméteres változata
      Collections.reverse(arrList);
      System.out.println("* fordítottan rendezett sorrendben (as ArrayList):\t" + arrList);
      Collections.sort(arrList);
      System.out.println("* növekvően rendezett sorrendben (as ArrayList):\t" + arrList);
      Collections.shuffle(arrList);
      System.out.println("* összekeverten rendezett sorrendben (as ArrayList):\t" + arrList);
    } else
      System.out.println("Szorri, de semmit nem írtál be.| Örülj h nem kivételt dobtam!");
/*
    //csak gyakorlásféleképpen:
    String[] strArr = {"béka", "béla", "teszt", "elek", "kabát", "hideg"};
    System.out.println(
            String.join(", ", strArr) //O.K.
    );
*/
  }//main()
}//class