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
public class Véletlenszámok2 {

  public static void main(String[] args) {
    int egész;

//kétjegyű páratlan
    egész = (int) (Math.random() * 45) * 2 + 11; //0..44 => 0..88 => 11..99
    KiírEgészet("Kétjegyű páratlan", egész);

    //háromjegyű páros
    egész = (int) (Math.random() * 450) * 2 + 100; //0..449 => 0..898 => 100..998 
    KiírEgészet("Háromjegyű páros", egész);

    //6-oslottón megjátszható (45-ig)
    egész = (int) (Math.random() * 45) + 1; //0..44 => 1..45
    KiírEgészet("Hatoslottón megjátszható", egész);

    //negatív egyjegyű
    egész = 0 - ((int) (Math.random() * 9) + 1); // 0..8 => 1..9 => -9..-1
    KiírEgészet("Negatív egyjegyű", egész);

    //kockával dobható
    egész = (int) (Math.random() * 6) + 1; //0..5 => 1..6
    KiírEgészet("Kockával dobható", egész);

    //két kockával dobott összege
    egész = (int) (Math.random() * 11) + 2; //0..  10 => 2..12
    KiírEgészet("Két kockával dobottak összege", egész);
     
  }
  
  public static void KiírEgészet(String magyarázat, int szám) {
    System.out.println(magyarázat + ": " + szám);
  }
}
