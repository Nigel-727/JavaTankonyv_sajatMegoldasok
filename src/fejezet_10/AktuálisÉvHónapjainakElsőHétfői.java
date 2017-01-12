package fejezet_10;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Nigel-727
 */
public class AktuálisÉvHónapjainakElsőHétfői {
  //
  static final String[] HÉTNAPNEVEK = //1..based
    {"", "hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
  static final String[] HÓNAPNEVEK = //1..based
    {"", "január", "február", "március", "április", "május", "június", "július", 
    "augusztus", "szeptember", "október", "november", "december"};
  static byte[] napDbperHó = //1..based
    {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  //
  static boolean szökőév(int év) {
    return (év>=1582) && ((év%4==0 && év%100!=0) || (év%400==0));
  }

  //12-elemű int tömböt ad vissza az első hétfők napsorszámaival
  //: évszám + jan1 hétnapja alapján  
  private static int[] elsőhétfőkHavonta(int év, String jan1Str) {
//    System.out.print("inside int[] elsőhétfőkHavonta(int év, String jan1Str)---");
    //tfh. OK (vagyis jan1Str érvényes hétnap)
    //jan1 indexe a hétnapjaiStr tömbben (kiválasztás):
    int i = 1;
    while (!(HÉTNAPNEVEK[i]==jan1Str))
      i++;
    //Immár megvan jan1 hétnapsorszáma [1..7].
    int hétfőNapja = (i!=1 ? 9-i : i); //az első januári hétfő 
//    System.out.println(hétfőNapja);
    int[] retval = new int[12]; //0..based
    retval[0] = hétfőNapja; //január első hétfője
        if (szökőév(év)) //Ha szökőév, akkor... 
      napDbperHó[2] += 1; //...febuár 1 nappal hosszabb.
    for (int hó = 2; hó <= 12; hó++) //az alábbi képletet (is) én találtam ki:
      retval[hó-1] = hétfőNapja = 
              ((napDbperHó[hó-1]-hétfőNapja)/7+1)*7 + hétfőNapja-napDbperHó[hó-1];
    return retval;
//    return new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //12-elemű; #iLoveJava
  }
  
  //12-elemű int tömböt ad vissza az első hétfők napsorszámaival
  //: évszám alapján
  private static int[] elsőhétfőkHavonta(int év) {
    int[] retval = new int[12]; //0..based
    for (int i = 1; i <= 12; i++) { 
      int elsejeHétnapja 
              = Születésnap.hétNapja(év, i, 1); //adott év+hó+nap milyen hétnapra esik [1..7]
      retval[i-1] =  elsejeHétnapja!=1 ? 9-elsejeHétnapja : elsejeHétnapja;
    } //1->1; 2->7; 3->6; 4->5; 5->4; 6->3; 7->2    
    return retval;
  }
  
  public static String intArrToString(int[] tomb) {
    String retval = "";
    for (int t : tomb) 
      retval += Integer.toString(t)+" ";
    return retval;
  }
  
  public static void main(String[] args) {
    System.out.println("Megmondom ám az AKTUÁLIS év mind a 12 hónapjáról\n"
            + "\thogy az ELSŐ HÉTFŐje milyen napra esik/esett"
            + "\n\t\t(sőt, ha hétfői nap eső is esett, akkor milyen hó) hullott!!!\n");
    /*Megoldás: fv ami 12-elemű tömböt ad vissza, 1..31 számokkal
    Több megoldás:
    - paraméterben: évszám a szökőév miatt, jan 1. milyen napra esik
    - param: évszám; végigszaladva a hónap 1. napjain, felhasználva a Születésnap-beli fv-t
    */
    int[] hétfők1, hétfők2; //1..based indexelés    
    //
    int ideiév1 = 2016; 
    String január1Hétnapja = "péntek";
    hétfők1 = elsőhétfőkHavonta(ideiév1, január1Hétnapja); //#overloading
    System.out.println("* évszám ("+ideiév1+") "
            + "+ január 1. hétnapja ("+január1Hétnapja+") "
            + "alapján: \t" + intArrToString(hétfők1));
    int ideiév2 = new GregorianCalendar().get(Calendar.YEAR);
    hétfők2 = elsőhétfőkHavonta(ideiév2); //#overloading
    System.out.println("* idei év ("+ideiév2+") "
            + "hónapjainak első napjai alapján: \t" + intArrToString(hétfők2));
    //TODO az eredménytömbök feladatspecifikusabb megjelenítése (január: 4, február: ..., stb)
  } //main()
} //class