import java.util.*;
class product
  {
    String name;
   int prices;
    product(String Productname,int price)
    {
      name=Productname;
      prices=price;
    }
  }
class shop extends product
  {
    String Product1,Product2;
    void addingitem() throws Exception
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter product to add");
       Product1=sc.nextLine();
          if(Product1.equals(name))
            throw new Exception("the product is already existed");
          else
            System.out.println(Product1+"is successfully added to store");
           }
    void removetheproduct() throws Exception
    {
       Scanner sc=new Scanner(System.in);
      System.out.println("product to be removed");
       Product2=sc.nextLine();
      if(Product2.equals(name))
        System.out.println(Product2+"is removed successfully");
      else
        throw new Exception("productnotfoundexception");
    }
   
  }
class shopping
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      product p=new product("gfgh",676);
      shop s=new shop();
      System.out.println("shopping");
      System.out.println("1.add product");
       System.out.println("2.remove product");
       System.out.println("3.display products");
      int i=sc.nextInt();
      switch(i)
        {
          case 1:
            s.addtheitem();
            break;
          case 2:
            s.removetheproduct();
            break;
        
        }
    }
  }