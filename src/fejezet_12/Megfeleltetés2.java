package fejezet_12;

/**
 *
 * @author Nigel-727
 */
public class Megfeleltetés2 {
  public static void main(String[] args) {
    /*
    Double dblObj = new Double(-7.5);
    String dblStr = (String)dblObj; //nem fordul le
    System.out.println((String)dblObj); //ez se
    */
    Object obj = new Double(-7.5);
    String str = (String)obj; //"java.lang.ClassCastException: java.lang.Double cannot be cast to java.lang.String"
    
  }
}
