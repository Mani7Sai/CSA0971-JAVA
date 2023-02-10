import java.util.Scanner;

public class lcmgcd{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();
    int[] numbers = new int[n];

    System.out.print("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }

    int lcm = lcm(numbers);
    System.out.println("The LCM of the given numbers is: " + lcm);

    int gcd = gcd(numbers);
    System.out.println("The GCD of the given numbers is: " + gcd);
  }

  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  private static int gcd(int[] numbers) {
    int result = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      result = gcd(result, numbers[i]);
    }
    return result;
  }

  private static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }

  private static int lcm(int[] numbers) {
    int result = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      result = lcm(result, numbers[i]);
    }
    return result;
  }
}
