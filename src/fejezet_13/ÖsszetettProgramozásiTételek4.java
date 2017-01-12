package fejezet_13;

import java.util.*;

public class ÖsszetettProgramozásiTételek4 {//13.6.10
//az eredetit nem én írtam, én csak átírtam
  static TreeSet<Integer> halmazFeltölt(int elemszám) {                                   //1
    TreeSet<Integer> segédHalmaz=new TreeSet<>();
    while(segédHalmaz.size()<elemszám) {
      int tipp=(int)(Math.random()*90+10);
      if(!segédHalmaz.contains(tipp))
        segédHalmaz.add(tipp);
    }
//    Collections.sort(segédHalmaz); //hibás: rendezés...Set-re "not applicable"
    return segédHalmaz;
  }

  static void halmazKiír(TreeSet<Integer> halmaz, String üzenet) {
    System.out.println("\n"+üzenet);
    if(halmaz.isEmpty())                                //3
      System.out.println("Üres halmaz.");
    else
      System.out.println(halmaz);
  }
  
  //Ez volt a #kakukktojás
  static void sorozatKiír(ArrayList<Integer> halmaz, String üzenet) { 
    System.out.println("\n"+üzenet);
    if(halmaz.isEmpty())                                //3
      System.out.println("Üres halmaz.");
    else
      System.out.println(halmaz);
  }

  static TreeSet<Integer> metszet(
      TreeSet<Integer> halmaz1,
      TreeSet<Integer> halmaz2) {
    TreeSet<Integer> segédHalmaz=new TreeSet<>();
    segédHalmaz.addAll(halmaz1);                        //4
    segédHalmaz.retainAll(halmaz2);                     //5
    return segédHalmaz;
  }

  static TreeSet<Integer> unió(
      TreeSet<Integer> halmaz1,
      TreeSet<Integer> halmaz2) {
    TreeSet<Integer> segédHalmaz=new TreeSet<>();
    segédHalmaz.addAll(halmaz1);                        //6
    for(int halmaz2elem: halmaz2)                       //7
      if(!segédHalmaz.contains(halmaz2elem))            //8
        segédHalmaz.add(halmaz2elem);                   //9
//    Collections.sort(segédHalmaz); //...Set -et NEM lehetséges rendezni
    return segédHalmaz;
  }

  static ArrayList<Integer> összefuttatás( // 2db TreeSet -> 1db ArrayList
      TreeSet<Integer> halmaz1,
      TreeSet<Integer> halmaz2) {
    ArrayList<Integer> segédSorozat=new ArrayList<>();
    segédSorozat.addAll(halmaz1);                      //10
    segédSorozat.addAll(halmaz2);                      //11
    Collections.sort(segédSorozat); //ArrayList -et lehetséges rendezni
    return segédSorozat;
  }

  public static void main(String[] args) {
    TreeSet<Integer> halmaz1=halmazFeltölt(20);
    TreeSet<Integer> halmaz2=halmazFeltölt(15);
    halmazKiír(halmaz1, "1. halmaz:");
    halmazKiír(halmaz2, "2. halmaz:");
    halmazKiír(metszet(halmaz1, halmaz2),"Metszethalmaz:");
    halmazKiír(unió(halmaz1, halmaz2), "Unióhalmaz:");
    sorozatKiír(összefuttatás(halmaz1, halmaz2), //!: mert halmazelemek összefuttatása nem halmazt hanem sorozatot eredményez
      "Összefuttatott sorozat:");
  }
}//class