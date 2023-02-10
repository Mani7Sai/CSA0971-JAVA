import java.util.Scanner;

public class ReverseWord {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = input.nextLine();
    
    int length = word.length();
    String reverse = "";
    
    for (int i = length - 1; i >= 0; i--) {
      reverse = reverse + word.charAt(i);
    }
    
    System.out.println("The reverse of the word is: " + reverse);
  }
}
