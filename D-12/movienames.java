import java.util.*;
class movienames
{  
    public static void main(String args[])
    { 
      String movienames[]={"abc","def","ghi"};
     displaymovienames(movienames,3);
    }
  static void displaymovienames(String ps[],int n1)
  {
    for(int i=0;i<=ps.length-1;i++)
      {
    System.out.println(ps[i]);

      }
  }
}