import java.util.Scanner;

public class MatrixAdd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of rows in the first matrix: ");
    int rows1 = input.nextInt();
    System.out.print("Enter the number of columns in the first matrix: ");
    int columns1 = input.nextInt();
    int[][] firstMatrix = new int[rows1][columns1];
    
    System.out.println("Enter the elements of the first matrix: ");
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < columns1; j++) {
        firstMatrix[i][j] = input.nextInt();
      }
    }
    
    System.out.print("Enter the number of rows in the second matrix: ");
    int rows2 = input.nextInt();
    System.out.print("Enter the number of columns in the second matrix: ");
    int columns2 = input.nextInt();
    int[][] secondMatrix = new int[rows2][columns2];
    
    System.out.println("Enter the elements of the second matrix: ");
    for (int i = 0; i < rows2; i++) {
      for (int j = 0; j < columns2; j++) {
        secondMatrix[i][j] = input.nextInt();
      }
    } 
    
    if (rows1 != rows2 || columns1 != columns2) {
      System.out.println("The matrices cannot be added.");
    } else {
      int[][] sum = new int[rows1][columns1];
      for (int i = 0; i < rows1; i++) {
        for (int j = 0; j < columns1; j++) {
          sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
        }
      }
      
      System.out.println("The sum of the matrices is: ");
      for (int i = 0; i < rows1; i++) {
        for (int j = 0; j < columns1; j++) {
          System.out.print(sum[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}
