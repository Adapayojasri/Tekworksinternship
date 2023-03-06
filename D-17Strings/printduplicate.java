import java.util.*;
class printduplicate
  {
    public static void printduplicatecharacters(String str) 
    {
      System.out.println("duplicate characters");
       int[] num = new int[256];
        for(int i=0;i<str.length()-1;i++)
          {
            char c = str.charAt(i);
            num[c]=num[c]+1;
          }
        for (int i = 0; i <num.length-1; i++) 
        {
            if (num[i]>1) 
            {
System.out.println("duplicate characters are:"+(char)i);
            }
       }
    }
public static void main(String args[])
    {
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string");
      string=s.nextLine();
    printduplicate y=new printduplicate();
  y.printduplicatecharacters(string);
    }
}