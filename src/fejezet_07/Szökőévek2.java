package fejezet_07;

public class Szökőévek2 {
  public static void main(String[] args) {
//    szökőévek(1977, 2009); 
    szökőévek(1975, 2120); 
  }

  private static void szökőévek(int év1, int év2) {
    System.out.println("Szökőévek "+év1+" és "+év2+" között:");
    for (int i = év1; i <= év2; i++) {
      if (szökőév(i))
        System.out.print(i+", ");
    }
    System.out.println();
  }

  public static boolean szökőév(int év) { //_public_ : tudjuk más class-ból(?)/csomagból (?) is hívni
    return év >= 1582 
            && ((év%4 == 0 && év%100 != 0) || év%400 == 0);
  }
}
