package fejezet_12;

/**
 *
 * @author Nigel-727
 */
public class Ötszög {
  public static void main(String[] args) {
    System.out.println("Ötszög!!!\n");
    double a = extra.Console.readDouble("lökjed az egész számot: ");
    if (a<=0)
      throw new RuntimeException("E kivétel erősíti a szabályt.");
    double terület =
            5*a*a*Math.tan(Math.toRadians(54))/4;
    double kerület =
            5*a;
    System.out.println("Terület: "+terület+"; Kerület: "+kerület);
  }
}
