import java.util.*;
class InvalidAtmException extends Exception
  {
    public InvalidAtmException(String message)
    {
       super(message);
    }
} 
class Pin
  {
     String atmpinnumber="abc123";
    public Pin( String atmpinnumber) 
    {
        this.atmpinnumber = atmpinnumber;
    }
 
    public void checkAtmpinnumber(String enteredpin) throws InvalidAtmException {
      if(!enteredpin.equals(atmpinnumber))
        {
          throw new InvalidAtmException("Invalid atm pin number: " + atmpinnumber);
        }
        System.out.println("Your atm pin number is " + atmpinnumber + " and it is valid ");
    }
}
 class Main 
 {
    public static void main(String[] args) {
        Pin num = new Pin("abc123");
        try
          {
            num.checkAtmpinnumber("abc123");
           } 
        catch (InvalidAtmException e)
          {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 