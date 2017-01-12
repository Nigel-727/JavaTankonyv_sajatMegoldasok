package fejezet_08;

public class SzámokElőfordulása {

  private static int[] számok = new int[30];
//  private static int[] számok = new int[500]; //<-a feladatspecifikáció
  
  public static void main(String[] args) {
    System.out.println("\"SzámokElőfordulása\"\n//"
            + számok.length 
            + " elemű tömb, 2-jegyű vél.számokkal; megmondom h melyik szám hányszor fordult elő\n");
    for (int i = 0; i < számok.length; i++) 
      számok[i] = twodigitrandom();
    //megoldás #1: számláló tömb, számossága: 10..99 (90)    
    int[] számokDb = new int[90]; //számlálók tömbje (= melyik számból hányat);
    for (int i: számokDb)
      számokDb[i] = 0;
    for (int i = 0; i < számok.length; i++) 
      számokDb[számok[i]-10]++; //BELSŐ indexelés
    //megoldás #2: meghatározom min, max elemértéket, majd ez alapján kreálok tömböt (előzőnél <= számossággal)
    //...
    //output:
    kiírSzámok();
    System.out.println("az előfordulások:");
    for (int i = 0; i < számokDb.length; i++) 
      System.out.print(
              (i+10)+": "+számokDb[i]+" db"
              + ((i+1) % 10 != 0 ? ", " : "\n" ));
    System.out.println();
  } //main()
  
  private static int twodigitrandom() {
    return (int)(Math.random()*90+10); //kétjegyű poz. egész (10..99)
  }
  
  private static void kiírSzámok() {
    System.out.println("a számok jelenleg:");
    for (int i = 0; i < számok.length; i++) 
      System.out.print( számok[i]
              + ((i+1) % 10 != 0 ? ", " : "\n") 
      );
    System.out.println();
  }
} //class
