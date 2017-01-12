package fejezet_09;

/**
 *
 * @author Nigel-727
 */
public class Kutyák {
  
  private static Kutya[] kutyatömb 
          = new Kutya[5]; //valójában: Kutya-ra "mutatók" tömbje
  
  public static void main(String[] args) {
    kutyatömb[0] = new Kutya("Bodri", (byte)7); //Kutya-ra "mutató"
//    kutyatömb[1].setNév("Kázmér"); //    kutyatömb[1].setKor((byte)5); //nullpointer exception
    kutyatömb[1] = new Kutya("Kázmér", (byte)5);
    kutyatömb[2] = new Kutya("Alfi", (byte)9);
    kutyatömb[3] = new Kutya("Csahos", (byte)4);
    kutyatömb[4] = new Kutya("Füles", (byte)6);
    // kutyák listája:
    for (Kutya k : kutyatömb)
      System.out.println(k);
    // max.kiválasztás
    int maxHely = 0;
    byte maxKor = kutyatömb[maxHely].getKor();
    for (int i = 1; i < kutyatömb.length; i++) 
      if (maxKor < kutyatömb[i].getKor()) 
        maxKor = kutyatömb[maxHely=i].getKor();
    //
      System.out.println("A(z első) legöregebb kutya "
              + maxKor + " éves, a neve: " + kutyatömb[maxHely].getNév());
  } //main()
} //Kutyák

class Kutya {
  //
  private String név;
  private byte kor;
  //

  public Kutya(String név, byte kor) {
    this.név = név;
    this.kor = kor;
  }

  public byte getKor() {
    return kor;
  }

  public String getNév() {
    return név;
  }

  public void setKor(byte kor) {
    if (1<=kor && kor<=30)
      this.kor = kor; //TODO else dobhat kivételt
  }

  public void setNév(String név) {
    this.név = név;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() 
            + "{név: " + getNév() + ", " + getKor() + " év}";
//    return super.toString(); //To change body of generated methods, choose Tools | Templates.
  }
  
  
  
  
}
