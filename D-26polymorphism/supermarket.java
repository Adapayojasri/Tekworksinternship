import java.util.*;
class supermarket
  {
    public double productrate;
    public void amount(int products)
    {
      int pro1;
      int pro2;
      int pro3;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the price of product 1:");
       pro1=s.nextInt();
      System.out.println("Enter the price of product 2:");
       pro2=s.nextInt();
      System.out.println("Enter the price of product 3:");
      pro3=s.nextInt();
       System.out.println("Enter the total price:");
       int total=pro1+pro2+pro3;
      System.out.println("The total price is:" +total);
    }
    public void amount(double price )
    {
      int pro1;
      int pro2;
      int pro3;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the price of product 1:");
       pro1=s.nextInt();
      System.out.println("The total price is :"+pro1);
      System.out.println("Enter the price of product 2:");
      pro2=s.nextInt();
      System.out.println("The total price is :"+pro2);
      System.out.println("Enter the price of product 3:");
     pro3=s.nextInt();
       System.out.println("Enter the total price:");
      System.out.println("The total price is :"+pro3);
       int total=pro1+pro2+pro3;
      System.out.println("The total price is:" +total);
    }
  }
class supermarketmain
  {
  public static void main(String args[]) 
    {
    supermarket p = new supermarket();
    Scanner r = new Scanner(System.in);
      int products;  
    System.out.println("Enter the no of products:");
       products=r.nextInt();
      p.amount(products);

    }
  }