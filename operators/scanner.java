import java.util.Scanner;
class scanner
  {
    public static void main(String args[])
    {
      int x;char y;double z;String h;
      Scanner s=new Scanner(System.in);
      System.out.println("enter values for x,y,z,h");
      x=s.nextInt();       
      y=s.next().charAt(0);
      z=s.nextDouble();
      h=s.next();
      System.out.println("x values is"+x);
      System.out.println("Y value is"+y);
      System.out.println("z value is"+z);
      
    }
  }