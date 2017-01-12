package fejezet_10;

/**alábbi nagyon basic, az ujjgyakorlat volt a cél
 * 
 * @author Nigel-727
 */
public class CsomagolóOsztálySzámok {
  public static void main(String[] args) {
    System.out.println("*** Egész számok műveletei ***");
    int e = 300;
    System.out.println("Az egész szám: "+e);
    String s = Integer.toString(e);
    System.out.println(
            "szövegesen: "+s+
            "\nbinárisan: "+Integer.toBinaryString(e)+
            "\noktálisan: "+Integer.toOctalString(e)+
            "\nhexában: "+Integer.toHexString(e)+
            "\nelőjelfüggvénye (.signum): "+Integer.signum(e)+
            "\nlegnagyobb 1-es bitjének helyiértéke (.highestOneBit): "+Integer.highestOneBit(e));
    s 
            = "2526";
//            = "25,26"; //NumberFormatException
    e = Integer.parseInt(s);
    System.out.println(
            s+" szövegből egésszé alakítva: "+e);
    System.out.println("A legkisebb egész érték, amikor"
            + "\n byte: "+Byte.MIN_VALUE
            + "\n short: "+Short.MIN_VALUE
            + "\n int: "+Integer.MIN_VALUE
            + "\n long: "+Long.MIN_VALUE);
    System.out.println("A legnagyobb egész érték, amikor"
            + "\n byte: "+Byte.MAX_VALUE
            + "\n short: "+Short.MAX_VALUE
            + "\n int: "+Integer.MAX_VALUE
            + "\n long: "+Long.MAX_VALUE);
    System.out.println("\n*** Valós számok műveletei ***");
    double v = 6.57;
    System.out.println("A valós szám: "+v);
    s = Double.toString(v);
    System.out.println(
            "Szöveggé alakítva: "+s+
            "\nhexában: "+Double.toHexString(v)+
            "\nNem egy szám (NaN)-e? "+Double.isNaN(v)+
            "\nVégtelen (Infinite)-e? "+Double.isInfinite(v) //isInfinite()
            //saját:
            +"\nMath.sqrt(-1) értéke: "+Math.sqrt(-1)
            +"\nMath.sqrt(-1) értéke NaN-e (.isNaN)? "+Double.isNaN(Math.sqrt(-1))
            +"\nMath.sqrt(+1) értéke NaN-e (.isNaN)? "+Double.isNaN(Math.sqrt(+1))
    );
    System.out.println("A legkisebb valós érték, amikor"
            +"\n float: "+Float.MIN_VALUE 
            +"\n double: "+Double.MIN_VALUE);
    System.out.println("A legnagyobb valós sérték, amikor"
            + "\n float: "+Float.MAX_VALUE
            + "\n double: "+Double.MAX_VALUE);
    System.out.println("Valós végtelenek:"
            + "\n pozitív: "+Double.POSITIVE_INFINITY //Inifnity
            + "\n negatív: "+Double.NEGATIVE_INFINITY); //-Infinity
    System.out.println("Math.pow(Integer.MAX_VALUE, 50): "
            +Math.pow(Integer.MAX_VALUE, 50));
  } //main
}
