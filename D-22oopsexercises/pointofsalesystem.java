import java.util.*;
class pointofsalesystem
  {
    String productname;
    int price;
    String quantity;
    void getname()
    {
      Scanner s=new Scanner(System.in);
    System.out.println("enter the product name:");
      productname=s.next();
      System.out.println("product name is:"+productname);
    }
    void getprice()
    {
       Scanner s=new Scanner(System.in);
    System.out.println("enter the product price:");
      price=s.nextInt();
      System.out.println("product price is:"+price);
    }
    void getquantity()
    {
       Scanner s=new Scanner(System.in);
     System.out.println("enter the getQuantity:"); 
      quantity=s.next();
     System.out.println("product price is:"+quantity);
    }
  }
class pointofsalesystem
  {
    public static void main(String[] ar)
    {
    Product p=new Product();
    p.getname();
    p.getprice();
    p.getquantity();
    }
  }