import java.util.Scanner;

 class Binarytodecimal&octal
 {
    public static void main(String[] args) 
{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();

        
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println("Decimal equivalent: " + decimal);

        
        String octalString = Integer.toOctalString(decimal);
        System.out.println("Octal equivalent: " + octalString);
    }
}
