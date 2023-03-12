mport java.util.*;
class restaurentmanagement
  {
    String dishname;
    int price;
    void getname()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the dish name:");
      dish_name=s.next();
      System.out.println("dish name is:"+dishname);
    }
    void getingredients()
    {
       Scanner s=new Scanner(System.in);
      System.out.println("enter the number of ingredients:");
      int ing=s.nextInt();
      String ingredients[]=new String[ing];
      System.out.println("enter the ingredients:");
      for(int i=0;i<ingredients.length-1;i++)
        {
          ingredients[i]=s.next();
          
        }
    
    }
    void getprice()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the price:");
      price=s.nextInt();
      System.out.println("price is:"+price);
    }
  }
class Restaurant
  {
    public static void main(String[] args)
    {
    Dish d=new Dish();
    d.getname();
    d.getingredients();
    d.getprice();
  }
  }