import java.util.*;
class username
{
public static void main(String [] args)
{
String a,b;
boolean c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Username:");
a=sc.nextLine();
System.out.println("Re-enter Username:");
b=sc.nextLine();
c=a.equals(b);
if(c==true)
System.out.println("Valid");
else
System.out.println("Invalid!	");
}
}
