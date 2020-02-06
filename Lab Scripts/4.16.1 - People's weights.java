import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double weight1;
      double weight2;
      double weight3;
      double weight4;
      double weight5;
      

      double[] arrayWeights = new double[5];
      int i;                                  

       
      // for (i = 0; i < arrayWeights.length; ++i) {
      //    arrayWeights[i] = scnr.nextDouble();
      //    System.out.print("Enter weight ");
      //    System.out.println(arrayWeights[i] + " ");
      // }
      System.out.println("Enter weight 1: ");
      arrayWeights[0] = scnr.nextDouble();
      System.out.println("Enter weight 2: ");
      arrayWeights[1] = scnr.nextDouble();
      System.out.println("Enter weight 3: ");
      arrayWeights[2] = scnr.nextDouble();
      System.out.println("Enter weight 4: ");
      arrayWeights[3] = scnr.nextDouble();
      System.out.println("Enter weight 5: ");
      arrayWeights[4] = scnr.nextDouble();
      System.out.println();
      
      double sumVal = 0.0;
      double avgVal = 0.0;
      double maxVal = 0.0;
      
      System.out.print("You entered:" + " ");
      for (i = 0; i < arrayWeights.length; ++i) {
         System.out.print(arrayWeights[i] + " ");
         sumVal = sumVal + arrayWeights[i];
         avgVal = sumVal / 5.0;
      }
      System.out.println();
      System.out.println("Total weight: " + sumVal);
      System.out.println("Average weight: " + avgVal);
      
      //TESTING
      
      maxVal = arrayWeights[0];                   // Largest so far
      
      for (i = 0; i < arrayWeights.length; ++i) {
         if (arrayWeights[i] > maxVal) {
            maxVal = arrayWeights[i];
         }
      }
      System.out.println("Max weight: " + maxVal);
   



      
      
      
      


      
      return;
   }
}