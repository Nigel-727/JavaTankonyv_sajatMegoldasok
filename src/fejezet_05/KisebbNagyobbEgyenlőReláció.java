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
public class KisebbNagyobbEgyenlőReláció {
  public static void main(String[] args) {
    System.out.println("Megmondom két számról h < > vagy = a reláció köztük!\n"
            + "Add meg a két egész számot!");
    int a = extra.Console.readInt("egyik = ? ");
    int b = extra.Console.readInt("másik = ? ");
    System.out.println(a + " "
            + ( a<b ? '<' : ( a>b ? '>' : '=' ) )
            + " " + b
    );
    
  }
}