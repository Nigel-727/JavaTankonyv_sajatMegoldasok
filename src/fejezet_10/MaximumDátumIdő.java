package fejezet_10;

import java.util.Date;

/**
 *
 * @author Nigel-727
 */
public class MaximumDátumIdő {
  public static void main(String[] args) {
    System.out.println("A Long.MAX_VALUE értékhez tartozó dátum és idő\n");
    Date date1 = new Date();
    date1.setTime(Long.MAX_VALUE);
    System.out.println(date1);
    //
    Date date2=new Date(Long.MAX_VALUE);
    System.out.println(
            date2 + " (alapértelmezett formátum); "
            +date2.getTime() + " (UTC)"
    );
  } //main()
}
