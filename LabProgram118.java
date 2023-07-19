import java.util.Scanner; 

public class LabProgram118 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];  // Set of data specified by the user      

      boolean flag = true;
      int arrayCounter = 0;
      while(flag) {
    	  int tempValue = 0;
          tempValue = scnr.nextInt();
          if (tempValue < 0) {
        	  System.out.println(
        	  "Middle item: "+ userValues[arrayCounter/2]);
              break;
          }
          else if (arrayCounter > 8) {
        	  System.out.println("Too many numbers");
        	  break;
          }
          else {
              userValues[arrayCounter++] = tempValue;    
              //arrayCounter++;
          }    	  
      }
   }
}
