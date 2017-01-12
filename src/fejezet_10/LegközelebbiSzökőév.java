package fejezet_10;

import java.util.Calendar;

/**
 *
 * @author Nigel-727 
 */
public class LegközelebbiSzökőév {
  
  static boolean szökőév(int év) {
    return (év>=1582) && ((év%4==0 && év%100!=0) || (év%400==0));
  }

  public static void main(String[] args) {
    System.out.println("Megmondom ám hogy a legKÖZELEBBI szökőév szökőnapja milyen napra FOG ESNI!!!\n");
    int év = Calendar. //osztály-valami jön...
            getInstance(). //...ez a valami (itt: fv.) egy Calendar objektumot ad vissza...
            get( //...amire szintén meghívunk egy fv-t...
                    Calendar.YEAR )  //...osztály-konstans paraméterrel
            ; //csak azért tördeltem sorokra hogy könnyebben felfogjam a részeit
    System.out.println("az idei év: "+év);
    ++év; //!; az idei évtől eltekintünk (mivel nem foglalkozunk dátumok összehasonlításával sem)
    while (!szökőév(év)) 
      ++év;
    System.out.println("A legközelebbi szökőév (ami NEM az idei): "+év);
    String napokStrENG[] = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    System.out.println("Abban az évben a szökőnap (feb.24.) napja (angolul): "
            + napokStrENG[Születésnap.hétNapja(év, 2, 24)]
    );
  }
} //class


/*
package fejezet10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LegközelebbiSzökőév {
  public static void main(String[] args) {
    int év=(new GregorianCalendar()).get(Calendar.YEAR);
    while(!Születésnap.szökőév(év))
      év++;
    System.out.println("A legközelebbi szökőév: "+év);
    System.out.println("Abban az évben a szökőnap (február 24.) napja: "+
      Születésnap.hétNapja(év, 2, 24));
  }
}
*/