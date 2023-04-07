import java.util.*;
class InvalidDimensionException extends Exception
  {
    public InvalidDimensionException(String message)
    {
      super(message);
    }
  }
class shape
   {
     double radius;
     int length;
     int breadth;
     int area;  
   void areaofcircle()
    {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the radius");
       radius=s.nextInt();
       if(radius<=0)
      {
     try
        {
      throw new   InvalidDimensionException("radius must be greater than zero"); 
       }
     catch(InvalidDimensionException i)
         {
         System.out.println(i);
          }
       }
       else
       {
          area=3.14*radius*radius;
         System.out.println("Area of a circle is:"+area);
       }
    }
  void areaofrectangle()
  {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the length and breadth");
       int length=s.nextInt();
       int  breadth=s.nextInt();
       if(length<=0 && length<=0){
     try
       {
      throw new   InvalidDimensionException("length and breadth must be greater than zero"); 
       }
     catch(InvalidDimensionException i)
       {
         System.out.println(i);
       }
   }
       else
       {
        area=length*breadth;
    System.out.println("Area of a Rectangle is:"+area);
        }
}
void areaoftriangle()
  {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the length and breadth");
       int length=s.nextInt();
       int breadth=s.nextInt();
       if(length<=0 && length<=0){
     try
       {
      throw new InvalidDimensionException("length and breadth must be greater than zero"); 
       }
     catch(InvalidDimensionException i)
       {
         System.out.println(i);
       }
       }
       else
       {
         area=49*(length*breadth);
    System.out.println("Area of a Triangle is:"+area);
       }    
  }
}
class shapemain
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
      int t=s.nextInt();
      shape[] sh=new shape[t];
      for(int i=0;i<=t;i++)
        {
          sh[i]=new shape();
          sh[i].areaofcircle();
          sh[i].areaofrectangle();
          sh[i].areaoftriangle();
  
        }
    }
  }