package fejezet_15;

import java.util.ArrayList;

/**
 *
 * @author Nigel-727
 */
class Pont2D {
  int x, y;
  Pont2D(int x, int y) {
    this.x=x; this.y=y;
  }
  protected String felirat() {
    return "eredeti";
  }
  @Override
  public String toString() {
    return "x="+x+",y="+y+"("+felirat()+")";
  }
}
public class Pontok {
  public static void main(String[] args) {
    Pont2D  p0 = new Pont2D(0,0),
            p1 = new Pont2D(1,1) {
              @Override
              protected String felirat() {
                return "p1-ben felülírt";
              }
            }; 
    ArrayList<Pont2D> lista = new ArrayList<>();
    lista.add(p0); lista.add(p1); 
    lista.add(new Pont2D(5, 6) {
      @Override
      protected String felirat() {
        return "névtelenben felülírt"; 
      }
    });
    System.out.println("a lista:\n"+lista);
  }
}