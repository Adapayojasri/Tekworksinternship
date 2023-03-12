/*  JFM1T2_AssignmentPrograms2:

    Write a program to perform the below actions and print the result. Check if the below numbers are equal or not.
    1. 30 and 20
    2. 20 and 20
    3. 20 and 30
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    30
    Enter second number: 
    20
    
    Expected Output:
    30 and 20 is not equal
     
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
 class CheckingEquality 
{
  public static void display(int n1,int n2)
  {
  if(n1==n2)
  {
    System.out.println(n1+"and"+n2"is  equal");
   }
  else if(n1!=n2)
  {
    System.out.println(n1+"and"+n2"is not equal");
   }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n1:");
    n1=sc.nextInt();
    System.out.println("The value of n1 is"+n1);
    System.out.println("Enter the value of n2:");
    n2=sc.nextInt();
    System.out.println("The value of n2 is"+n2);
    display(n1,n2);
  }
}


//main method

/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//check if the two numbers are equal or not

//If the two numbers are equal then print both are equal else print both are not equal
