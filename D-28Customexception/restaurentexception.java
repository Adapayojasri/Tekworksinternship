import java.util.*;
class InvaliddishException extends Exception
  {
    public InvaliddishException(String message)
    {
      super(message);
    }
  }
class restaurentexcepton
    {
       Scanner s=new Scanner(System.in);
    String dishname;
    int price;
      int num;
      String[] d;
    void getname()
    {
     
      System.out.println("enter the dish name:");
    try{
      dishname=s.next();
      }
      catch(InputMismatchException im)
      {
        System.out.println("dish name must be in alphabets ");
      }
    }
    void getingredients()
    {
      System.out.println("enter the number of ingredients:");
      int ingr=s.nextInt();
      String ingredients[]=new String[ingr];
      System.out.println("enter the ingredients:"); 
    }
void adddish()
  {
 
  System.out.println("enter the number of dishes:");
  num=s.nextInt();
  d=new String[num];
  for(int i=0;i<num;i++)
    {
      d[i]=s.nextLine();
    }
  for(int i=0;i<num;i++)
    {
    if(d[i]==dishname)
    {
  try
    {
    throw new InvaliddishException("dish is already exists");
  }
      catch(InvaliddishException i)
    {
      System.out.println(i);
    }
    }
      else
    {
      System.out.println("dish is added");
    }
    }
  }
  void removedish()
   {
    System.out.println("enter the  dish to be removed:");
    String dishname=s.next();
    for(int i=0;i<=d.length-1;i++)
      {
      if(d[i]!=dishname)
        {
        try{
        throw new InvaliddishException("dish is already removed");
              }
            catch(InvaliddishException f)
              {
              System.out.println(f);
              }
            }
            else{
              System.out.println("dish is removed");
            }

              }
          }
      
    void getprice()
    {
      
      System.out.println("enter the price:");
    
      try{
      price=s.nextInt();
      }
      catch(InputMismatchException id)
        {
        System.out.println("enter the valid price:");
        }
    
    }
      
      
  }
  
class Restaurant
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
    System.out.println("enter the number of dishes:");
      int num_dishes=s.nextInt();
    restaurentexception dh[]=new restaurentexception[num_dishes];
      for(int i=0;i<=num_dishes-1;i++)
        {
          dh[i]=new Dish();
         dh[i].getname();
        dh[i].getingredients();
        dh[i].adddish();
          dh[i].removedish();
        dh[i].getprice();
        }
  }
  }