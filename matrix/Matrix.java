public class Matrix {
  private int[][] matrix;
  int matrixLength, count;

  public Matrix(int size){
    this.matrix = new int[size][size];
    this.matrixLength = size;
    System.out.println("The dimentions of this matrix are " + size + " x " + size);
  }

  private void swap(int x1, int y1, int x2, int y2){
    int amatrix = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = amatrix;
  }

  public void printMatrix(){

    for(int row = 0; row < matrixLength; row++){
      for( int col = 0; col < matrixLength; col++){

        if(col + row == matrixLength - 1){
          System.out.print( + matrix[row][col]);
        }else{
          System.out.print(matrix[row][col] + "\t");
        }
        System.out.println();
      }
    }

  public void populateMatrix(){
    for(int row = 0; row < matrixLength; row++){
      for(int col = 0; col < matrix[row].length; col++){
        count++;
        matrix[row][col] = count;
      }
    }
  }

  public void flipMatrix(){
    for(int row = 0; row < matrixLength; row++){
      for(int col = 0; col < matrix[row].length; col++){
        int swapRow = matrixLength - row - 1;
        int swapCol = matrixLength - col - 1;

        if( row + col == matrixLength - 1){
          continue;
        }

        if (row + col < matrixLength - 1) {
          swap(row, col, swapRow, swapCol);
        }
     }
    }
  }
}
