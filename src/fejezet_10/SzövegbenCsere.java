package fejezet_10;

/**
 *
 * @author Nigel-727 
 */
public class SzövegbenCsere {
  
  static char c1, c2;  
  static String szöveg;
  
  static String cserélRégimódian() {
    int i = 0;
    String újSzöveg = new String(""); //konstruktorral ám
    while (i < szöveg.length()) {
      while (i<szöveg.length() && !(szöveg.charAt(i)==c1)) {
        újSzöveg += szöveg.charAt(i);
        i++; 
      }
      if (i<szöveg.length()) //ha találtunk
        újSzöveg += c2;
      i++;
    }
    return újSzöveg;
  }
  
  static String cserél_withStringBuffer() { //StringBuffer.replace()
    StringBuffer újSzöveg = new StringBuffer(szöveg); 
    int hol;
    while (-1 < (hol=újSzöveg.toString().indexOf(c1)))
      újSzöveg.replace(hol, hol+1, Character.toString(c2)); 
    return újSzöveg.toString();
  }
  
  static String cserél_withString () { //String.replace()
    return new String(szöveg.replace(c1, c2));        
  }
  
  public static void main(String[] args) {
    System.out.println("Lecserélem ám a szövegben az első karakter összes előfordulását a másodikra!!!");
    szöveg = extra.Console.readLine("a szöveg: ");
    if (!szöveg.isEmpty()) {
      c1 = extra.Console.readChar("karakter #1: ");
      c2 = extra.Console.readChar("karakter #2: ");
      //
      System.out.println("Tessék, itt az új szöveg:\n"
              + cserélRégimódian() + " (régimódian)\n"
              + cserél_withStringBuffer() + " (StringBuffer függvényekkel)\n"
              + cserél_withString() + " (String függvényekkel)"
      );
    } else
      System.out.println("Kérem szépen hogy valaki mással szórakozzon!");
  }//main()
}//class