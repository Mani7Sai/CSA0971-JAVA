import java.util.*;
 class RomanToInteger
 {
    
    public static void main(String[] args) 
{		
	   Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine();
        int integer = romanToInt(romanNumeral);
        System.out.println("The integer representation is: " + integer);
    }
    
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            if (i < s.length() - 1 && current < map.get(s.charAt(i+1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }
}

