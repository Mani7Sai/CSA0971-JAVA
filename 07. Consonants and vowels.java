import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = scanner.nextLine();

    System.out.print("Vowels: ");
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        System.out.print(c + " ");
      }
    }

    System.out.print("\nConsonants: ");
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
        System.out.print(c + " ");
      }
    }
  }
}
