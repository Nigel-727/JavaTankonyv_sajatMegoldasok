package fejezet_10;

/**
 *
 * @author Nigel-727
 */
public class SzövegÁtlósan {
  public static void main(String[] args) {
    System.out.println("Jobbra meg balra átlósan is ki tudom ám írni a szöveget!"
            + "\n\nÍrjad is mostan gyorsan ide befele");
    String szöveg; //lokális változókat muszáj inicializálni
    while ((szöveg=extra.Console.readLine(": ")).equals(""))
      System.out.println("\t\tValamit azért kaparjál befele!");
    System.out.println("Jobbra:");
    for (int i = 0; i < szöveg.length(); i++) {
      for (int j = 0; j < i*2; j++) //0*, 1*, 2*, 3*, stb 2 db szóköz van előtte
        System.out.print(" ");
      System.out.println(szöveg.charAt(i));
    }
    System.out.println("Balra:");
    for (int i = 0; i < szöveg.length(); i++) {
      for (int j = 0; j < (szöveg.length()-1-i)*2; j++) //..., 3*,2*,1*,0* 2 db szóköz van előtte
        System.out.print(" ");
      System.out.println(szöveg.charAt(i));
    }
    
  }//main()
}
