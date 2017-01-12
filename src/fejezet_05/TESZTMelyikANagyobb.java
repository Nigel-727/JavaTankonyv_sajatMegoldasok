package fejezet_05;

public class TESZTMelyikANagyobb {
  public static void main(String[] args) {
    int a;
    a = extra.Console.readInt("Kérem az első számot: ");
    int b;
    b = extra.Console.readInt("Kérem a második számot: ");
    System.out.println("A nagyobb szám: " +
            (boolToInt(a>b)*a + boolToInt2(b>a)*b));  // ez a sor a lényeg
    
    System.out.println("Boolean.compare(bool,bool) TESZT:"
              + " "+Boolean.compare(true,false) //true vs false : 1
              + ", "+Boolean.compare(true,true)
              + ", "+Boolean.compare(false, false)
              + ", "+Boolean.compare(false, true)
            //olyan, mintha 
            //true vs FALSE   : 1 = 1-0; vagyis hamissal hasonlításnál 1 amikor igaz...
            //true vs true    : 0 = 1-1
            //false vs FALSE  : 0 = 0-0; ...és 0 amikor hamis
            //false vs true   : -1 = 0-1
    );
  }
  
  /*
   A feladat megoldása Java nyelven igényli a boolToInt metódus
   megírását, mert a nyelv szigorúan típusos volta miatt a logikai
   kifejezés értéke csak bool típusú lehet.
   Az eredeti megvalósítés basic és pascal nyelven készült, ahol
   egy logikai kifejezés értéke lehet 0 vagy 1, tehát egész szám típus,
   ezért lehetséges vele a szorzás művelet.
  */
  
  public static int boolToInt(Boolean b) {
    return b.compareTo(false);  //objektum metódusa
  }
  
  public static int boolToInt2(Boolean b) {
    return Boolean.compare(b, false);         // csak Java7-től
    //osztály (statikus) metódusa
  }
}