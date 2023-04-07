//Generate Custome exception if ATM pin does not have exactly 4 digits
import java.util.*;
class InvalidAtmException2 extends Exception
  {
    public InvalidAtmException2(String message)
    {
       super(message);
    }
} 
class Pinnumber
  {
     int atmpinnumber;
    public Pinnumber( int atmpinnumber) 
    {
        this.atmpinnumber = atmpinnumber;
    }
 
    public void checkAtmpinnumber() throws InvalidAtmException {
      if(atmpinnumber<1000||atmpinnumber>9999)
        {
          throw new InvalidAtmException("Invalid atm pin number: " + atmpinnumber);
        }
        System.out.println("Your atm pin number is " + atmpinnumber + " and it is valid ");
    }
}
  class pinnumberMain 
 {
    public static void main(String[] args)
   {
        Pinnumber num =new Pinnumber(5);
        try
          {
            num.checkAtmpinnumber();
           } 
        catch (InvalidAtmException e)
          {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 