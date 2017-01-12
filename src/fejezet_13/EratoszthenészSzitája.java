package fejezet_13;

import java.util.TreeSet;

/**
 * okos algoritmus (számelmélet), hasznos lehet tanulmányozni 
 * 
 * @author Nigel-727
 */
public class EratoszthenészSzitája { //13.6.4
  public static void main(String[] args) {
    System.out.println("Szitálok ám, de legalább úgy mint Eratoszthenész, a tehenész!!!\n");
    TreeSet<Integer>  számHalmaz = new TreeSet<>(), //TODO ArrayList-tel ugyanezt
                      prímHalmaz = new TreeSet<>();
    final int BŰVÖSSZÁM = 1000;
    for (int i = 2; i < BŰVÖSSZÁM; i++)  //2, 3, 4, ..., BŰVÖSSZÁM
      számHalmaz.add(i);
    //
    for (int i = 2; i <= Math.sqrt(BŰVÖSSZÁM); i++) {
      //prímHalmazhoz adjuk a számHalmaz aktuálisan legkisebb elemét:
      int szám;
      prímHalmaz.add(szám=számHalmaz.first()); //2, ...
      //számHalmazból eltávolítjuk szám összes többszörösét:
      int szorzó=1;
      while(szám*szorzó<=BŰVÖSSZÁM) //amíg a szorzat nem haladja meg a bűvösszámot
        számHalmaz.remove(szám*szorzó++); //2, 4, 6, 8, 10, 12, ... (amikor szám==2)
    }//for
    //prímHalmaz := prímHalmaz unió számHalmaz:
    prímHalmaz.addAll(számHalmaz); //vagyis hozzáadjuk azokat amik semminek nem többszörösei
    System.out.println("A prímszámok 1-től " + BŰVÖSSZÁM + "-ig: \n"
            + prímHalmaz);
  }//main()
}//class