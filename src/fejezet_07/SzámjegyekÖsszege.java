package fejezet_07;

public class SzámjegyekÖsszege {

  public static void main(String[] args) {
//    int szám = -51927;
    int szám = 18273;
    System.out.println(szám + " számjegyeinek összege: "
            + számjegyekÖsszege(szám));
  }

  private static int számjegyekÖsszege(int szám) {
    int sum = 0; //ebben számoljuk a szjegyek összegét
    int m;
    szám = Math.abs(szám);
    do {
      m = szám % 10;
      sum = sum + m;
      szám /= 10;
    } while ( 0 < szám );
    return sum;
  }
}
