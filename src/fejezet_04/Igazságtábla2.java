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
public class Igazságtábla2 {

  public static void main(String[] args) {
    System.out.println("A logikai VAGY művelet igazságtáblája\n\n"
            + "\t" + true + '\t' + false);
    System.out.println("" + true + "\t" + (true|true) + "\t" + (true|false));
    System.out.println("" + false + "\t" + (false|true) + "\t" + (false|false));
  }
}
