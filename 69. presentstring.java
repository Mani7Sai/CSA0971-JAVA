import java.io.* ;
import java.util.*;
class presentstring
{
public static void main (String [] args) {

Scanner sc = new Scanner (System.in);
int found = 0; 
System.out.println(" enter the String");
String s = sc.next ();
System.out.println("enter the character to find from the string ");
char c=sc. next () .charAt (0);
for (int i = 0; i < s.length (); i++)
{ 
    if (c == s.charAt (i))
    {
        found = i; 
      break;
    }
    
}

if (found!=0)
{
    System.out.print ("character is present in the string at the index = " +found); 
                           
}
else
{
    System.out.print ("character is not present in the string");
                          
}
}
}