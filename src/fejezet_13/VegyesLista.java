package fejezet_13;

import java.util.*;

/**
 * a lista az vegyes, de nem ugyanazokkal az értékekkel töltöm fel
 * gyakorlásféleképpen
 * 
 * @author Nigel-727
 */
public class VegyesLista {
  
  static boolean isEgészSzám(Object ojjektum) {
    return  ojjektum instanceof Byte || //vagy...
            ojjektum instanceof Short || //vagy...
            ojjektum instanceof Integer || //vagy...
            ojjektum instanceof Long;
  }
  
  public static void main(String[] args) {
    System.out.println("Bármit belerakok ám a típusnélküli listába!!!\n");
    ArrayList típusnélküListArray = new ArrayList();
    típusnélküListArray.add(50);
    típusnélküListArray.add(50.5);
    típusnélküListArray.add("valami");
    típusnélküListArray.add(new String("És még VALAMI."));
    típusnélküListArray.add((byte)51);
    típusnélküListArray.add(new Double(1975.727));
    típusnélküListArray.add(-49.5F);
    típusnélküListArray.add(new Random());
    típusnélküListArray.add((int)Math.random()*10);
    típusnélküListArray.add(null);
    típusnélküListArray.add(new Date());
    //összeadom amit lehet
    int számDb=0, nemszámDb=0;
    double összeg=0;
    for (int i = 0; i < típusnélküListArray.size(); i++) {
      Object obj = típusnélküListArray.get(i); //i. elem
      if (obj instanceof Number) { //ha Number osztályú objektum
        számDb++;
        összeg += isEgészSzám(obj) 
                ? Long.parseLong(obj.toString())
                : Double.parseDouble(obj.toString());
      } else
        nemszámDb++;
    }//for
    System.out.println("A típusnélküli listában "
            + számDb + " db szám van, összegük: " + összeg + "."
            + "\nA típusnélküli lista tartalmaz még " + nemszámDb + " db nemszámot.");
  }//main()
}//class
