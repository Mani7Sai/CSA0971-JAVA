import java.util.*;
class array1{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the lower limit:");
int m=sc.nextInt();
System.out.println("enter the upper limit:");
int n=sc.nextInt();
int[] arr=new int[n+1];
for(int i=m;i<=n;i++)
{
arr[i]=i;
}
for(int i=m;i<=n;i++)
{
System.out.print(arr[i]+" ");
System.out.print(arr[i]*arr[i]+" ");
System.out.println();
}
}
}