package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class Kétjegyű5telOszthatóSzámok {

  public static void main(String[] args) {
    final int M = 5; //ezzel való osztást vizsgáljuk
    System.out.println("Kétjegyű, " + M
            + "-ggyel/-vel/-mal/-tel/-tal/-cal/-cel/-zel osztható számok kiírása");
    //összes kétjegyűt vizsgáljuk
    for (int i = 10; i < 100; i++) {
      if (i % M == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println("");
    //M-sével lépkedünk
    for (int i = 10; i < 100; i += M) {
      System.out.print(i + " ");
    }
    System.out.println("");
    //a fenti 1. változat elöltesztelő ciklussal
    { //miért ne!? :) tesztelem h blokkban definiált változók meddig élnek
      int i = 10;
      while (i < 100) {
        if (i % M == 0) {
          System.out.print(i + " ");
        }
        i++;
      }
      System.out.println();
    }
    //hátultesztelővel
    int i = 10;
    do {
      if (i % M == 0) {
        System.out.print(i + " ");
      }
      i++;
    } while (i < 100);
    System.out.println();
  }
}
