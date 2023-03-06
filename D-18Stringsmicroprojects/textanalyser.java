//text Analyzer: Create an application that takes a text as input and performs different analysis like counting the number of characters, words, and lines, or finding the most common word
import java.util.*;
class textanalyser
  {
    public static int charactercount(String str)
    {
      int count=0;
      for(int i=0;i<=str.length()-1;i++)
        {
          if(str.charAt(i)!=' ')
          {
            count++;
          }
        }
       return count;
        }
    public static int wordcount(String str)
    {
      String[]words=string.split( " ");
      int c=1;
      for(int i=0;i<words.length-1;i++)
        {
          String count=words[i];
          for(int j=i+1;i<words.length-1;j++)
         {
           if(count==words[j])
           {
           c++;
         }
        }
          if(c>1)
          {
            return words[i];
          }
        }
    public static void main(String args[])
    {
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string");
      string=s.nextLine();
      textanalyser y=new textanalyser();
      y.charactercount(string);
    }
  }
