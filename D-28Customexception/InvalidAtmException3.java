//Generate Custome exception if the ATM pin number is not equal to 0000
import java.util.*;
class InvalidAtmException3 extends Exception
  {
    public InvalidAtmException3(String message)
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
      if(atmpinnumber!=0000)
        {
          throw new InvalidAtmException("Invalid atm pin number: " + atmpinnumber);
        }
        System.out.println("Your atm pin number is " + atmpinnumber + " and it is valid ");
    }
}
  class pinnumberMain 
 {
    public static void main(String[] args) {
        Pinnumber num = new Pinnumber(67656);
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
 