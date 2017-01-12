package fejezet_10;

public class SzövegFüggőlegesen {
  public static void main(String[] args) {
    System.out.println("Amit beír, karakterenként függőlegesen újra kiírom!\n");
    String szöveg = extra.Console.readLine("Kérem, írjon most be valami szöveget: ");
    for (int i = 0; i < szöveg.length(); i++) 
      System.out.println(szöveg.charAt(i));
  }
}
