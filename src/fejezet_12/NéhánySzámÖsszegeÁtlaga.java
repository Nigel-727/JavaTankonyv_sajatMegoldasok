package fejezet_12;

/**
 *
 * @author NfelsőHel-727
 */
public class NéhánySzámÖsszegeÁtlaga {
  public static void main(String[] args) {
    System.out.println("Adjad megfele az alsófelső határokat de gyorsan!!!");
    int alsóH=extra.Console.readInt("alsóhatár=? ");
    int felsőH=extra.Console.readInt("felsőhatár=? ");
    if (alsóH>=felsőH)
      throw new IllegalArgumentException("az alsó határ nagyobb/egyenlő mint a felső");
    int osszeg=0;
    for (int i=alsóH; i<=felsőH; i++)
      osszeg+=i;
    System.out.println(
      alsóH+" és "+felsőH+ " között a számok összege: "+osszeg+
      ", a számok átlaga: "+(double)osszeg/(felsőH-alsóH+1));
  }
}
