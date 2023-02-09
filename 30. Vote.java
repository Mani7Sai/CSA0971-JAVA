import java.util.*;
class vote
{
public static void main(String[] args)
{
try
{
int a,b;
System.out.print("Enter your age=");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=18-a;
if (a >= 18)
{
System.out.print("You are eligible for vote.");
}
else
{
if(a<0)
System.out.print("Invalid! Enter a valid age");
else
System.out.println("You are allowed to vote after " +b +" Years");
}
}
catch (Exception e)
{
   System.out.println("Invalid!");
}
}
}
