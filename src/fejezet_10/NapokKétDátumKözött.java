package fejezet_10;

import java.util.Calendar;

/**
 *
 * @author Nigel-727
 */

public class NapokKétDátumKözött {

  public static void main(String[] args) {
    Calendar calNow = Calendar.getInstance(), //retval: Calendar
             calDettiElment = Calendar.getInstance();    
//    calNow.set(2016-1900, 12-1, 25); //hibás! Calendar esetében nem kell year-t transzformálni
    calDettiElment.set(2016, 5-1, 26); //OK
    //
    System.out.println("A jelen dátum (as Date.toString()): \n"
            +calNow.getTime()); //retval: Date    
    System.out.println();
    System.out.println("\nDetti(\u271d) kutyánk (született: 2001. tavasz, elhunyt: 2016.05/26.) immár \n"
            +napokSzáma_viaCalendar(calNow, calDettiElment)
            +" napja sétál az angyalok között.");
  }
  
  static long napokSzáma_viaCalendar(Calendar c1, Calendar c2) {
    System.out.println("az első paraméter"
            + "\n mint Date (dátum): " + c1.getTime() //Date
            + "\n mint long (UTC): " + c1.getTime().getTime() //long
    );
    System.out.println("az második paraméter"
            + "\n mint Date (dátum): " + c2.getTime() //Date
            + "\n mint long (UTC): " + c2.getTime().getTime() //long
    );
    long l1 = c1.getTime().getTime(),
          l2 = c2.getTime().getTime();
    return Math.abs(l2-l1)/1000/60/60/24;
  } 
}
