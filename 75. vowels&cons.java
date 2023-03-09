public class vowels 
{
  public static void main(String[] args) 
  {
  String s="Saveeths School of Engineering";
  String s1=s.replaceAll("[aeiou]","");
  String s2=s.replaceAll(!"[aeiou]","");
  //String s2=s.replaceAll("[bcdfghjklmnpqrstuvwxyz]","");
  System.out.println("The consonants are :\n" +s1);
   System.out.println("The Vowels are:\n" +s2);
  }

}
7