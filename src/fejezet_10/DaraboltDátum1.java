/*
package fejezet10;

public class DaraboltDátum1 {
  public static void main(String[] args) {
    String s;
    
  }
}
*/



package fejezet_10;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 *
 * @author ferenc
 */


public class DaraboltDátum1 {
/*  
  public static String split(String s, int a, int b) {
    return s.substring(a, b);
  }
*/  
  public static void main(String[] args) throws IllegalArgumentException {
    Date d=new Date();
    System.out.println("Datum darabolasa ev/honap/nap-ra: ");
    System.out.println("az eredeti dátum: "+d);
    //
    DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
    String datum=df.format(d);
    //datum="ksjddfs";
        
    /*
    The metacharacters supported by this API are: <([{\^-=$!|]})?*+.>
    there are 12 characters with special meanings: 
    the backslash \, the caret ^, the dollar sign $, the period or dot ., 
    the vertical bar or pipe symbol |, the question mark ?, the asterisk or star *, 
    the plus sign +, the opening parenthesis (, the closing parenthesis ), and 
    the opening square bracket [, the opening curly brace {, 
    These special characters are often called "metacharacters".
    */
    //String[] szoveg=datum.split(Pattern.quote("."));//1");
    try {
      System.out.println("Darabolas splittel");
      if(!datum.contains("."))
        throw new IllegalArgumentException("A szovegben nincs pont (.), ezert a split nem tud mit darabolni.");
      String[] szoveg=datum.split(Pattern.quote("."));//1");
      for (int i = 0; i < szoveg.length; i++)
        System.out.println(szoveg[i]);
    }
    catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    
    try {
      if(datum.length()<10)
        throw new IllegalArgumentException("A datum formatuma tul rovid a substringgel valo feldolgozashoz");
      System.out.println("Darabolas substringgel");
      System.out.println(datum.substring(0, 4));
      System.out.println(datum.substring(5, 7));
      System.out.println(datum.substring(8, 10));
    }
    catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    
    System.out.println("Darabolas StringTokenizerrel");
    StringTokenizer st=new StringTokenizer(datum);
    while(st.hasMoreTokens())
      System.out.println(st.nextToken("."));
    
    System.out.println("Darabolas GregorianCalendarral");
    GregorianCalendar gc=new GregorianCalendar();
    //gc.setTime(d);
    System.out.println(gc.get(GregorianCalendar.YEAR));
    System.out.println(gc.get(GregorianCalendar.MONTH)+1);
    System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));
  }
}

