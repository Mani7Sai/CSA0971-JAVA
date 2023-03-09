
import java.util.*;
class MaximumandMini {
    public static void main(String[] args) 
	{
	int m,n;
	int a[]={1,423,6,46,34,23,13,53,4}; 
	System.out.println("Enter the value of M,N");
	Scanner sc=new Scanner(System.in);
	m=sc.nextInt();
	n=sc.nextInt();
        
            
          //Implemented inbuilt function to sort array
        Arrays.sort(a);
        
          // after sorting the value at 0th position will minimum and 
        //nth position will be maximum
        System.out.println("min-"+a[m]+" max-"+a[n]);
    }
}