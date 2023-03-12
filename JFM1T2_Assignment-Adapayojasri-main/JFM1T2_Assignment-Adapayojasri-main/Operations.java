/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
 class Operations 
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
   
   
//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations
