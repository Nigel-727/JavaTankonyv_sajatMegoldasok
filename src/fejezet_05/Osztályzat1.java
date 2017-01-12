/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fejezet_05;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class Osztályzat1 {
  public static void main(String[] args) {
    System.out.println("\"Százalék -> Értékelés\"");
    int szlék = extra.Console.readInt("Az eredmény százalékban [egész] = ? ");
    if ( !(0<=szlék && szlék<=100) )
      System.out.println("Hülyeségekkel nem foglalkozom.");
    else if ( szlék<60 ) //00..59
      System.out.println("60% alatti => ELÉGTELEN!");
    else if ( szlék<70 ) //60..69
      System.out.println("60-69 közötti => elégséges!");
    else if ( szlék<80 )
      System.out.println("70-79% közötti => közepes!");
    else if ( szlék<90 )
      System.out.println("80-89% közötti => négyes!");
    else 
      System.out.println("90%-tól fölfelé => Gratulálok, JELES!");
  }
}
