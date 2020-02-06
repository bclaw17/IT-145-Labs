import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight = 0;
      int arrowBaseWidth  = 0;
      int arrowHeadWidth = 0;
      
      System.out.println("Enter arrow base height: ");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width: ");
      arrowBaseWidth = scnr.nextInt();
      //TEST
      // System.out.println("Enter arrow head width: ");
      // arrowHeadWidth = scnr.nextInt();
      
      do {
         System.out.println("Enter arrow head width: ");
         arrowHeadWidth = scnr.nextInt();
      } while (arrowHeadWidth <= arrowBaseWidth);
         
      // int j; 
      // //TEST LOOP
      // while (arrowHeadWidth < arrowBaseWidth) {
      //    System.out.println("Enter arrow head width: ");
      //    arrowHeadWidth = scnr.nextInt();
      //    System.out.print("*");
      //    while (arrowHeadWidth > arrowBaseWidth) {
      //       System.out.println("Enter arrow head width: ");
      //       arrowHeadWidth = scnr.nextInt();
      //       System.out.print("*");
      //       arrowHeadWidth = arrowHeadWidth - 1;
      //          for (j = 0; j < arrowHeadWidth; ++j) {
      //             System.out.print("*");
      //          }
      //          System.out.print("\n");
      //    }
      // }
      
      
      
      
      
      
      
      // Draw arrow base (height = 5, width = 2)
      int i;
      while (arrowBaseHeight > 0) {
         System.out.print("*");
         arrowBaseHeight = arrowBaseHeight - 1;
         for (i = 1; i < arrowBaseWidth; ++i) {
            System.out.print("*");
         }
            System.out.print("\n");
      }
         
      
      // Draw arrow head
      while (arrowHeadWidth > 0) {
         System.out.print("*");
         arrowHeadWidth = arrowHeadWidth - 1;
            for (i = 0; i < arrowHeadWidth; ++i) {
               System.out.print("*");
            }
               System.out.print("\n");
      }
   
      
      
      
 
      
      
      
      //TEST
      
      //only accept an arrow head width that is larger than the arrow base width
      

      
   
               
      
 
      return;
   }
}