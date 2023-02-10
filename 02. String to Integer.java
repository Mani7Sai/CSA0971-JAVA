import java.util.*;
class strtoint
{
public static void main(String [] args)
{
try
{
String a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value:");
a=sc.nextLine();
int b=Integer.parseInt(a);
System.out.println("The integer value given is:");
System.out.println(+b);
}
catch(Exception e)
{
System.out.println("Invalid! It can't be changed into Integer");
}
}
}
