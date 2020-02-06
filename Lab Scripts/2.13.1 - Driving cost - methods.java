import java.util.Scanner;

public class LabProgram {
   
   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
      return drivenMiles * (1.0 / milesPerGallon) * dollarsPerGallon;
   /* Define your method here */
   }
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      double milesPerGallon;
      double dollarsPerGallon;
      
      milesPerGallon = scnr.nextDouble();
      dollarsPerGallon = scnr.nextDouble();
      
      
      System.out.printf("%.2f", drivingCost(10.0, milesPerGallon, dollarsPerGallon));
      System.out.print(" ");
      System.out.printf("%.2f", drivingCost(50.0, milesPerGallon, dollarsPerGallon));
      System.out.print(" ");
      System.out.printf("%.2f", drivingCost(400.00, milesPerGallon, dollarsPerGallon));
      System.out.println();
      
      
      
   }
}
