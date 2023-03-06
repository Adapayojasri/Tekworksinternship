import java.util.*;
class tennisgame
  {
    public static void main(String args[])
    {
      String string=new String();
      Scanner s=new Scanner(System.in);
      string=s.nextLine();
      int w=0,l=0;
      for(int i=0;i<string.length()-1;i++)
        {
          if(string.charAt(i)=='0')
            w++;
          else
            l++;  
        }
      if(w<l)
        System.out.println("win");
      else
        System.out.println("lose");
    }
  }