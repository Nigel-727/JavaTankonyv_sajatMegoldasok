package fejezet_12;

/**
 *
 * @author Nigel-727
 */
public class NégyzetKerületTerület {
  static class Négyzet {
    public Négyzet(int a) {
      if (a<=0)
        throw new IllegalArgumentException("Hiba: a négyzet oldala ("+a+") <=0.");
      System.out.println("Kerület: "+(4*a)+", Terület: "+(a*a));
    }
    
  }
  public static void main(String[] args) {
    try {
      Négyzet négyzet1 = new Négyzet(12);
      Négyzet négyzet2 = new Négyzet((int)-7.5);
    } catch (IllegalArgumentException e) {
      System.out.println("Hiba történt!\n"+e.getMessage());
    }
  }
}
