package fejezet_11;

/**
 * 
 * 
 * @author Nigel727
 */
public class ÁtlagtólValóEltérés1 { //11.4.9
  
  public static void main(String[] args) {
    System.out.println("Mondom ám megfele a darabszámot, hány elem tér el az átlagtól legfeljebb 20%-kal!!!\n");
    int N = 20;
    int[] tömb = new int[N]; //0..based
    //tömbfeltöltés + egyúttal átlagszámolás [végiglépkedés a tömbön #1]
    int összeg = 0;
    System.out.println("A tömbelemek: ");
    for (int i = 0; i < N; i++) {
      összeg += (tömb[i] = (int)(Math.random()*90+10)); 
      System.out.print(tömb[i] + " ");
    }
    System.out.println();
    double átlag = (double)összeg / N;
    System.out.println("* átlaguk: " + átlag);
    //határok meghatározása: átlagalatt20, átlagfelett20
    double  underAvgBy20 = átlag*(1-20.0/100), //most: átlag 80%-a
            aboveAvgBy20 = átlag*(1+20.0/100); //most: átlag 120%-a
    //ITT kezdődik az az egyetlen kódszakasz ahol ez ÁtlagtólValóEltérés2 eltérőek:
    //megszámolás (ami a két határ közé esik) [végiglépkedés a tömbön #2]
    int határokköztDb=0; //összeg számlálóját nullázzuk
    for (int i = 0; i < N; i++) {
      int aktuális_elem = tömb[i];
      boolean határokközt_e = underAvgBy20<=aktuális_elem && aktuális_elem<=aboveAvgBy20;
      if (határokközt_e)
        határokköztDb++;
    }
    System.out.println( "Ennyi elem van a [" //TODO: helyiértékes kiírás (extra.format())
            + underAvgBy20  
            + ".." 
            + aboveAvgBy20 
            + "] kategóriában: "
            + (0<határokköztDb ? határokköztDb + " db." : "egy se.")
    );
  }//main()
}//class