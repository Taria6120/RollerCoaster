// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;  
public class Main {
  public static void main(String[] args) {
    Scanner keyedInput = new Scanner(System.in); 
    
    System.out.println("Enter your height in cm");
    int inputHeight = keyedInput.nextInt();   
    
    System.out.println("Enter Y/y if you have back problems and N/n if you don't");
    char inputBackProblem = keyedInput.next().charAt(0);  

    System.out.println("Write Y/y if you have a heart problem and N/n if you don't");
    char inputHeartProblem = keyedInput.next().charAt(0);
    
    if (inputHeight <= 188 && inputHeight >= 122) {
      if ((inputBackProblem == 'Y')||(inputBackProblem == 'y'))
        System.out.println("You are not eligible for this ride because you have a back problem");
      else {
        if ((inputHeartProblem == 'Y')||(inputHeartProblem == 'y'))         
          System.out.println("You are not eligible for this ride because you a heart problem");
        else
          System.out.println("You are eligible for this ride");
      }
    }
    else System.out.println("You are not eligible for this ride becuase you are not the right height");
     
      
}

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}