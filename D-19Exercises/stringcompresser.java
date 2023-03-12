import java.util.*;
class stringcompresser
  {
    public static void main(String args[])
    {
      int count=0;
       String str=new String();
      Scanner s=new Scanner(System.in);
      str=s.nextLine();
      System.out.println(str);
      int[]c=new int[str.length()];
      char str1[]=str.toCharArray();
      for(int i=0;i<str.length();i++)
        {
          c[i]=1;
          for(int j=i+1;j<str.length();j++)
            {
              if(str1[i]==str1[j])
              {
                c[i]++;
                str1[j]='0';
              }
            }
        }
      System.out.println("Frequency of characters in the string");
      System.out.println("character frequencies");
      for(int i=0;i<c.length;i++)
        {
          
      
    }
  }