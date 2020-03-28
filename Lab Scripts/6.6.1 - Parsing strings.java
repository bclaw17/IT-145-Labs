import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      Scanner inSS = null; 
      String lineOfText = "";
      String word1 = "";
      String word2 = "";
      boolean inputDone = false;
      int commaLocation = 0;
      
      while (!inputDone) {
            System.out.println("Enter input string: ");
            lineOfText = scnr.nextLine();
         if (lineOfText.equals("q")) {
            inputDone = true;
         }
         else {
            while (lineOfText.contains(",") == false) {
               System.out.println("Error: No comma in string");
               System.out.println("Enter input string: ");
               lineOfText = scnr.nextLine();
            }
            commaLocation = lineOfText.indexOf(',');
            word1 = lineOfText.substring(0, commaLocation);
            word1 = word1.trim();
            word2 = lineOfText.substring(commaLocation + 1, lineOfText.length());
            word2 = word2.trim();
            
            
            
            System.out.println("First word:" + " " + word1);
            System.out.println("Second word: " + word2);
         
            System.out.println("");
            System.out.println("");
           
         }
         
      }
  
      
      
      
      
      
      return;
   }
}