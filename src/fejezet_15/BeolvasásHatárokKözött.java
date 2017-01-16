package fejezet_15;

/**
 *
 * @author Nigel-727
 */
class OutOfRangeException extends RuntimeException {
  public OutOfRangeException(String str) {
    super(str);
  }
}
public class BeolvasásHatárokKözött {
  static int beolvasEgész(int alsó, int felső) {
    String üzi = "Szám ";
    üzi+= "["
            +Integer.toString(alsó)
            +";"
            +Integer.toString(felső)
            +"]: ";
    boolean nemfigyelsz = true;
    int ezkellneked=alsó-1; //legyen érvénytelen érték
    do {
        String teírtad = extra.Console.readLine(üzi);
        try {      
          ezkellneked = Integer.parseInt(teírtad);
          if (ezkellneked<alsó || felső<ezkellneked)
            throw new OutOfRangeException("Hiba: "+alsó+" és "+felső+" között kell!");
          nemfigyelsz=false;
        } catch (NumberFormatException e) {
          System.out.println("Illegális karakter!");
        } catch (OutOfRangeException e) {
          System.out.println(e.getMessage());
        }
    } while (nemfigyelsz);
    return ezkellneked;
  }
  
  public static void main(String[] args) {
        int újSzám = beolvasEgész(10, 20);
        System.out.println("OK");
  }
}