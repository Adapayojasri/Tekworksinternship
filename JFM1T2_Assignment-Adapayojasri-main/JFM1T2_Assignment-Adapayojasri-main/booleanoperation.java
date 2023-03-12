/*  JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     Sample Input:
     Enter x as boolean value(true/false): 
     true
     Enter y as boolean value(true/false): 
     false
     
     Expected Output:
     x&&y is: false
     x||y is: true
     !x is: false
     !y is: true

*/

//import statements for java program to read inputs using Scanner class
import java.util.*;
class booleanoperation
  {
    public static void  display(char ch)
     {
       if(x&&y)
         {
            System.out.println(false);
         }
       else if(x||y )
         {
            System.out.println(true);
          }
       else if(!x)
       {
          System.out.println(false);
        }
      else if(!y)
      {
        System.out.println(true);
      }
     }
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of x:");
    x=sc.next();
    System.out.println("The value of x is"+x);
    System.out.println("Enter the value of y:");
    y=sc.next();
    System.out.println("The value of y is"+y);
    display(x,y);
  }
}
//main method

/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*Take input from user
  System.out.println("Enter x as boolean value(true/false): ");
  boolean x=sc.nextBoolean();
*/

//print apppropriate result for boolean operations
