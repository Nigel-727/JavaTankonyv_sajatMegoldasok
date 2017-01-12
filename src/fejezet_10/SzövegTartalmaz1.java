package fejezet_10;

/**
 *
 * @author Nigel-727
 */
public class SzövegTartalmaz1 {
  public static void main(String[] args) {
    System.out.println("Írjon be két szöveget, megmondom h az első tartalmazza-e a másodikat!");
    String szöveg1 = extra.Console.readLine("#1: ");
    String szöveg2 = extra.Console.readLine("#2: ");
    boolean tartalmazza;
    tartalmazza = szöveg1.contains(szöveg2);
    System.out.println(
            tartalmazza ? "igen" : "nem"
    );
    System.out.print("Biztosan? ");
    int holvan = szöveg1.indexOf(szöveg2);
    System.out.println(
            (0 < holvan ? "Igen, biztosan." : "Sajnos tévedtem.")
            + "("+holvan+" indextől)"
    );
  }
}
