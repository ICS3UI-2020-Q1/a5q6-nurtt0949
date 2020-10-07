import java.util.Scanner;
/**
 *Prints the amount of stars the user wants
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
     Scanner input = new Scanner(System.in);
    //get numebr from user
    System.out.println("Please enter a number between 1 and 10");
    //declare a variable for users number
    int userNum = input.nextInt();
    //loop for amount of stars
    for(int count = 1; count <= userNum; count++){
      for(int count2 = 1; count2 <= userNum; count2++){
        System.out.print("*");
      }
      System.out.println();

    }

    
  }
}




