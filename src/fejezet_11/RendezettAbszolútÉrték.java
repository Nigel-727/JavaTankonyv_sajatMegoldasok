package fejezet_11;

/**
 * Feladat:
 * 0) véletlentömböt előállítani
 * 1) rendezni növekvőbe 2) listázni 3) rendezni abszolútérték szerint 4) listázni
 * 
 * @author Nigel727
 */
public class RendezettAbszolútÉrték { //11.4.3
  
  static final int N = 20;
  static int[] véltömb = new int[N+1]; //ezúttal legyen 1-alapon indexelt
  
  private static void rendezTömb() { //helyben rendez
    for (int i = 1; i <= N-1; i++) {
      for (int j = i+1; j <= N; j++) {
        if (véltömb[i]>véltömb[j]) { //ha rossz a sorrend; !: ez az egyetlen sor különbözik a két metódusban
          int csere = véltömb[i]; véltömb[i] = véltömb[j]; véltömb[j] = csere;
        }
      }
    }
  }
  
  private static void rendezTömByABS() { //helyben rendez; abszolútérték szerint
    for (int i = 1; i <= N-1; i++) {
      for (int j = i+1; j < N; j++) {
        if (Math.abs(véltömb[i])>Math.abs(véltömb[j])) { //!: ez az egyetlen sor különbözik a két metódusban
          int csere = véltömb[i]; véltömb[i] = véltömb[j]; véltömb[j] = csere;
        }
      }
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Bármit megcsinálok a véletlentömbbel,\n\takár abszolútérték szerint is rendezem ám!!!\n");
    
    //feltöltöm és közben kiírom
    System.out.print("eredetileg:\t\t\t\t[ ");
    for (int i = 1; i <= N; i++) {
      véltömb[i] = (int)(Math.floor(Math.random()*41-20)); //[-20..+20]
      System.out.print(véltömb[i]+" ");
    }
    System.out.println("]");
    rendezTömb();
    System.out.print("rendezés után:\t\t\t\t[ ");
    for (int i = 1; i <= N; i++) {
      System.out.print(véltömb[i] + " ");
    }
    System.out.println("]");
    rendezTömByABS();
    System.out.print("absz.érték szerinti rendezés után:\t[ ");
    for (int i = 1; i <= N; i++) {
      System.out.print(véltömb[i] + " ");
    }
    System.out.println("]");
  }//main()
}//class