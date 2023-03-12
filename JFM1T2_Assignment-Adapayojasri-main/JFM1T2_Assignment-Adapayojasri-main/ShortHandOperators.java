/*  JFM1T2_Assignment4:

    Perform the following operations where a = 10 and b =20 using shorthand assignment operators and print the value of a in console for each expression.
     1. a*= b
     2. a-= b
     3. a/= b
     4. a%= b
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first value: 
    10
    Enter second value: 
    20
    
    Expected Output:
    a*=b is: 200
    a-=b is: 180
    a/=b is: 9
    a%=b is: 9
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
 class example1
 {
   public static void multiplication(int a,int b)
   {
     a*=b;
     System.out.println("a*=b is:"+a);
   }
   public static void difference(int a,int b)
   {
     a-=b;
     System.out.println("a-=b:"+a);
   }
   public static void division(int a,int b)
   {
     a/=b;
     System.out.println("a/=b is:"+a);
   }
   public static void remainder(int a,int b)
   {
     a%=b;
     System.out.println("a%=b is:"+a);
   }
   public static void main(String args[])
   {
     int a,b;
      Scanner u=new Scanner(System.in);
    System.out.println("Enter the value of a:");
    a=u.nextInt();
    System.out.println("The value of a is"+a);
    System.out.println("Enter the value of b:");
    b=u.nextInt();
    System.out.println("The value of b is"+b);
     multiplication(a,b);
     difference(a,b);
     division(a,b);
     remainder(a,b);
 }
 }

//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first value: ");
  int a=sc.nextInt();
*/

//print appropriate result for assignment operators

}