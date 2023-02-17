import java.util.*;
class electricitybill
  {
    int n1,n2;
    int gst,u,bill;
     double amount=0;
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("electricity bill calculator");
      System.out.println("enter previous units");
      int n1=s.nextInt();
      System.out.println("enter present units");
      int n2=s.nextInt();
      System.out.print("total units");
      units=a+b;
      if(units<=50)
      {
        amount =0.5*units;
          gst=amount*10/100;
        System.out.println("the electricity bill is");
        }
      if(u>50 &&u<=250)
      {
        amount =0.5*u;
          gst=amount*20/100;
        System.out.println("the electricity bill is");
        }
      if(u>150&&u<=250)
      {
        amount =0.5*u;
          gst=amount*30/100;
        System.out.println("the electricity bill is");
        }
      
      }
      }