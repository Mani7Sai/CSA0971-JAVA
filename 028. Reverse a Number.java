import java.util.*;
class revnum
{
public static void main(String [] args)
{
try
{
int a,rev=0,rem;
System.out.print("Enter a num = ");
Scanner sc=new Scanner(System.in);
a=sc.nextInt(); 
if(a<0)
{
System.out.print("Invalid! Enter a positive number");
}
while(a!=0)
{
rem=a%10;
rev=rev*10+rem;
a=a/10;
}
System.out.print(rev);
}
catch(Exception e)
{
System.out.print("Invalid! ");
}
}
}                                                                   
