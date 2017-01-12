package fejezet_13;

import java.util.ArrayList;

/**
 *
 * @author Nigel-727
 */
public class KockaDobás5 {
  
  private static int dobKocka() {
    return (int)(Math.random()*6+1);
  }
  
  public static void main(String[] args) {
    System.out.println("\"Kockadobás5\" *** SOSE LEHET MEGUNNI\n");
    System.out.println("Hányszor akarod h dobjam a kockákat?");
    //Vagy kockát vagy kivételt dobok: #kockavagykivétel
    int hányszor;
    while((hányszor=extra.Console.readInt(": "))<=0)
      System.out.println("NE akard h kockák helyett egy kivételt dobjak... (POZITÍV hozzáállást kérek)");
    //külön tárolom az 1-ik ill a 2-ik kockával történt dobásokat
    ArrayList<Integer> kocka1dobások = new ArrayList<>(hányszor); //nem volna muszáj a kapacitás
    ArrayList<Integer> kocka2dobások = new ArrayList<>(hányszor);
    //dobjunk:
    for (int i = 0; i < hányszor; i++) {
      kocka1dobások.add(dobKocka());
//      kocka2dobások.set(i, dobKocka()); //#HIBA; csak akkor lehetne így ha már volna az indexen értékes elem
      kocka2dobások.add(dobKocka());
    }//for
    //összegezzünk:
    ArrayList<Integer> dbTömblista = new ArrayList<>();
    //TODO nullázni; muszáj?
    for (int i = 0; i < 11; i++) //TODO hogyan lehet lekérdezni a kapacitást?
      dbTömblista.add(0);
    //
    for (int i = 0; i < hányszor; i++) { //vagy: .size()
      int összeg = kocka1dobások.get(i) + kocka2dobások.get(i);
//System.out.print(összeg+" "); //#teszt
      dbTömblista.set(összeg-2, //!: összeg helyre... #
              dbTömblista.get(összeg-2)+1); //...az ott lévő érték+1 -et
    }//for
//System.out.println(""); //#teszt
    //output
    for (int i = 0; i < 11; i++) {
      System.out.println(
              extra.Format.right(i+2, 4)
              +" mint összeg: "
              +dbTömblista.get(i)+" db"
      );
    }
  }//main
}//class