 
import java.util.Scanner;
class Percentage 
{
   public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter maximum marks:");
    int marks=s.nextInt();
    System.out.println("The maximum marks:"+marks);
    System.out.println("Enter the marks in sub1:");
    int sub1=s.nextInt();
    System.out.println("The marks in sub1"+sub1);
    System.out.println("Enter the marks in sub2:");
    int sub2=s.nextInt();
    System.out.println("The marks in sub1"+sub2);
    System.out.println("Enter the marks in sub3:");
    int sub3=s.nextInt();
    System.out.println("The marks in sub1"+sub3);
    System.out.println("Enter the marks in sub4:");
    int sub4=s.nextInt();
    System.out.println("The marks in sub1"+sub4);
    System.out.println("Enter the marks in sub5:");
    int sub5=s.nextInt();
    int total=sub1+sub2+sub3+sub4+sub5;
    System.out.println("Thetotal  marks is "+total);
    percentage=total/5;
    System.out.println("The percentage is "+percentage);
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

}