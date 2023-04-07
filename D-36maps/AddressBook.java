//Address Book: Create a class called AddressBook that stores a collection of contacts in a HashMap. The class should have methods to add, edit, and delete contacts, as well as to search for a contact by name.
import java.util.*;
class AddressBook
  {
    public static void main(String args[])
    {
     HashMap<Integer,String>hm =new HashMap<Integer,String>();
        hm.put (new Integer ("aaa", 1234), "first object");
       hm.put (new Integer ("bbb", 4567), "second object");
       hm.put (new Integer ("ccc", 3345), "third object");
       for (Map.Entry u: hm.entrySet())
        {
            System.out.println (u.getKey()+ "  " +u.getValue());
        }
    }
}
class book
  {
    private String personname;
    private int housenumber;
   private String streetname;
   private long pincode;
    public  book (String nam, int num,String stre,long code)
    {
        this.personname = nam;
        this.housenumber = num;
        this.streetname=stre;
        this.pincode=code;
      
    }
	public String getPersonname() 
    {
		return personname;
	}
	public void setPersonname(String personname)
    {
		this.personname = personname;
	}
	public int getHousenumber()
    {
		return housenumber;
	}
	public void setHousenumber(int housenumber)
    {
		this.housenumber = housenumber;
	}
	public String getStreetname()
    {
		return streetname;
	}
	public void setStreetname(String streetname)
    {
		this.streetname = streetname;
	}
	public long getPincode()
    {
		return pincode;
	}
	public void setPincode(long pincode)
    {
		this.pincode = pincode;
	} 
    public String toString ()
    {
        return "personname: " + personname + " housenumber: " + housenumber +"streetname:" + streetname +"pincode:" + pincode;
    }
    public void add()
    {
      System.out.println("Enter the details that you want to add:");
      
    }
  }