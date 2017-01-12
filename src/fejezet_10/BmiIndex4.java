package fejezet_10;

public class BmiIndex4 {

  static int beolvas(String üzenet,                     //1
      int alsóHatár, int felsőHatár) {                  //2
    boolean ok;
    int x;
    do {
      x=extra.Console.readInt(üzenet+": ");
      ok=(alsóHatár<=x && x<=felsőHatár);
      if(x<alsóHatár)
        System.out.println("Túl kicsi szám. Újra!");
      if(x>felsőHatár)
        System.out.println("Túl nagy szám. Újra!");
    } while(!ok);
    return x;                                           //3
  }
  
  static double bmi(int tömeg, int magasság) {          //4
    return tömeg/(Math.pow(magasság/100.0, 2));         //5
  }
  
  static String értékelés(double bmi) {                   //6
    String értékelés = "\n";
    if(bmi<20)
      értékelés += "sovány";
    else if(bmi<25) //bmi>=20
      értékelés += "normál";
    else if(bmi<30) //bmi>=25
      értékelés += "túlsúlyos";
    else if(bmi<40) //bmi>=30
      értékelés += "elhízott";
    else //bmi>=40
      értékelés += "kórosan elhízott";
    return értékelés+" testalkatú.\n";
  }

  public static void main(String[] args) {
    System.out.println("BMI index kiszámítása");
    int testMagasság=
      beolvas("Testmagasság (cm) [100; 200]", 100, 200);//7
    int testTömeg=
      beolvas("Testtömeg (kg) [40; 150]", 40, 150);     //8
    double bmi=bmi(testTömeg, testMagasság);            //9
    System.out.print(
            "Ön "+testMagasság+" cm magas és "+
      testTömeg+" kg tömegű, így BMI indexe "+
      extra.Format.left(bmi, 0, 1)+", tehát Ön "+ 
                    értékelés(bmi));                              
  }
}