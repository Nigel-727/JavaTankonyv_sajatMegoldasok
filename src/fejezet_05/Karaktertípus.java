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
public class Karaktertípus {
  public static void main(String[] args) {
    System.out.println("Írjon be egy karaktert és én besorolom!");
    //kis: 97..122; nagy: 65..90; szám: 48..57
//    printASCII();
    char kar = extra.Console.readChar("karakter = ? ");
    if ('a'<=kar && kar<='z')
      System.out.println("kisbetű");
    else if ('A'<=kar && kar<='Z')
      System.out.println("nagybetű");
    else if ('0'<=kar && kar<='9')
      System.out.println("szám");
    else
      System.out.println("egyéb");
    
  }
  private static void printASCII()
  {
    for (int i=0; i<255; i++)
    {
      System.out.print("#"+i+": "+(char)i+"\t");
      if (i%10==0) System.out.println();
    }
  }
}


