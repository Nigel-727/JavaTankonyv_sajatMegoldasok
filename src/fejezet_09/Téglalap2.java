package fejezet_09;
/**
 * Használja a fejezet9.Téglalap osztályt (in Téglalap.java) !!!
 * @author Nigel-727
 */
public class Téglalap2 {
  
  public static void main(String[] args) {
    System.out.println("\"Téglalap2\" -- "
            + "a téglalap adattípus megvalósítása\n");
    Téglalap téglák[] = new Téglalap[2];
    téglák[0] = new Téglalap(5, 12);
    téglák[1] = new Téglalap(0, 0);
    for (int i = 0; i < téglák.length; i++) 
      System.out.println("téglalap #"+(i+1)+":\n"
              + téglák[i]);
    System.out.println("Második tégla adatainak beállítása...");
    téglák[1].setAB(12, 5);
    System.out.println(téglák[1]);
    System.out.println("Most egyenlőek-e a téglalapok? "
            + (téglák[0].equals(téglák[1])?"IGEN":"nem"));
  }
  
} //class Téglalap2 (a vezérlő osztály)
