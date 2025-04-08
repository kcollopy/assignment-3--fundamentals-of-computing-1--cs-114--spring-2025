import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int size;

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the size of your matrix: ");                   //validate user input
    size = scan.nextInt();

    while(size < 1){
      System.out.println("Invalid input please reenter an integer: ");
      size = scan.nextInt();
    }
    scan.close();

    Matrix matrix = new Matrix(size);

    System.out.println("Printing matrix with default values: \n");
    matrix.printMatrix();
    System.out.println();

    System.out.println("Printing matrix: \n");
    matrix.populateMatrix();
    matrix.printMatrix();
    System.out.println();

    System.out.println("Printing matix...matrix flipped");
    System.out.println("Printing flipped matrix: \n");
    matrix.flipMatrix();
    matrix.printMatrix();
    System.out.println();
  }
}
