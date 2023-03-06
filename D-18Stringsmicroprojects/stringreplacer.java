import java.util.*;
class stringreplacer
  {
public static void main(String args[])
    {
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string");
      string=s.nextLine();
      String word1=new String();
      System.out.println("enter the first word1");
      string=s.nextLine();
      String word2=new String();
      System.out.println("enter the replace word2");
      string=s.nextLine();
        String outputstring=replaceword(string,word1,word2);
      System.out.println(outputstring);
    }
     public static String replaceword(String string, String word1, String word2)
    {
      String[] word = string.split(" ");
        for(int j=0; j<word.length;j++) 
        {
            if (word[j].equals(word1))
            {
                word[j] = word2;   
              }
           }
      String newstring=String.join(" ",word);
      return newstring;
    }
  }