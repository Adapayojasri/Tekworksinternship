import java.util.*;
class weeknumberifelse
  {
    public static void num(int a)
    {
      if(a==1)
      System. out. println ("Day is Sunday ") ;
      else if(a==2)
      System. out. println(" Day is Monday ") ;
      else if(a==3)
      System. out. println (" Day is Tuesday") ;
      else if(a==4)
      System. out. println ("Day is Wednesday ") ;
      else if (a==5)
      System. out. println (" Day is Thursday ") ;
      else if (a==6)
      System. out. println (" Day is Friday ") ;
      else if (a==7)
      System. out. println (" Day is Saturday ") ;
      else
    System. out. println (" Wrong number entered ") ;
   }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      weeknumberifelse y=new weeknumberifelse();
      y.num(a);  
    }
  }