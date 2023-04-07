import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 class Person1 implements Comparable<Person1>
{	
	private String name;
	private int age;
	public Person1(String name,int age) 
	{
		this.name=name;
		this.age=age;
     }
	public String getName() 
  {
		return name;
	}
	public void setName(String name) 
  {
		this.name = name;
	}
	public int getAge() 
  {
		return age;
	}
	public void setAge(int age)
  {
		this.age = age;
	}
	public String toString()
	{
		return "name:"+getName()+" "+"age:"+getAge();
	}
	public int compareTo(Person1 other)
	{
		int name1=this.name.compareTo(other.name);
		return name1;
	}
}
class Person
{
	public static void main(String[] args) 
	{
		List<Person1> li=new ArrayList<>();
		li.add(new Person1("ravi",27));
		li.add(new Person1("abd",30));
	
		Collections.sort(li);
		for(Person1 e:li)
		{
			System.out.println(e.toString());
		}
	}

}