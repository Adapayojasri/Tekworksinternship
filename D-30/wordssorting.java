import java.util.*;
class EmptyStringException extends Exception
  {
    EmptyStringException(String message)
    {
      super(message);
    }
  }
class wordssorting
  {
    String str;
    void read()
    {
     System.out.println("enter the string");
     Scanner s=new Scanner(System.in);
  try
      {
        str=s.nextLine();
        if(str.length() == 0)
            {
        throw new   EmptyStringException("Your String is empty"); 
            }
        else
         {
            System.out.println("Your String is not empty " + str);
          }
         }
     catch(EmptyStringException i)
       {
         System.out.println(i);
        } 
    }
    void sort()
    {
      char[] arr=str.toCharArray();
      Arrays.sort(arr);
      System.out.println(String.valueOf(arr));
    }
  }
class main
  {
    public static void main(String args[])
    {
        System.out.println("enter number of words");
      Scanner s=new Scanner(System.in);
      int numberofwords=s.nextInt();
      wordssorting b[]=new wordssorting[numberofwords];
      for(int i=0;i<numberofwords;i++)
        {
          b[i]=new wordssorting();
        b[i].read();
        b[i].sort();
           }
     }
  }