import java.util.Scanner;
 class BinarytoDecimal_Octal
 {
                 Scanner scan;
	int num;
	void getVal() 
	{
                     System.out.println("Binary to Octal");
	    scan = new Scanner(System.in);
 	    System.out.println("\nEnter the number :");
	    num = Integer.parseInt(scan.nextLine(), 2);
		System.out.println("Binary of given numberis"+num);
	}
	void convert() 
	{
	        String octal = Integer.toOctalString(num);
	       System.out.println("Octal Value is : " + octal);
	}
 }
class BinarytoDecimal_Octal1
{
  public static void main(String... d) 
    {
        Binary_Octal obj = new Binary_Octal();
        obj.getVal();
        obj.convert();
   }
}