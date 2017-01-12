/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fejezet_04;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class Léptetés2 {

  static int a = 1, b = 2, c;
  
  public static void main(String[] args) {
    System.out.println("\"Léptetés2\"\n");
    //int a = 0, b = 0, c = 0;
    //printABC("a", a, "b", b, "c", c);

    //És, itt kezdődik a megoldás:
//    a = 1;
//    b = 2;
//    c = 3;
  
    printTwoString("inicializálások", "után");
    printABC("c", c, "a", a, "b", b);
    //

    String művelet = "c = (++a) + (++b)";

    c = (++a) + (++b); //szerintem: c = 2 + 3
    printTwoString(művelet, "után");
    printABC("c", c, "a", a, "b", b);
    resetABC();
    //..
    művelet = "c = (a++) + (++b)";
    c = (a++) + (++b);
    printTwoString(művelet, "után");
    printABC("c", c, "a", a, "b", b);
    resetABC();
    
    c = (++a) + (b++);
    printTwoString("c = (++a) + (b++)", "után");
    printABC("c", c, "a", a, "b", b);
    resetABC();
    
    c = (a++) + (b++);
    printTwoString("c = (a++) + (b++)", "után");
    printABC("c", c, "a", a, "b", b);
    resetABC();
  }

  private static void printABC(String namex1, int x1,
          String namex2, int x2,
          String namex3, int x3) {
    System.out.println('\t' + namex1 + " = " + x1 + ";\t" + namex2 + " = " + x2 + ";\t" + namex3 + " = " + x3);
  }

  private static void printTwoString(String műv, String duma) {
    System.out.print('\"' + műv + '\"' + ' ' + duma + ": ");
  }
  
  private static void resetABC() {
    a = 1; b = 2; c = 0;
  }
  
}
