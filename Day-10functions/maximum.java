import java.util.*;
class maximum
  {
    public static void max(int n1 ,int n2)
    {
      if(n1>n2)
        System.out.println(n1+ "is a maximum number");
       else
        System.out.println(n2+ "is a maximum number");
       }
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int  n1=s.nextInt();
      int  n2=s.nextInt();
      maximum y=new maximum();
      y.max(n1,n2);
    }
    }