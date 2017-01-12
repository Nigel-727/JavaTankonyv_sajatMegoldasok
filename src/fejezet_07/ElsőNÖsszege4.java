package fejezet_07;

public class ElsőNÖsszege4 {
  public static void main(String[] args) {
    System.out.println("0..n-ig a természetes számok összege");
    int szám;
    while ((szám=extra.Console.readInt("n=? "))<0)
      ;
    System.out.println("Tessék: "+elsőNösszege(szám));
  }

  private static long elsőNösszege(int szám) {
    return szám == 0 ? 0 : szám+elsőNösszege(szám-1);
  }
}
