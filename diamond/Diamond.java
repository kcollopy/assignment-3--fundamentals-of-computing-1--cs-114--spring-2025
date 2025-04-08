import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int numberOfSpaces, numberOfCharacters, diamondSize;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter an integer greater than 0: ");
    diamondSize = scan.nextInt();                               //validate user input

    while(diamondSize < 1){
      System.out.println("Invalid input please reenter an integer greater than 0: ");
      diamondSize = scan.nextInt();
    }
    scan.close();

    if(diamondSize%2 == 1){                                                  //odd diamond
      numberOfSpaces = (diamondSize - 1)/2;
      numberOfCharacters = 1;

      for(int i = 1; i <= diamondSize; i += 2){                              //top half of diamond
        System.out.println(" ".repeat(numberOfSpaces) + "*".repeat(numberOfCharacters));

        numberOfSpaces--;
        numberOfCharacters += 2;
      }

      numberOfSpaces++;
      numberOfCharacters -= 2;

      for(int i = 1; i < diamondSize; i += 2){                             //bottom half of diamond
        numberOfSpaces++;
        numberOfCharacters -= 2;

        System.out.println(" ".repeat(numberOfSpaces) + "*".repeat(numberOfCharacters));
      }
    }

    if(diamondSize%2 == 0){                                                 //even diamond
      numberOfSpaces = diamondSize - 2;
      numberOfCharacters = 2;
      System.out.println(" ".repeat(diamondSize) + "*");

      for(int i = 1; i <= diamondSize; i += 2){
        System.out.println(" ".repeat(numberOfSpaces) + " *".repeat(numberOfCharacters));

        numberOfSpaces -= 2;
        numberOfCharacters += 2;
      }

      numberOfSpaces += 2;
      numberOfCharacters -= 2;

      for(int i = 1; i < diamondSize - 1; i += 2){
        numberOfSpaces += 2;
        numberOfCharacters -= 2;

        System.out.println(" ".repeat(numberOfSpaces) + " *".repeat(numberOfCharacters));
      }
      System.out.println(" ".repeat(diamondSize) + "*");
    }
  }
}
