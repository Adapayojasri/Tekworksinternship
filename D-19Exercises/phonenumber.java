import java.util.*;
class phonenumber
  {
     public static void mobilenumber(String number)
    {
      int count=0;
     for(int i=0;i<number.length()-1;i++)
      {
      if(number.charAt(i)>='0'&&number.charAt(i)<='9')
        {
          count++;
        }
      }
        if(count==10)
        {
System.out.println("It is a valid phone number");
        }
        else
        {
         System.out.println("It is a invalid phone number"); 
        }
    }
    public static void main(String args[])
    {
      String str=new String();
      Scanner s=new Scanner(System.in);
      str=s.nextLine();
      mobilenumber(str);
    
  }
  }