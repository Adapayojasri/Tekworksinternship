import java.util.*;
class salary
  {
    public static void num(int sal,float DA, float HRA, int gross )
    {
      if(sal<=10000)
      {
       DA=sal*20/100;
       HRA=sal*80/100;
       gross=sal+HRA+DA;
      System.out.println("gross");
      }
       else if(sal<=20000)
      { 
       DA=sal*25/100;
       HRA=sal*90/100;
       gross=sal+HRA+DA;
        System.out.println("gross");
      }
        else if(sal>20000)
      { 
       DA=sal*30/100;
       HRA=sal*95/100;
       gross=sal+HRA+DA;
       System.out.println("gross");
       }
       else
      System.out.println("no salary");
    }
    public static void main(String args[])
      {
       Scanner s=new Scanner(System.in);
      int sal=s.nextInt();
        int DA=s.nextInt();
        int HRA=s.nextInt();
      salary y=new salary();
    y.num (sal,DA,HRA);
      }
  }