package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class TízesSzorzótábla {
  public static void main(String[] args) {
    System.out.println("Tetszőleges n*m szorzótábla (_n_ _m_ egész szám)");
    final int N = 111, //sorok száma
            M = 31; //oszlopok száma
    //Számoljuk ki (N*M) számjegyeinek számát:
    int nm = N * M, 
        szjegyDb = 1;
    while (9<nm) {
      nm/=10;
      szjegyDb++;
    }
//    System.out.println("szjegyDb= "+szjegyDb);
    //fejléc:
    System.out.print(extra.Format.right("|", 6)); 
    for (int i = 1; i <= M; i++) {
      System.out.print(extra.Format.right(i, szjegyDb+1)); //3: 10-ig; 4: 100-ig; 5: 1000-ig; stb
    }
    System.out.println();
    //aláhúzás:
    System.out.print("-----|"); //1-gyel több, a függőleges elválasztó miatt
    for (int i = 1; i <= M*(szjegyDb+1); i++) {
      System.out.print("-"); //TODO: ez a számjegyek számától függjön
    }
    System.out.println("");
    //a bal oldali "vezető sávot" ráérünk "menet közben" nyomtatni:
    for (int i = 1; i <= N; i++) {
      System.out.print(extra.Format.right(i, 5)+"|"); //sor száma
      for (int j = 1; j <= M; j++) {
        System.out.print(extra.Format.right(i*j, szjegyDb+1));
      }
      System.out.println();
    }
  }
}