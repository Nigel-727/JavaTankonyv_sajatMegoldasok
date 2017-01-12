package fejezet_10;

import java.util.Calendar;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class LegutóbbiSzökőév {
  
  static boolean szökőév(int év) {
    return (év>=1582) && ((év%4==0 && év%100!=0) || (év%400==0));
  }

  public static void main(String[] args) {
    System.out.println("Megmondom ám hogy a legUTÓBBI szökőév szökőnapja milyen napra ESETT!!!\n");
    int év = Calendar. //osztály-valami jön...
            getInstance(). //...ez a valami (itt: fv.) egy Calendar objektumot ad vissza...
            get( //...amire szintén meghívunk egy fv-t...
                    Calendar.YEAR )  //...osztály-konstans paraméterrel
            ; //csak azért tördeltem sorokra hogy könnyebben felfogjam a részeit
    System.out.println("az idei év: "+év);
    --év; //!; az idei évtől eltekintünk (mivel nem foglalkozunk dátumok összehasonlításával sem)
    while (!szökőév(év)) 
      --év;
    System.out.println("A legutóbbi szökőév (ami NEM az idei): "+év);
    System.out.println("Abban az évben a szökőnap (feb.24.) napja (angolul): "
            + new String[] {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}
                    [Születésnap.hétNapja(év, 2, 24)] //#iLikeJava 
    ); //Nem mellesleg, az előző sorokban egy on-the-fly String-tömböt indexeltünk. Azta...
  }
} //class