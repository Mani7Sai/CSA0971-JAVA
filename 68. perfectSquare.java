//write a pgm for perfect square
class perfectSquare{
public static void main(String[] args)    
{   
int n = 81   ;
Double sqrt = Math.sqrt(n);
if (sqrt - Math.floor(sqrt)==0)
{
	System.out.println(sqrt);    
	System.out.print("Yes, the given number is perfect square.");   
}
else  
{
	System.out.print("No, the given number is not perfect square.");   
}
}   
}   