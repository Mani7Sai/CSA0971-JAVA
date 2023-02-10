import java.util.Scanner;

class matrrixmul 
{
  public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of rows in the first matrix: ");
    int rows1 = input.nextInt();
    System.out.print("Enter the number of columns in the first matrix: ");
    int columns1 = input.nextInt();
    int[][] firstMatrix = new int[rows1][columns1];
    
    System.out.println("Enter the elements of the first matrix: ");
    for (int i = 0; i < rows1; i++)
 {
      for (int j = 0; j < columns1; j++)
 {
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
    
    if (columns1 != rows2) {
      System.out.println("The matrices cannot be multiplied.");
    } else {
      int[][] product = new int[rows1][columns2];
      for (int i = 0; i < rows1; i++) {
        for (int j = 0; j < columns2; j++) {
          for (int k = 0; k < columns1; k++) {
            product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
          }
        }
      }
      
      System.out.println("The product of the matrices is: ");
      for (int i = 0; i < rows1; i++) 
{
        for (int j = 0; j < columns2; j++)
 {
          System.out.print(product[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}
