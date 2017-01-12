package fejezet_13;

import java.util.ArrayList;

/**
 * Armstrong-szám definiciója: 
 * n-jegyű szám, amely előállítható a számjegyek n-edik hatványának összegeként
 * például 153 = 1*1*1 + 5*5*5 + 3*3*3 (1+125+27=126+27=153)
 * Feladat: tároljuk el a 3-jegyű A.-számokat egy tömblistában!
 * A megvalósítás saját fv-nyel (param: 3-jegyű szám) történjen! 
 * 
 * @author Nigel-727
 */
public class ArmstrongSzámok2 { 
  
  //gyakorlásféleképpen: tömbben visszaadjuk a számjegyeket;
  //ezúttal: 10 csökkenő (10^19, 10^18, ..., 10^3, 10^2, 10^1, 10^0) hatványaival osztunk 
  //amíg 0-tól különböző hányadost kapunk; a hányadosok a számjegyek;
  //számjegy eltárolása után a a számot a fenti osztás maradékával tesszük egyenlővé
  static int[] bontSzámjegyekre(int x) { //drága algoritmus #tudjuktudjuk
    int[] szjegyek = new int[20]; 
    int szjegyekDb = 0;     
    boolean számbanVagyunkE = false;
    for (int i = szjegyek.length-1; i >= 0; i--) {
      int szjegy = (int)(x/Math.pow(10,i));
      if (számbanVagyunkE || (szjegy != 0)) { //ha találtunk szjegyet
        számbanVagyunkE = true;
        szjegyek[szjegyekDb++] = szjegy;
        x %= Math.pow(10,i); //eldobjuk az aktuálisan első helyiértéket
      }//if
    }//for
    int [] ezkellneked = new int[szjegyekDb];
    for (int i = 0; i < ezkellneked.length; i++) 
      ezkellneked[i] = szjegyek[i];
    return ezkellneked;
  }//bontSzámjegyekre()
  
  static boolean isArmstrong(final int X) {
    //lebontjuk számjegyekre (az értékeket tömbben tároljuk):
    int[] szjegyek = new int[20]; //TODO mi a leghosszabb tárolható érték
    int szjegyekDb = 0; //szjegyek tömbön aktuális értékeselem-száma
    int x = X;
    do {
      szjegyek[szjegyekDb++] = x % 10;
      x /= 10;
    } while (0 < x); // osztandó/osztó=hányados
    //összegezzük a számjegyeket:
    int hatványÖsszeg = 0; //vagy: "szjegyekHatványainakÖsszege"
    for (int i = 0; i < szjegyekDb; i++)
      hatványÖsszeg += Math.pow(szjegyek[i], szjegyekDb);
    return X == hatványÖsszeg; //TODO
  }//isArmstrong()
  
  public static void main(String[] args) {
    System.out.println("Armstrong-számok ONE ***\n");
    /*Ötlet: haladjunk végig a 3-jegyű számokon és döntsük el mindről h A.-szám-e, 
      ha igen -> tároljuk*/
    ArrayList<Integer> threeDigitArmstrongs = new ArrayList<>();
    for (int i = 100; i <= 999; i++) 
      if (isArmstrong(i))
        threeDigitArmstrongs.add(i);
    System.out.println("A 3-jegyű Armstrong-számok:\n"+threeDigitArmstrongs);
/*
    for (Integer jegy : bontSzámjegyekre(19750727)) //TESZT
      System.out.print(jegy+" ");
    System.out.println();
*/
  }//main()
}//class