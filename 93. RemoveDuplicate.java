import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Integer[] numberArr = new Integer[] {10,30,30,10,15,13,34,15};
       Set<Integer> uniqueSet = new LinkedHashSet<>(Arrays.asList(numberArr));
        for (Integer singleElement:uniqueSet ) 
		{
            System.out.println(singleElement);
        }

    }

}