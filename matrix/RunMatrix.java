import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int size;

    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter the size of your matrix: ");
    size = scan.nextInt();
    System.out.println();

    while(size < 1){
      System.out.println("Invalid input please re-enter an integer: ");
      size = scan.nextInt();
    }
    scan.close();

    Matrix matrix = new Matrix(size);
    System.out.println();

    System.out.println("Printing matrix with default values:");
    matrix.printMatrix();
    System.out.println();

    System.out.println("Populating matrix...matrix populated \n");
    System.out.println("Printing matrix:");
    matrix.populateMatrix();
    matrix.printMatrix();
    System.out.println();

    System.out.println("Printing matrix...matrix flipped \n");
    System.out.println("Printing flipped matrix:");
    matrix.flipMatrix();
    matrix.printMatrix();
    System.out.println();
  }
}
