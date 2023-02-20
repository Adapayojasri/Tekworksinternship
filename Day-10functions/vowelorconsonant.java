import java.util.*;
class vowelorconsonant
  {
    public static void alphabet(char ch)
    {
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        System.out.println(ch+"is an vowel"); 
         else
      System.out.println(ch+"is an consonant");
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      char ch=s.next().charAt(0);
      vowelorconsonant y=new vowelorconsonant();
      y.alphabet(ch);   
    }
    }