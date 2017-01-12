/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fejezet_10;

/**
 *
 * @author Nigel-727 
 */
public class CsomagolóOsztályKarakter {
  public static void main(String[] args) {
    System.out.println("*** Karakterek műveletei ***");
    char k = 
            'S';
//            's';
//            '5';
    System.out.println("a karakter: "+k);
    System.out.println(
            "nagybetűs-e? "+Character.isUpperCase(k)+
            "\nkisbetűs-e? "+Character.isLowerCase(k)+
            "\nszámjegy-e? "+Character.isDigit(k)+
            "\nbetű-e? "+Character.isLetter(k)+
            "\nNagybetűsen: "+Character.toUpperCase(k)+
            "\nKisbetűsen: "+Character.toLowerCase(k)
    );
  }
}