import java.util.*;
class wordcount
  {
    public static void countnumberofwords(String str)
    {
      int count=0;
      for(int i=0;i<=str.length()-1;i++)
        {
          if(str.charAt(i)!=' ')
          {
            count++;
          }
        }
      System.out.println("number of words is:"+count);
    }
    public static void main(String args[])
    {
      int n;
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string");
      string=s.nextLine();
      wordcount y=new wordcount();
      y.countnumberofwords(string);
      
    }
  }