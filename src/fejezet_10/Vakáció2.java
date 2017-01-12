package fejezet_10;

/**
 *
 * @author Nigel-727 
 */
public class Vakáció2 {
  public static void main(String[] args) {
    System.out.println("Közeleg a Karácsony és Szilveszter közötti képzési szünet, vagyis...");
    final String VAKÁCIÓ = "Vakáció";
    for (int i = 0; i < VAKÁCIÓ.length(); i++) { //ennyi db sor lesz
      for (int j = 0; j < VAKÁCIÓ.length()-1-i; j++) //ennyi db szóköz lesz
//        System.out.print("."); 
        System.out.print(" "); 
      for (int j = 0; j < i+1; j++)  //ennyi db betűt írunk ki
        System.out.print(VAKÁCIÓ.charAt(VAKÁCIÓ.length()-1-i+j));
      System.out.println("!");
    }
  }
} //TODO lehetnének beszédesebbek az indexhatárok

/*
    System.out.println("      ó\n     
                             ió\n    
                            ció");
    System.out.println("   áció");
    System.out.println("  káció");
    System.out.println(" akáció");
    System.out.println("Vakáció");
*/