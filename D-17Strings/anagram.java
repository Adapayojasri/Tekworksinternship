import java.util.*;
class anagram
  {
      public static void anagramornot(String str1)
    {
      
      Scanner s=new Scanner(System.in);
      String str2=new String(s.nextLine());
      char c1[]=str1.toCharArray();
      char c2[]=str2.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      boolean result=Arrays.equals(c1,c2);
      if(result)
      {
        System.out.println("Two strings are Anagram");
      }
      else{
        System.out.println("two strings are not Anagram");
      }
      public static void main(String args[])
    {
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string");
      string=s.nextLine();
    anagram y=new anagram();
  y.angramornot(string);
    }
    }
  }