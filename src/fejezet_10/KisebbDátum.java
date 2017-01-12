package fejezet_10;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nigel-727 
 */

public class KisebbDátum { 
  
  static final String[] DATEFORMAT_PÉLDÁNYTÍPUSOK = {"datetime", "date", "time"};
  static final String[] DATEFORMAT_KONSTANSOK = {"short", "full", "long", "medium"};
  
  static boolean kisebbDátum(Date dátum1, Date dátum2) {
    return (dátum2.getTime()-dátum1.getTime())>0; //long2-long1>0 (igaz, ha a long1 kisebb)
  }
  
  static Date newDate(int év, int hó, int nap, int óra, int perc, int másodperc) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(év, hó-1, nap, óra, perc, másodperc); //mert month: 0..based
    return calendar.getTime(); //referencia Date objektumra
  }
  
  static private int indexOf(String mi, String[] miben) {
    int i = 0;
    while (i<miben.length && !miben[i].equals(mi))
      i++;    
    return miben.length == i ? -1 : i; 
  }
  
  //TODO saját kis... (gyakorlásféleképpen)
  static String dateToString(Date date, String what, String style1, String style2) {
    what = what.toLowerCase();
    style1 = style1.toLowerCase();
    style2 = style2.toLowerCase();
    int mit = indexOf(what, DATEFORMAT_PÉLDÁNYTÍPUSOK),
            hogyan1 = indexOf(style1, DATEFORMAT_KONSTANSOK),
            hogyan2 = indexOf(style2, DATEFORMAT_KONSTANSOK);
/*    
    System.out.println(
            "{mit: "+mit+"; "
            +"hogyan1: "+hogyan1+"; "
            + "hogyan2: "+hogyan2+"}");
*/
    if ( -1==mit || -1==hogyan1 || -1==hogyan2 ) {
//      System.out.println("\tbaj van");
      return null;
    }
    DateFormat dateformat = null; //dátum(idő)formázó
    int forma1 = 
            style1.equals("long") ? DateFormat.LONG : 
            style1.equals("short") ? DateFormat.SHORT : 
            style1.equals("medium") ? DateFormat.MEDIUM : 
            style1.equals("full") ? DateFormat.FULL : 
            DateFormat.DEFAULT;
    int forma2 = 
            style2.equals("long") ? DateFormat.LONG : 
            style2.equals("short") ? DateFormat.SHORT : 
            style2.equals("medium") ? DateFormat.MEDIUM : 
            style2.equals("full") ? DateFormat.FULL : 
            DateFormat.DEFAULT;
    switch (what) {
      case "datetime" : 
        dateformat = DateFormat.getDateTimeInstance(forma1, forma2);
        break;
      case "date" :
        dateformat = DateFormat.getDateInstance(forma1);
        break;
      case "time" : 
        dateformat = DateFormat.getTimeInstance(forma1);
        break;
    }
    return dateformat.format(date);
  }
  
  static String dateToString(Date date, String what, String how) {    
    return dateToString(date, what, how, "full"); 
    //TODO a default érték helyett "" szebb lehetne, akkor viszont
    //a 4-paraméteresbe is bele kellene nyúlni, a tömbindex-ellenőrzésnél.
  }
  
  public static void main(String[] args) {
    System.out.println("Megmondom ám két dátumról h az első kisebb-e a másodiknál!!!\n");
    //beállításhoz én nem a Date beállítását (elavult) használom, hanem a Calendar-t
    //(bár lehet h azt pedig máshogyan kéne, én egyelőre a saját fejem után megyek)
    Date    d1=newDate(1981, 7, 31, 11, 45, 0), 
            d2=newDate(1975, 7, 27, 4, 50, 0);
    System.out.println("Vajon " + d1 + " kisebb-e mint " + d2 + "? " + kisebbDátum(d1, d2));
    System.out.println("Vajon " + d2 + " kisebb-e mint " + d1 + "? " + kisebbDátum(d2, d1));
    System.out.println("Vajon " + d2 + " kisebb-e mint " + d2 + "? " + kisebbDátum(d2, d2));
    //TODO ez máshogyan szebb (az enum ilyesmire való...?); C és C++ -ban használtam
    System.out.println();
    System.out.println("A második Date objektum as" 
            + "\n DateTimeInstance(FULL,FULL): \t\t" + dateToString(d2, "datetime", "full", "FULL") 
            + "\n DateTimeInstance(LONG, LONG): \t\t" + dateToString(d2, "datetime", "LONG", "long") 
            + "\n DateTimeInstance(MEDIUM, MEDIUM): \t" + dateToString(d2, "datetime", "medium", "medium") 
            + "\n DateTimeInstance(SHORT,SHORT): \t" + dateToString(d2, "datetime", "short", "SHORT") 
            + "\n DateInstance(FULL): \t\t\t" + dateToString(d2, "date", "fuLL")
            + "\n DateInstance(LONG): \t\t\t" + dateToString(d2, "date", "long")
            + "\n DateInstance(MEDIUM): \t\t\t" + dateToString(d2, "date", "medium")
            + "\n DateInstance(SHORT): \t\t\t" + dateToString(d2, "date", "short")
            + "\n TimeInstance(FULL): \t\t\t" + dateToString(d2, "time", "FULL")
            + "\n TimeInstance(LONG): \t\t\t" + dateToString(d2, "time", "Long")
            + "\n TimeInstance(MEDIUM): \t\t\t" + dateToString(d2, "time", "medium")
            + "\n TimeInstance(SHORT): \t\t\t" + dateToString(d2, "time", "SHORT")
    );
  }//main()
}//class