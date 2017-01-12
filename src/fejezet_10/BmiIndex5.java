package fejezet_10;

public class BmiIndex5 {
  public static void main(String[] args) {
    System.out.println("BMI index határok");
    boolean ok;
    int testMagasság;
    do {
      testMagasság=extra.Console.readInt("Testmagasság [100-200](cm): ");
      ok=(100<=testMagasság && testMagasság<=200);
      if(testMagasság<100)
        System.out.println("Túl alacsony. Újra!");
      if(testMagasság>200)
        System.out.println("Túl magas. Újra!");
    } while(!ok);

    int[] bmiHatárok = {20, 25, 30, 40};
    String[] értékelések = {"sovány", "normál", "túlsúlyos", "elhízott"};
    
    int testTömeg=15; //fiktív alsó határ a min. 100 cm miatt
    double osztó; //bevezetjük
    double bmi=testTömeg/(osztó=Math.pow(testMagasság/100.0, 2));
    System.out.println("Aki "+testMagasság+" cm magas:");
    for (int i = 0; i < bmiHatárok.length; i++) {
      while (bmi<bmiHatárok[i])
        bmi=testTömeg++/osztó;
      System.out.println("  "+testTömeg+" kg alatt "+értékelések[i]+", egyébként");
    }
  }
}