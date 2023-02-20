import java.util.*;
class maximum3
  {
    public static void max(int n1 ,int n2,int n3)
    {
       if(n1>n2 && n1>n3)
      {
        System.out.println("n1 is a maximum number");
      }
       else if(n2>n3){
        System.out.println("n2 is a maximum number");
       }
       else {
       System.out.println("n3 is a maximum number");
       }
    }
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int  n1=s.nextInt();
      int  n2=s.nextInt();
      int  n3=s.nextInt();
      maximum3 y=new maximum3();
    y.max(n1,n2,n3);
    }
  }