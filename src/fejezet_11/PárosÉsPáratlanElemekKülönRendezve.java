package fejezet_11;

/**
 * @author Nigel727
 */

public class PárosÉsPáratlanElemekKülönRendezve { //#whataname
  
  //!: az "ütköző" elem; 
  //Mivel a párosak és páratlanok tömbjeinek aktuális hosszát
  //nem tudjuk lekérni (mivel most NEM használok GLOBÁLIS tömböket, változókat)
  //ezért a tömbökben az értékes elem hiányát az "ütköző" elemmel jelzem.
  //kihasználja: tömbArrToString() kiíró metódus
  private static final int INVALID_VALUE = Integer.MIN_VALUE;
  
  private static void feltöltTömb(int[] tömb) {
    for (int i = 0; i < tömb.length; i++) 
      tömb[i] = 
              (int)(Math.random()*90+10);
//              12; //TESZT; OK
//              11; //TESZT; OK
  }
  
  private static String tömbArrToString(int[] tomb) {
    String ezkellneked = "[ ";
    if (tomb!=null) 
      for (int e : tomb) 
        if (e != INVALID_VALUE) //ravasz
          ezkellneked += e + " ";
    return ezkellneked + "]";
  }
  
  //LINEáris _keresés_; kihasznál: növekvő rendezettség
  //output: index (legelső tömbelem ami nagyobb mint _újelem_ ; addig lépkedünk amíg tömbelem<=_újelem_)
  private static int linElsőNagyobbIndexe(int újelem, int tomb[], int tombelemszam) {
    //tfh. OK: tombelemszam<=tomb.length; TODO
    int i=0;
    while (i<tombelemszam 
            && újelem>=tomb[i]) //az első, nála nagyobb elemig megyünk
      i++;
    return i<tombelemszam ? i : tombelemszam; //az első, nála nagyobb elem indexe VAGY tombelemszam
  }
  
  //BINáris _keresés_ (amit eleve csakis rendezettben lehet)
  //output: index (...)
  private static int binElsőNagyobbIndexe(int e, int tomb[]) {
    //...
    return -1; //TODO megírni
  }
          
  //beszúr: elemet, tömbbe, index helyre; HELYBEN
  private static void beszúrTömbbe(int elem, int[] tomb, int index) {
    for (int i = tomb.length-2; i >= index; i--) 
      tomb[i+1] = tomb[i]; //jobbra léptetés
    tomb[index] = elem;
  }
  
  //széválogatja _tomb_ elemeit _planok_ és _psak_ tömbjébe; HELYBEN
  //!: Mivel a paramétertömbnek csak az elemeit tudjuk változatni
  //ezért a nem használt elemeket _érvénytelen érték_-kel töltjük fel,
  //amit aztán majd a kiíró metódus figyelembe fog venni.
  //Integer.MIN_VALUE: érvénytelen érték -> tömbArrToString figyelembe veszi
  private static void rendezettenSzétválogat(int[] tomb, int[] planok, int[] psak) {
    int planDb=0, psDb=0; //variábilis elemszám nyilvántartásra
    int planIndex, psIndex; //lépkedésre
    /*
 //#ÍGY; "nullázás" - ITT: érvénytelen értékekkel feltöltés; vagy így, vagy #ÚGY
    for (int i = 0; i < planok.length; i++) 
      planok[i] = INVALID_VALUE;
    for (int i = 0; i < psak.length; i++) 
      psak[i] = INVALID_VALUE;
    */
    for (int i = 0; i < tomb.length; i++) {
      int aktÉrték = tomb[i];
      if (aktÉrték%2==1) { //a szétválogatás feltétele; ha páratlan értékű az elem
        planIndex=linElsőNagyobbIndexe(aktÉrték, planok, planDb++); //mit, miben, meddig
        beszúrTömbbe(aktÉrték, planok, planIndex); //mit, mibe, hová
      }//if
      else { //ha páros értékű az elem
        psIndex=linElsőNagyobbIndexe(aktÉrték, psak, psDb++);
        beszúrTömbbe(aktÉrték, psak, psIndex); 
      }//else
    }//for
 //#ÚGY; !: alábbit megtehetnénk "nullázásképp", már a legelső lépésben #ÍGY (egyszerűbb)
    while (planDb < planok.length)
      planok[planDb++] = INVALID_VALUE;
    while (psDb < psak.length)
      psak[psDb++] = INVALID_VALUE;
  }//rendezettenSzétválogat()
  
  public static void main(String[] args) {
    System.out.println("Rendezetten válogatok ám szét bármilyen tömböt!!!\n");
    final int N = 20; //az összes szám száma
    int[] tömb = new int[N];
    feltöltTömb(tömb);
    System.out.println("A tömb:\n" + tömbArrToString(tömb));
    int[] planTömb = new int[N], //A legrosszabb eset:
            psTömb = new int[N]; //lehet hogy mind páratlan vagy mind páros.
    rendezettenSzétválogat(tömb, planTömb, psTömb);
    System.out.println("A páratlanok tömbje (rendezett):\n"
            + tömbArrToString(planTömb) + "\n"
            + "A párosak tömbje (rendezett):\n"
            + tömbArrToString(psTömb)             
    );
  }//main()
}//class
//TODO (gyakorlásféleképpen) összefuttatni a két rendezett tömböt (psak, planok)