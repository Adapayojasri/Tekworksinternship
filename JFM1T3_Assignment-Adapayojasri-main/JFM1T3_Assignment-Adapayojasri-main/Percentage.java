//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
class Percentage 
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the maximum marks:");
    int marks=s.nextInt();
    System.out.println("The maximum marks is "+marks);
    System.out.println("Enter the maximum marks:");
    int marks=s.nextInt();m.out.println("Enter the maximum marks:");
    int marks=s.nextInt();
    System.out.println("The maximum marks is "+marks);
    System.out.println("Enter the marks in sub1:");
    int sub1=s.nextInt();
    System.out.println("The  marks is sub1 "+sub1);
    System.out.println("Enter the marks in sub2:");
    int sub2=s.nextInt();
    System.out.println("The  marks is sub1 "+sub2);
    System.out.println("Enter the marks in sub3:");
    int sub3=s.nextInt();
    System.out.println("The  marks is sub1 "+sub3);
    System.out.println("Enter the marks in sub4:");
    int sub4=s.nextInt();
    System.out.println("The  marks is sub1 "+sub4);
    System.out.println("Enter the marks in sub5:");
    int sub5=s.nextInt();
    System.out.println("The  marks is sub1 "+sub5);
    int total=sub1+sub2+sub3+sub4+sub5;
    System.out.println("The total marks is: " + total);
    int percentage=total/5;
    System.out.println("The total percentage is: " + percentage);
    
  }
}

//Define the main method

//Declare the variables

//Use the scanner class to provide total_marks and maximum_marks at execution time
/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the total marks");
total_marks= scanner.nextInt();
System.out.println("Enter maximum marks possible "); 
maximum_marks=scanner.nextInt(); 
*/


//Calculate the percentage of marks

//Print the Result

