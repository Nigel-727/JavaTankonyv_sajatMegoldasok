package fejezet_10;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nigel-727 
 */
public class Születésnap {

//retval: 1..7  ["hétfő", "kedd", ..., "vasárnap"]
  static byte hétNapja(int év, int hó, int nap) {
    Calendar calBirthday = Calendar.getInstance(); //retval típusa: Calendar
    calBirthday.set(év, hó-1, nap); //!: mert a month 0-based
    //a példa kedvéért átalakítjuk Date típussá:
//    Date dateBirthday = calBirthday.getTime(); //de nem használjuk semmire :)
/*
    for (int i = 0; i < Calendar.FIELD_COUNT; i++) 
      System.out.print(
              + calBirthday.get(i) + ", \n"
      );
*/
    byte retval = (byte)calBirthday.get(Calendar.DAY_OF_WEEK);
//    System.out.println("szülinap.get(Calendar.DAY_OF_WEEK): " + retval);
    //Mivel Calendar.DAY_OF_WEEK ezt adja vissza: 
    //1: vasárnap, 2: hétfő, ..., 7: szombat
    //ezért még transzformálnunk kell: 1->7; 2->1; 3->2; 4->3; 5->4, 6->5, 7->6
    retval = retval!=1 ? (byte)(retval-1) : 7;
    return retval; 
  } //hétNapja
   
  public static void main(String[] args) {
    String napokStr[] = {"", "hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
    System.out.println("Eccerű öröknaptár - megmondom egy dátumról hogy milyen napra esik\n");
    System.out.println("Adja meg, mondjuk, a születésnapját!");
    int év =  extra.Console.readInt("év= "),
        hó = extra.Console.readInt("hónap= "),
        nap = extra.Console.readInt("nap= ");
    System.out.println();
/*    
    Date dateNow = 
//            new Date(); //az egyszerűbb MOST
            Calendar.getInstance().getTime(); //a bonyolultabb MOST
*/
    //Calendar beállítása Date -ból:
    Calendar calNow = Calendar.getInstance(); //Calendar példányosítása
//    calNow.setTime(dateNow); //Date->Calendar
    calNow.set( //mai nap éjfélre állítjuk
            calNow.get(Calendar.YEAR), //év
            calNow.get(Calendar.MONTH), //hó-1
            calNow.get(Calendar.DATE), //nap
            0, //óra
            0, //perc
            0 //mp
    ); 
    Date dateNow = calNow.getTime(); //Calendar->Date
//    System.out.println("dateNow = calNow.getTime(): " + dateNow.getTime());
    //
    Calendar calBirthday = Calendar.getInstance(); //Calendar példányosítása
    calBirthday.set(//adott nap éjfélre állítjuk
            év, 
            hó-1, 
            nap, 
            0, 
            0, 
            0); //[int,int,int]->Calendar
    Date dateBirthday = calBirthday.getTime(); //Calendar->Date
//    System.out.println("dateBirthday = calBirthday.getTime(): " + dateBirthday.getTime());
    //Alább szándékosan akarok Date objektumokkal dolgozni (nem volna muszáj):
    int esikesettInt; 
    String esikesettStr = //Date objektumok összehasonlítása
            0 < (esikesettInt=dateNow.compareTo(dateBirthday)) ? //a MOST későbbi mint a születésnap
            "esett" :
            esikesettInt < 0 ? "fog esni" : //a MOST korábbi mint a születésnap
            "esik"; //azonosak
    System.out.println(év + ". " + hó + ". hó " + nap + " "
            + napokStr[hétNapja(év, hó, nap)]
            + "i napra " + esikesettStr + ".");        
    /*TODO: az a probléma, hogy a két Date között milliszekundum különbségek vannak
    Hogyan lehet megoldani h csak a másodpercig hasonlítson? (a ms-t már ne!) 
    */
  } //main()
} //class