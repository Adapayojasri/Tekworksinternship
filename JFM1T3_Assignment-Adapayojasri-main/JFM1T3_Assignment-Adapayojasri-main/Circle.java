 
import java.util.*;
public class Circle
  { 
    public static void main(String args[])
    { 
      Scanner s=new Scanner(System.in);
     System.out.println("Enter the radius:");
      double radius=s.nextDouble();
     double circumference=3.14*radius*radius;
     System.out.println("The circumference of the circle is" +circumference);
    }
  }
