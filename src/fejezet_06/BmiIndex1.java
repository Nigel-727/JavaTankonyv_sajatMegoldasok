package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class BmiIndex1 {
  public static void main(String[] args) {
    System.out.println("BMIIndex... Adja meg a testmagasságot cm-ben [100, 200], majd a testtömeget kg-ban [40, 150]!");
    //BMI = tömeg/négyzet(magasság méterben)
    //<20 sovány; <25 normál; <30 túlsúlyos; <40 elhízott; else kórosan_elhízott
    boolean ok = false;
    double magMéter;
    do 
      ok = 1.00 <= (magMéter=0.01*extra.Console.readDouble("magasság (cm) = ? "))
              && magMéter <= 2.00;
    while (!ok);
    double tömegKg;
    do
      ok = 40 <= (tömegKg=extra.Console.readDouble("tömeg (kg) = ? "))
              && tömegKg <= 150;
    while (!ok);
    //
    System.out.println("Te "+extra.Format.left(magMéter, 0, 2)+" m magas vagy,"
            + " miközben "+extra.Format.left(tömegKg, 0, 2)+" kilót nyomsz, ami azt jelenti hogy:");
    double BMI;
    if ((BMI = tömegKg/Math.pow(magMéter, 2)) < 20)
      System.out.println("Sovány vagy.");
    else if (BMI < 25)
      System.out.println("Normális vagy.");
    else if (BMI < 30)
      System.out.println("Túlsúlyos vagy.");
    else if (BMI < 40)
      System.out.println("Dagadt vagy.");
    else 
      System.out.println("Kövér disznó vagy.");
  }
}
