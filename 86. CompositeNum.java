import java.util.Scanner;
public class CompositeNum
{
   public static void main(String[] args) 
   {
      System.out.println("Enter the number:");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0; 
      for(int i = 1; i <= n; i++) {
         if (n % i == 0)
            count++;
      }
      if (count >3)
         System.out.println("its a composite number");
      else
         System.out.println("its not a composite number");
   }
}