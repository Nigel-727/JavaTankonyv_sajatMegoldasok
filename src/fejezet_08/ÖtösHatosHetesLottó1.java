package fejezet_08;

public class ÖtösHatosHetesLottó1 {
  
  static final int[][] lottófajta = {
    {5, 90},  //hányat, hányból
    {6, 45}, 
    {7, 35},
    {8, 21}   //van ilyen?! :)
  };

  public static void main(String[] args) {
    System.out.println("\"ÖtösHatosHetesLottó1\"\n");
    for (int i = 0; i < lottófajta.length; i++) {
      lottóKiír(
              lottó( lottófajta[i] ) //amit átadunk: egy teljes SOR, mint tömb
      );
    }
  } //main()
  
  private static int[] lottó(int[] fajta) { //tömböt ad vissza    
    boolean[] voltmár = new boolean[fajta[1]]; //1. indexen: a legnagyobb kihúzható szám
    for (int j = 0; j < voltmár.length; j++) {
      voltmár[j] = false;
    }
    int[] számok = new int[fajta[0]];  //ebből lesz a retval
    int jószámDb = 0;
    while (jószámDb < fajta[0]) { //0. indexen: ahány számot húzni kell
      int vél = (int)(Math.random()*voltmár.length); //BELSŐ ábrázolással
      if (!voltmár[vél]) {
        voltmár[vél] = true;
        számok[jószámDb++] = vél;
      }        
    }    
    return számok;
//    return new int[] {1, 2, 3, 4, 5}; //kezdetben ez is OK
  }
  
  private static void lottóKiír(int[] számok) {
    System.out.print("Lottó \""
            +számok.length
            +"\" számai: ");
    for (int i : számok)
      System.out.print(
              extra.Format.right(i+1, 2) //konverzió "KÜLSŐ" ábrázolásra
              +" "); 
    System.out.println();
  }
  
} //class