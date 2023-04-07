import java.util.*;
class Fruit
	{	 
	   int price;
	  double weight;
	  Fruit(int price,double weight)
	  {
		  this.price=price;
		  this.weight=weight;
	  }
	public int getPrice() 
    {
		return price;
	}
	public double getWeight()
    {
		return weight;
	}
	public String toString()
	{
		return "price:"+getPrice()+" "+"weight:"+getWeight();
  }  
	}
class Fruit1Main
  {
public static void main(String arg[])
  {
    	List<Fruit> li=new ArrayList<>();
		li.add(new Fruit(100,2.7));
		li.add(new Fruit(21,34.4));
		li.add(new Fruit(90,8.9));
    Comparator<Fruit> c=new Comparator<Fruit>()
      {
        @Override
        public int  compare(Fruit o1,Fruit o2)
        {
          if(o1.weight<o2.weight)
            return -1;
          else if(o1.weight>o2.weight)
            return -1;
          else return 0;     
        }
      };
		Collections.sort(li,c);
		for(Fruit e:li)
		{
			System.out.println(e.toString());
		}
  }
  }
  