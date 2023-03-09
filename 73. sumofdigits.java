import java.util.*;
class sumofdigits{
public static void main(String arg[])
{

  int num,nod, digit, sum=0,count=0;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter no of digits: ");
      nod = s.nextInt();
      System.out.print("Enter a Number: ");
      num = s.nextInt();
      
      while(num!=0)
      {
         digit = num%10;
         sum = sum + digit;
         num = num/10;
		 count++;
      }
	  if (count==nod)
	     {
			 if (sum <=9)
			 {
				 System.out.println("\nSum of Digits = " +sum);
			 }
			 else
			{
			System.out.println("\n not matching  the value");
			}
		 }
		 else
		 {
		 System.out.println("\n not matching  the value");
		 }
}
}