package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class SzökőévBeolvasása {

  public static void main(String[] args) {
    System.out.println("Megmondom, szökőév-e!\n");
    System.out.println("Na de akko' mostan írjál egy szökőévet befele!");
    //
    int év;
    boolean ok = false; //ha mégsem kapna értéket
    do 
      if (!(ok 
              = (1582 < (év = extra.Console.readInt("na mi a szökőév = ? "))) 
              && (0 == év % 4 && 0 != év % 100) || (0 == év % 400))) 
        System.out.println("Na, ne viccelj!");
    while (!ok); //false esetén marad a ciklusban
    System.out.println("Köszi, haver.");
  }
}
