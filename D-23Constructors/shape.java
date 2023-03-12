
/*Create a class called Shape that has properties such as color and a method to calculate the area. Create subclasses such as Rectangle, Triangle, and Circle that inherit from Shape and override the area calculation method. Create a class called ShapeTester that creates objects of the different shape classes and calls the area calculation method on them.*/
import java.util.*;
class shape 
{
  String color;
  int length;
  int breadth;
  double radius;
  shape(String color,int length, int breadth,double radius) 
  {
    this.color=color;
    this.length = length;
    this.breadth = breadth;
    this.radius = radius;
  }
  void getdetails()
  {
    System.out.println(length + " " + breadth);
  }
}
class rectangle extends shape
  {
  rectangle(int length, int breadth)
    {
    this.length = length;
    this.breadth = breadth;
    }
  void displayrectangle()
    {
    int area = length * breadth;
    System.out.println(area);
    }
  }

class triangle extends shape
  {
    triangle(int length,int breadth)
    {
      this.length = length;
    this.breadth = breadth;   
    }
    void displaytriangle() {
    int area = length * breadth;
    System.out.println(area);
    }
  
}
class circle extends shape
{
  circle(double radius)
  {
    this.radius=radius;
  }
  void displaycircle()
    {
   double area=3.14*radius*radius;
    System.out.println(area);
    }
}
class shapetester {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the length");
    int n1=s.nextInt();
    System.out.println("enter the breadth");
    int n2=s.nextInt();
    System.out.println("enter the radius");
    double n3=s.nextDouble();
    shape u=new shape("blue",67,54,9);
    rectangle r=new rectangle(n1,n2);
    triangle t =new triangle(n1,n2);
    circle c=new circle(n3);
    r.displayrectangle();
    t.displaytriangle();
    c.displaycircle();  
  }
}