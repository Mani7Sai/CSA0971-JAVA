public class ReverseString1 {
  public static void main(String[] args) {
        String s = "Saveetha";
    String reversedString = "";
    
    for(int i = s.length()-1; i>=0; i--){
      reversedString = reversedString + s.charAt(i);
    }
    
 System.out.print("The reversed string of the '"+s+"' is: " );
    System.out.println(reversedString);
  }
}
