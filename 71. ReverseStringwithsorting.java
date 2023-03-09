import java.util.*;
public class ReverseString{  
public static void main(String[] args) { 
 
 String s= "saveetha";
    StringBuilder sb=new StringBuilder(s);  
 String s1= new String (sb.reverse()); 
// sort the reversed string
char charArray[] = s1.toCharArray();
      Arrays.sort(charArray);
      System.out.println(new String(charArray)); 
         
    }  
}