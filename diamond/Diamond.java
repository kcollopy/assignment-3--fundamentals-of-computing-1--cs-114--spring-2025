import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int numberOfSpaces, numberOfCharacters, diamondSize;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter an integer greater than 0: ");                   //validate user input
    diamondSize = scan.nextInt();

    while(diamondSize < 1){
      System.out.println("Invalid input please reenter an integer: ");
      diamondSize = scan.nextInt();
    }
    scan.close();

    numberOfSpaces = (diamondSize - 1)/2;
    numberOfCharacters = 1;

    for(int i = 1; i <= diamondSize; i += 2){
      System.out.println(" ".repeat(numberOfSpaces) + "*".repeat(numberOfCharacters) + " ".repeat(numberOfSpaces));

      numberOfSpaces--;
      numberOfCharacters += 2;
    }

    numberOfSpaces++;
    numberOfCharacters -= 2;

    for(int i = 1; i < diamondSize; i += 2){
      numberOfSpaces++;
      numberOfCharacters -= 2;

      System.out.println(" ".repeat(numberOfSpaces) + "*".repeat(numberOfCharacters) + " ".repeat(numberOfSpaces));
    }
  }
}
