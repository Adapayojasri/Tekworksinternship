import java.util.Scanner;
 class operations 
 {
  public static void difference()
   {
     int x,y,dif;
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of x:");
    x=sc.nextInt();
    System.out.println("The value of x is"+x);
    System.out.println("Enter the value of y:");
    y=sc.nextInt();
    System.out.println("The value of y is"+y);
     dif=x-y;
     System.out.println("x-y="+dif);
   }
   public static void product()
   {
     int x,y,pro;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value of x:");
    x=s.nextInt();
    System.out.println("The value of x is"+x);
    System.out.println("Enter the value of y:");
    y=s.nextInt();
    System.out.println("The value of y is"+y);
     pro=x*y;
     System.out.println("x*y="+pro);
   }
   public static void division()
   {
     int x,y,div;
      Scanner c=new Scanner(System.in);
    System.out.println("Enter the value of x:");
    x=c.nextInt();
    System.out.println("The value of x is"+x);
    System.out.println("Enter the value of y:");
    y=c.nextInt();
    System.out.println("The value of y is"+y);
     div=x/y;
     System.out.println("x/y="+div);
   }
   public static void incrementdecrement()
   {
     int x,inc,dec;
      Scanner z=new Scanner(System.in);
    System.out.println("Enter the value of x:");
    x=z.nextInt();
    System.out.println("The value of x is"+x);
     inc=x++;
     dec=x--;
     System.out.println("The increment of x is"+inc);
     System.out.println("The decrement of x is"+dec);
   }
   public static void remainder()
   {
     int x,y,rem;
      Scanner u=new Scanner(System.in);
    System.out.println("Enter the value of x:");
    x=u.nextInt();
    System.out.println("The value of x is"+x);
    System.out.println("Enter the value of y:");
    y=u.nextInt();
    System.out.println("The value of y is"+y);
     rem=x/y;
     System.out.println("x%y="+rem);
   }
   public static void main(String args[])
   {
     difference();
     product();
     division();
     incrementdecrement();
     remainder();
     
   }
 }
   