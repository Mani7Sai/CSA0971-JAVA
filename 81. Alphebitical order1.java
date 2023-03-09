import java.util.Arrays;  
public class Sort  
{  
public static void main(String args[])   
{  
String[] countries = {"Wood apple", "Blackberry", "Date", "Naseberry", "Tamarind", "Fig", "Mulberry",  "Apple", "Plum",  "Orange", "Custard apple",  "Apricot"};  
Arrays.sort(countries);  
Arrays.sort(countries,Collections.reverseOrder());
System.out.println(Arrays.toString(countries));  
System.out.println(Arrays.toString(countries));  
}  
}
