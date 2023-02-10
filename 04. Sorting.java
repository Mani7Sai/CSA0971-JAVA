import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class SortNames {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a list of names separated by comma: ");
    String names = input.nextLine();
    
    List<String> nameList = Arrays.asList(names.split(","));
    System.out.println("Original List: " + nameList);
    
    System.out.print("Sort in Ascending or Descending Order (A/D): ");
    String order = input.nextLine();
    
    if (order.equalsIgnoreCase("A")) {
      Collections.sort(nameList);
      System.out.println("Sorted List (Ascending): " + nameList);
    } else if (order.equalsIgnoreCase("D")) {
      Collections.sort(nameList, Collections.reverseOrder());
      System.out.println("Sorted List (Descending): " + nameList);
    } else {
      System.out.println("Invalid input. Only A or D are accepted.");
    }
  }
}
