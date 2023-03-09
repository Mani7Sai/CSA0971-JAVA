// Given number is Perfect Number or not
class perfectNumber
{
   public static void main(String[] args)
   {
      int num, i, sum=0;
      num = 28;     
      for(i=1; i<num; i++)
      {
         if(num%i==0)
            sum = sum+i;
      }
      
      if(sum==num)
         System.out.println("\nIt is a Perfect Number.");
      else
         System.out.println("\nIt is not a Perfect Number.");
   }
}