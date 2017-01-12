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
public class RandomPrimitivAdattípusok1 {
  public static void main(String[] args) {
    System.out.println("Random értékek primitív adattípusok teljes tartományában\n");
    System.out.println("véletlen Integer" 
            + (long)(Math.random()*((long)Integer.MAX_VALUE-Integer.MIN_VALUE+1)+Integer.MIN_VALUE)
    );
  }
}
