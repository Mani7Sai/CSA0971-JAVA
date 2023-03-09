
class LeapYear {
   public static void main(String[] args){
       String stryear="23/12/2020";
	          stryear = stryear.substring(6,10);
	  int year= Integer.parseInt(stryear);
     System.out.println("year "+ year);
      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
   }
}