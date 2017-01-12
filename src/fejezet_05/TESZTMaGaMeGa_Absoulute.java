/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fejezet_05;

import java.util.Scanner;
/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class TESZTMaGaMeGa_Absoulute {

  public static void main(String[] args) {
    double number;

    initialise();
    number = getInputNumber();
    output(calcAbs(number));
  }

  public static void initialise() {
    System.out.println("Input real number , output abs of this number");
  }

  public static double getInputNumber() {
    double x = 0;
    boolean goodNumber = false;

    Scanner input = new Scanner(System.in); //TODO: magyar windowson tizedesvesszőt enged, t.pont helyett!?
    System.out.println("Please enter a double type number: ");

    while (!input.hasNextDouble()) {
      System.out.println("Invalid input\n Type the double-type number:");
      input.next();
    }
    return x = input.nextDouble();
  }

  public static double calcAbs(double number) {
    double absNumber = 0;

    if (number >= 0) {
      absNumber = number;
    } else if (number < 0) {
      absNumber = number * -1;
    }
    return absNumber;
  }

  public static void output(double number) {
    System.out.printf("The absoulute value of the entered number: %f %n", number);

  }
}
