package fejezet_13;

import java.util.HashSet;

/**
 * Kriptoaritmatikai feladvány *** zh1-ben is volt ilyesmi
 * 
 * Ezúttal generikus HashSet (nemrendezett halmaz) legyen a mögöttes adatszerkezet!
 *  SEND
 * +MORE
 * -----
 * MONEY
 * 
 * @author Nigel-727 (on win10.desktop)
 */
public class SendMoreMoney2 { //13.6.16
  
  public static int összerakSzámot(int[] szjegyek) { //ez a fv még jó lehet vmire
    int ezkellneked=0, tízhatványa=0;
    for (int i = szjegyek.length-1; i >= 0; i--) 
      ezkellneked += szjegyek[i]*Math.pow(10, tízhatványa++);
    return ezkellneked;
  }
  
  public static void main2(String[] args) {
    System.out.println("GYAKORLÁS"); //ismerkedem a ...Set-tel
    HashSet<Integer>  nullátólKilencig = new HashSet<>();
    HashSet<Integer>    egytőlKilencig = new HashSet<>();    
    for (int i = 0; i <= 9; i++) 
      nullátólKilencig.add(i);
    egytőlKilencig.addAll(nullátólKilencig);
    egytőlKilencig.remove((Integer)0);
/*
    HashSet<Integer>    metszet = new HashSet<>(nullátólKilencig);
    metszet.retainAll(egytőlKilencig);
    System.out.println(
            egytőlKilencig
            +"\n"+nullátólKilencig
            +"\n"+egytőlKilencig.contains((Integer)0)
            +"\n"+egytőlKilencig.size()
            +"\n"+egytőlKilencig.toArray()[0] // #iLoveJava
            +"\n"+nullátólKilencig.containsAll(egytőlKilencig)
            +"\n"+egytőlKilencig.containsAll(nullátólKilencig)
//            +"\n"+new HashSet<Integer>(nullátólKilencig).retainAll(egytőlKilencig) //lefordul, de mást csinál
            +"\n"+metszet //1, ..., 9
            +"\n"+nullátólKilencig.removeAll(egytőlKilencig) //true
            +"\n"+nullátólKilencig //[0]
            +"\n"+nullátólKilencig.size() //1
            +"\n"+nullátólKilencig.remove((Integer)0) //true
            +"\n"+nullátólKilencig.size() //0
            +"\n"+nullátólKilencig.isEmpty()//true
    );
*/    
    //Gyakorlófeladat. 
    //Írjunk algoritmust ami kiírja halmaz1 számokat kivéve ami benne van halmaz2-ben!(=a különbséget)
    //de ne csak .toString() -gel, hanem egyenként!
    HashSet<Integer>        kisebbítendő = new HashSet<>(nullátólKilencig);
    HashSet<Integer>        kivonandó = new HashSet<>();
    System.out.println("kisebbítendő: \t\t\t"+kisebbítendő);        
    kivonandó.add(4); kivonandó.add(6); kivonandó.add(8);    
    System.out.println("kivonandó: \t\t\t"+kivonandó);    
    kisebbítendő.removeAll(kivonandó); //.removeAll: két halmaz KÜLÖNBSÉGE; 
    //.toString() -es kiírás:
    System.out.println("különbség: \t\t\t"+kisebbítendő); //különbség: a kissebbítendő "rongálva" 
    HashSet<Integer>    halmaz1 = new HashSet<>(egytőlKilencig);
    halmaz1.remove(7); halmaz1.remove(5);
    System.out.println("halmaz1: \t\t\t"+halmaz1);
    HashSet<Integer>    metszet = new HashSet<>(kisebbítendő);
    metszet.retainAll(halmaz1);
    System.out.println("különbség metszet halmaz1: \t"+metszet);
    //for(i...) contains(i) kiírás:
    for (int i = 0; i <= 9; i++) 
      if (kisebbítendő.contains((Integer)i))
        System.out.print(i+" ");
    System.out.println();
    //"foreach" .toArray() kiírás:
    for (Object o : kisebbítendő.toArray()) //!: halmazobjektum.toArray()
      System.out.print(o+" ");
    System.out.println();    
    //for(i...) .toArray[] kiírás: 
    for (int i = 0; i < kisebbítendő.toArray().length; i++) 
      System.out.print(kisebbítendő.toArray()[i]+" ");
    System.out.println();    
  }//main
  
  public static void main(String[] args) {
    System.out.println("KüldjMégTöbbPénzt2 *** Megoldok ám most már mindenféle kriptoaritmetikai aritmetikát!!!\n");
    HashSet<Integer> felhasználtakListája = new HashSet<>();
    //TODO egészen biztos 100% sure, hogy az alábbinál is van elegánsabb megoldás ami ...Set-et használ #tudom
    //Ötlet: a buta for ciklusok helyett halmazműveletek vezérelhetnék a léptetést
    int s, e, n, d, m, o, r, y; 
    for (s=1; s<=9; s++) {
      for (e=0; e<=9; e++) {
        for (n=0; n<=9; n++) {
          for (d=0; d<=9; d++) {
            for (m=1; m<=9; m++) {
              for (o=0; o<=9; o++) {
                for (r=0; r<=9; r++) {
                  for (y=0; y<=9; y++) {
                    //Ha nem mind különböző akkor "continue", máskülönben jöhet a #VIZSGÁLAT!
                    felhasználtakListája.clear();
                    int[] felhasználtak = new int[] {s, e, n, d, m, o, r, y};
                    boolean belement_e=false;
/*                    
                    //#VAGY_ÍGY (K.S. lényegileg így oldotta meg a könyvben):
                    for (int szjegy : felhasználtak)  //?: milyen metódus tud Array-t ...Set-be/...ArrayList-be kopizni?
                      felhasználtakListája.add(szjegy);
                    belement_e = (felhasználtakListája.size() == felhasználtak.length); //mindet bele tudtuk rakni (=egyediek voltak)
*/                    
///*                    
                    //#VAGY_ÚGY (futási időket tekintve EZ a gyorsabb algoritmus, _ez a saját_ ötletem):
                    int i=0;
                    while (i<felhasználtak.length 
                            && (belement_e=felhasználtakListája.add(felhasználtak[i])))
                      i++;
//*/                    
                    if (belement_e) { //a ciklusváltozók aktuális értékei egyediek
                      //a #VIZSGÁLAT (+output):
                      int összeadandó1, összeadandó2, összeg;
                      if ( (összeg=összerakSzámot(new int[] {m, o, n, e, y})) == 
                              (összeadandó1=összerakSzámot(new int[] {s, e, n, d})) +
                              (összeadandó2=összerakSzámot(new int[] {m, o, r, e})) )
                        System.out.println("Találat! ("+összeadandó1+"+"+összeadandó2+"="+összeg+")");
                    }//if
                  }//y
                }//r
              }//o
            }//m
          }//d
        }//n
      }//e
    }//s
  }//main()
}//class

/* //a vizsgálat:
  összeadandó1  = new int[]    {s, e, n, d};
    összeadandó2  = new int[]    {m, o, r, e};
    összeg        = new int[] {m, o, n, e, y};
    boolean találat = 
        (összerakSzámot(összeg) == összerakSzámot(összeadandó1) + összerakSzámot(összeadandó2));
    if (találat)
      System.out.println("Találat! ("+összeadandó1+"+"+összeadandó2+"="+összeg+")");
*/

//TODO for sablonját megváltoztatni (szóközök számát redukálni) #netbeans

/* output:
run:
KüldjMégTöbbPénzt2 *** Megoldok ám most már mindenféle kriptoaritmetikai aritmetikát!!!

Találat! (9567+1085=10652)
BUILD SUCCESSFUL (total time: 4 seconds)
*/