import java.util.Scanner; 

public class OutputWithVars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum = 0;
      int userNumSquared = 0;
      int userNumCubed = 0;
      int secondUserNum = 0;
      int total = 0;
      int product = 0;
      
      
      

      System.out.println("Enter integer: ");
      userNum = scnr.nextInt();
      System.out.println("You entered: " + userNum);
      
      userNumSquared = userNum * userNum;
      System.out.println(userNum + " squared is " + userNumSquared);
      
      userNumCubed = userNum * userNum * userNum;
      System.out.println("And " + userNum + " cubed is " + userNumCubed + "!!");
      
      System.out.println("Enter another integer: ");
      secondUserNum = scnr.nextInt();
      
      total = userNum + secondUserNum;
      System.out.print(userNum + " + ");
      System.out.println(secondUserNum + " is " + total);
      
      
      product = userNum * secondUserNum;
      System.out.print(userNum + " * ");
      System.out.print(secondUserNum);
      System.out.println(" is " + product);
      
     
      
  
      
      
      
      
      return;
   }
}