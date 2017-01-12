package fejezet_11;

/**
 *
 * @author Nigel727
 */
public class ÁtlagtólValóEltérés2 {
  public static void main(String[] args) {
    System.out.println("Írom ám kifele az elemeket, amik az átlagtól legfeljebb 20%-kal térnek el!!!\n");
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
    //ITT kezdődik az az egyetlen kódszakasz ahol ez ÁtlagtólValóEltérés1 eltérőek:
    //megszámolás (ami a két határ közé esik) [végiglépkedés a tömbön #2]
    int határokköztDb=0; //összeg számlálóját nullázzuk
    int[] határokköztiek=new int[N]; //ÚJ; nem volna muszáj tömbbe kiválogatni, elég volna kiírni
    for (int i = 0; i < N; i++) {
      int aktuális_elem = tömb[i];
      boolean határokközt_e = underAvgBy20<=aktuális_elem && aktuális_elem<=aboveAvgBy20;
      if (határokközt_e) 
        határokköztiek[határokköztDb++] = aktuális_elem;
    }
    System.out.println( "Ezen elemek vannak a " //TODO: helyiértékes kiírás (extra.format())
            + underAvgBy20  
            + "-" 
            + aboveAvgBy20 
            + " kategóriában: ");
    if (0<határokköztDb)
      for (int i=0; i<határokköztDb; i++) 
        System.out.print(határokköztiek[i]+" ");
    else
      System.out.print("egy sincs.");
    System.out.println();
  }//main()
}//class