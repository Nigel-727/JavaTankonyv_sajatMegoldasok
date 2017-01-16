package fejezet_15;

import java.util.ArrayList;

/**
 *
 * @author Nigel-727
 */
interface Határ {
  int ALSÓ = 1, FELSŐ = 1000;
}
abstract class Összeg implements Határ { //#myfirst #absztraktosztály #juhé
  abstract public int összeg();
  protected String tűz() { // #miértne
    return "ŐS" ; // #alakul #őstőlörököltatűz
  }
}
class Összeg1 extends Összeg {
  @Override
  public int összeg() {
    int összeg=0;
    for (int i = ALSÓ; i <= FELSŐ; i++)
      összeg+=i;
    return összeg;
  }
  @Override
  protected String tűz() {
    return "iterációval";
  }
}
class Összeg2 extends Összeg {
  @Override
  public int összeg() {       
//    return FELSŐ*(FELSŐ+1)/2;
    return (ALSÓ+FELSŐ)*(FELSŐ-ALSÓ+1)/2;
  }
  @Override
  protected String tűz() {
    return "Gauss-képlettel"; //To change body of generated methods, choose Tools | Templates.
  }
}
class Összeg3 extends Összeg {
  private int összeg0(int n) {
    if(n==ALSÓ)
      return ALSÓ;
    return n+összeg0(n-1);
  }
  @Override
  public int összeg() {
    return összeg0(FELSŐ);
  }
  @Override
  protected String tűz() {
    return "rekurzióval";
  }
}
public class ElsőNÖsszege5 {
  public static void main(String[] args) {
    System.out.println("Az egészek összege "+Összeg.ALSÓ+" és "+Összeg.FELSŐ+" között:");
    ArrayList<Összeg> számolók = new ArrayList<>();
    számolók.add(new Összeg1());
    számolók.add(new Összeg2());
    számolók.add(new Összeg3());
    for (Összeg számoló : számolók) {
      System.out.println("számoló típusa: "+számoló.getClass().getSimpleName());
      System.out.println("\ta számított érték: "+számoló.összeg());
      System.out.println("\t(a módszer: "+számoló.tűz()+")"); // Őstől örökölt a tűz() #kóderhumor
    }
  }
}