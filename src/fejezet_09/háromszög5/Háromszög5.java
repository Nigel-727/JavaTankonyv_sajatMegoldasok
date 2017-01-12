package fejezet_09.háromszög5; 
//hogy a package-en belül a névütközést elkerüljük (class Háromszög több helyen volna definiálva)

/**
 *
 * @author Nigel-727
 */

public class Háromszög5 {

  private static
    Háromszög[] háromszögTömb = new Háromszög[50];      //1
  
  private static void tömbFeltölt() {                   //3
    double oldal;
    for(int i=0; i<háromszögTömb.length; i++) {
      oldal=(int)(Math.random()*100+1);
      háromszögTömb[i]=new Háromszög(oldal);            //4
    }
  }

  private static void tömbLista() {                     //5
    for(int i=0; i<háromszögTömb.length; i++)
      System.out.println((i+1)+". háromszög: "+
        háromszögTömb[i]);
  }

  private static double háromszögTerületÖsszeg() {      //6
    double összeg=0;
    for(int i=0; i<háromszögTömb.length; i++)
      összeg+=háromszögTömb[i].terület();               //7
    return összeg;
  }

  private static void kiválasztottLista() {
    int minKerületIndexe = 0;
    double minKerület = háromszögTömb[minKerületIndexe].kerület();
    int maxTerületIndexe = 0;
    double maxTerület = háromszögTömb[maxTerületIndexe].terület();
    for (int i = 1; i < háromszögTömb.length; i++) {
      Háromszög akt = háromszögTömb[i]; //Azért, h csökkentsük...
      double k; //...1)hibalehetőséget 2)hozzáférések ill. metódushívások...
      if ((k=akt.kerület())<minKerület) { //...számát.
        minKerület = k; 
        minKerületIndexe = i;
      }
      if (maxTerület<(k=akt.terület())) {
        maxTerület = k;
        maxTerületIndexe = i;
      }
    } //for
    System.out.println("\nA kiválasztott háromszögek:\n\n"
            + "a legkisebb kerületű ("+(minKerületIndexe+1)+".)\n" 
            + háromszögTömb[minKerületIndexe] + "\n\n"
            + "a legnagyobb területű ("+(maxTerületIndexe+1)+".)\n" 
            + háromszögTömb[maxTerületIndexe]);
  }

  public static void main(String[] args) {
    System.out.println("Műveletek háromszögekkel\n");
    tömbFeltölt();
    tömbLista();
    kiválasztottLista(); //ezt írtuk hozzá mi (=én) most
  }
}


class Háromszög {

  private double a;

  public Háromszög(double a) {
    setA(a);
  }

  public void setA(double a) {
    if(a<=0)
      a=1;
    this.a=a;
  }

  public double getA() {
    return a;
  }

  public double kerület() {
    return 3*a;
  }

  public double terület() {
    return a*a*Math.sqrt(3)/4;
  }

  @Override
  public String toString() {
    return "Egyenlőoldalú háromszög\n" +
      "  oldalának hossza: "+a+
      "  kerülete: "+extra.Format.left(kerület(), 0, 2)+
      "  területe: "+extra.Format.left(terület(), 0, 2);
  }

  public boolean equals(Háromszög háromszög) {
    return háromszög.getA()==a;
  }
}