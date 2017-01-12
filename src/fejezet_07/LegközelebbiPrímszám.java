package fejezet_07;

public class LegközelebbiPrímszám {

  public static void main(String[] args) {
    System.out.println("Legközelebbi prímszám meghatározása");
    int szám;
    while ((szám = extra.Console.readInt("adjon meg egy pozitív egész számot: ")) <= 0) 
      ;
    System.out.println("Az ehhez legközelebbi prímszám: "
            + legközelebbiPrímszám(szám));
  }

  private static int legközelebbiPrímszám(int szám) {
    if (szám < 2) {
      return 2;
    }
    if (prím(szám)) {
      return szám;
    }
    //Ebben a megoldásban nem akarunk két prímet találni, az elsőnél megállunk.
    int i = 1; 
    boolean vantalálat = false;
    int retval = 0; //kötelező inic., mivel ez lesz a return-ban (!!!)
    do { /*
      if (prím(szám+i)) {
        találat = true;
        retval = szám+i;
      } else if (prím(szám-i)) {
        találat = true;
        retval = szám-i; 
      } */
      /*
      if (!(találat = prím(retval=szám+i)))
        találat = prím(retval=szám-i); */
      vantalálat = prím(retval=szám+i) || prím(retval=szám-i);
      i++;
    } while (!vantalálat);
    return retval;
  }

  public static boolean prím(int szám) { //public: emiatt hívhatjuk másik package-ből/class-ból?
    if (szám < 2)
      return false;
    boolean vanosztója = false;
    int i = 2;
    while (!vanosztója && i<=Math.sqrt(szám)) 
      vanosztója = szám%i++ == 0; 
    return !vanosztója;
  }
}