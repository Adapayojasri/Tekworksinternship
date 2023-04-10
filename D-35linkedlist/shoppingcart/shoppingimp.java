//Shopping Cart: Create a class called ShoppingCart that stores a collection of items in a ArrayList. The class should have methods to add, remove, and display items in the cart, as well as to calculate the total cost of the items in the cart.
import java.util.*;
class shoppingimp implements shoppinginterface
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<shoppingdata> sd = new ArrayList<>();
    double[] costTotal = new double[10];
    public void add()
    {
      System.out.println("enter the items and cost: ");
      String name = sc.next();
      double cost = sc.nextDouble();
      sd.add(new shoppingdata(name,cost));  
    }
   public  void remove()
    {
      if(sd.size() == 0)
      {
        System.out.println("there is no items in the list to delete");
      }
      else
      {
        String verify = null;
        System.out.println("enter item name to remove:");
        String item = sc.next();
        for(shoppingdata e : sd)
        {
          if(e.getItemname()==item)
          {
            sd.remove(e);
            verify = "found";
            break;
          }
        }
        if(verify == null)
        {
          System.out.println("already removed the item data from the database");
        }
      }
    }
   public  void display()
    {
      if(sd.size() == 0)
      {
        System.out.println("no data available for display the items");
      }
      else
      {
        Iterator itr = sd.iterator();
        while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      }
    }
  }