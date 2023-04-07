import java.util.List;
import java.util.*;
public class FruitMain
  {

	public static void main(String[] args) 
	{
		List<Fruit> li=new ArrayList<>();
		li.add(new Fruit(100,2.7));
		li.add(new Fruit(21,34.4));
		li.add(new Fruit(90,8.9));
		Collections.sort(li);
		for(Fruit e:li)
		{
			System.out.println(e.toString());
		}
	}

	
}
	 class Fruit implements Comparable<Fruit>
	{	 
	   int price;
	  double weight;
	  Fruit(int price,double weight)
	  {
		  this.price=price;
		  this.weight=weight;
	  }
	public int getPrice() {
		return price;
	}
	
	public double getWeight() {
		return weight;
	}
	public String toString()
	{
		return "price:"+getPrice()+" "+"weight:"+getWeight();
	  
	}
	public int compareTo(Fruit fm)
	{
		// return this.price - fm.price;
		
		if(this.price<fm.price)
			return -1;
		else
			if(this.price>fm.price)
				return 1;
			else 
				return 0;
	}
   }