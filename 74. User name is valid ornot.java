import java.util.*;
class Stringcompare
{  
 public static void main(String args[])
 {  
   String s1,s2;  
   System.out.println("enter String-1");
   System.out.println("enter String-2");
   Scanner sc=new Scanner(System.in);
   s1=sc.nextLine();
   s2=sc.nextLine();
   if(s1.equals(s2)) 
{
	System.out.println("Valid");
}	
  else
  {
	  System.out.println("In Valid");
}
 }  
}
