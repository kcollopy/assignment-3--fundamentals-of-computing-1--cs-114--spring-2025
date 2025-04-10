import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int numberOfSpaces, numberOfCharacters, diamondSize;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter an integer greater than 0: ");
    diamondSize = scan.nextInt();
    System.out.println();

    while(diamondSize < 1){
      System.out.println("Invalid input please re-enter an integer greater than 0: ");
      diamondSize = scan.nextInt();
    }
    scan.close();

    //Odd diamond
    if(diamondSize%2 == 1){
      numberOfSpaces = (diamondSize - 1)/2;
      numberOfCharacters = 1;

      //Top half of the diamond
      for(int i = 1; i <= diamondSize; i += 2){
        System.out.println(" ".repeat(numberOfSpaces) + "*".repeat(numberOfCharacters));

        numberOfSpaces--;
        numberOfCharacters += 2;
      }

      numberOfSpaces++;
      numberOfCharacters -= 2;

      //Top half of the diamond
      for(int i = 1; i < diamondSize; i += 2){
        numberOfSpaces++;
        numberOfCharacters -= 2;

        System.out.println(" ".repeat(numberOfSpaces) + "*".repeat(numberOfCharacters));
      }
    }

    //Even diamond
    if(diamondSize%2 == 0){
      numberOfSpaces = diamondSize - 2;
      numberOfCharacters = 2;

      //Top half of the diamond
      System.out.println(" ".repeat(diamondSize) + "*");

      for(int i = 1; i <= diamondSize; i += 2){
        System.out.println(" ".repeat(numberOfSpaces) + " *".repeat(numberOfCharacters));

        numberOfSpaces -= 2;
        numberOfCharacters += 2;
      }

      numberOfSpaces += 2;
      numberOfCharacters -= 2;

      //Bottom half of the diamond
      for(int i = 1; i < diamondSize - 1; i += 2){
        numberOfSpaces += 2;
        numberOfCharacters -= 2;

        System.out.println(" ".repeat(numberOfSpaces) + " *".repeat(numberOfCharacters));
      }
      System.out.println(" ".repeat(diamondSize) + "* \n");
    }
  }
}
