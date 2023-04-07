import java.util.*;
class InvalidPriceException extends Exception
  {
    InvalidPriceException(String message)
    {
      super(message);
    }
  }
class productexception
  {
    String productname;
    int price;
    int quantity;
 void name()
   {
      Scanner s=new Scanner(System.in);
    System.out.println("enter the product name:");
      try
        {
      productname=s.next();
        }
      catch(InputMismatchException i)
        {
          System.out.println("product name should be in alphabets");
          name();
        }
    }
 void price()
    {
       Scanner s=new Scanner(System.in);
    System.out.println("enter the product price:");
      price=s.nextInt();
      if(price<0)
      {
      try
        {
      throw new InvalidPriceException("price must be greater than zero");
         }
      catch(InvalidPriceException i)
        {
         System.out.println(i);
        }
      }
      else
      {
        System.out.println("product price is :"+price);
      }
  }
    void quantity()
    {
       Scanner s=new Scanner(System.in);
     System.out.println("enter the how much quantity you want:"); 
      try
        {
      quantity=s.nextInt();
        }
      catch(InputMismatchException i)
        {
         System.out.println("quantity must be in integers");
          quantity();
        }
    }
    void display()
    {
      System.out.println("product name is:"+productname);
      System.out.println("product price is:"+price);
      System.out.println("product price is:"+quantity);

    }
  }
class productmain
  {
    public static void main(String[] ar)
    {
      System.out.println("enter the number of products:");
      Scanner s=new Scanner(System.in);
      int numberofProducts=s.nextInt();
  productexception pr[]=new productexception[numberofProducts];
    for(int i=0;i<numberofProducts;i++)
      {
        pr[i]=new productexception();
        pr[i].name();
    pr[i].price();
    pr[i].quantity();
        pr[i].display();
    }
  }
  }