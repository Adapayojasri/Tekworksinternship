import java.util.*;
class Polymorphism
  {
  int x=10;
  void show()
    {
    System.out.println("super class x value"+x);
    }
  }
class ChildPolymorphism extends Polymorphism
  {
   int x=34;
  void show()
  {
    super.show();
    System.out.println("child  class x value"+x);
  }
  void display()
    {
      System.out.println(x);
      System.out.println(super.x);
    }
  }
 
class PolymorphismMain {
  public static void main(String a[]) {
    Polymorphism p = new Polymorphism();
    ChildPolymorphism cp=new ChildPolymorphism();
  /*  Polymorphism p1;//reference object-it holds the address of object
    Childpolymorphism cp1;//refernce object
    p1=cp1; VALID //storing  the address of p into p1
    cp1=p1 invalid
            */
    p.show();
    cp.show();  
    cp.display();
  }
}