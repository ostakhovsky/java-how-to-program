package chapter6.examples;
/*
Fig. 6.3
 */

import java.util.Scanner;


public class MaximumFinder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three floating-point values: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();
    double result = maximum(number1, number2, number3);
    System.out.println("Maximum is: " + result);
  }

  private static double maximum(double x, double y, double z) {
    return Math.max(x, Math.max(y, z));
  }
}