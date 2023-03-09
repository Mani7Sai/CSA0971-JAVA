import java.util.*;
public class ATM
{  
public static void main(String args[])
{ 
int a,b,c,d,Total;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2000 Denomation" );
a=sc.nextInt();
System.out.println("Enter 500 Denomation" );
b=sc.nextInt();
System.out.println("Enter 200 Denomation" );
c=sc.nextInt();
System.out.println("Enter 100 Denomation" );
d=sc.nextInt();
Total=(2000*a+500*b+200*c+100*d);
System.out.println("2000"+ "*" +a +"="+(2000*a));
System.out.println("500"+ "*" +b +"="+(500*b));
System.out.println("200"+ "*" +c +"="+(2000*c));
System.out.println("100"+ "*" +d +"="+(2000*a));
System.out.println("Total Amount in ATM"+Total);
}
}