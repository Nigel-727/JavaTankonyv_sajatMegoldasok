package fejezet_07;

public class ASCIIGrafika2 {

  public static void main(String[] args) {
    System.out.println("Tetszőleges méretű, tetszőleges karakterrel kitöltött téglalap rajzolása");
    grafika(5, 15, '-');
//    grafika(3, 3, '-');
  }

  private static void grafika(int sorokDb, int oszlopokDb, char kar) {
    if (sorokDb < 3 || oszlopokDb < 3) {
      return;
    }
    sor1(oszlopokDb); // fejléc...
    for (int i = 0; i < sorokDb - 2; i++) {
      sor2(oszlopokDb, kar);
    }
    sor1(oszlopokDb); // lábléc.
  }

  private static void sor1(int oszlopokDb) {
    for (int i = 0; i < oszlopokDb; i++) {
      System.out.print('*');
    }
    System.out.println();
  }

  private static void sor2(int oszlopokDb, char kar) {
    System.out.print("*");
    for (int j = 0; j < oszlopokDb-2; j++) {
      System.out.print(kar);
    }
    System.out.println('*');
  }
}
