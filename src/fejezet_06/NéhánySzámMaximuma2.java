package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class NéhánySzámMaximuma2 {

  public static void main(String[] args) {
    final int VÉGJEL = 0;
    System.out.println("Írjon be néhány egész számot (végjel: " + VÉGJEL + "), "
            + "megmondom melyik volt a legnagyobb!");
    int szám,
            max = Integer.MIN_VALUE,
            db = 0;
    do {
      db += (szám = extra.Console.readInt("szám = ? ")) != VÉGJEL ? 1 : 0;
      max = (szám != VÉGJEL) ? (max < szám ? szám : max) : max;
    } while (szám != VÉGJEL);
    System.out.println(0 < db
            ? "A " + db + " darab szám maximuma: " + max : "Nulla darab számnak nincs maximuma.");
  }
}
