package fejezet_07;

public class ASCIIGrafika1 {

  public static void main(String[] args) {
    System.out.println("ASCII téglalapok rajzolása megadott karakterrel");
    grafika(5, 3, '+');
    grafika(3, 10, '*');
  }

  private static void grafika(int sorDb, int oszlopDb, char kar) {
    for (int i = 0; i < sorDb; i++) {
      for (int j = 0; j < oszlopDb; j++) {
        System.out.print(kar);
      }
      System.out.println();
    }
  }
}
