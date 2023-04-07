//Generate Custome exception if starting charcater of word is not an alphabet
import java.util.*;
 class InvalidAlphabetException extends Exception
  {
     public InvalidAlphabetException(String message)
    {
       super(message);
    }
} 
 class Person
  {
      String name;;
    public  Person(String name) 
    {
        this.name = name;
    }
 
    public void checkStartingCharacter() throws InvalidAlphabetException {
      if(name.charAt(0)<'A'||name.charAt(0)>'Z' && name.charAt(0)<'a'||name.charAt(0)>'z')
        {
         throw new InvalidAlphabetException("Invalid alphabet");
        }
      else
        
       System.out.println("Your alphabet  is valid ");
       
    }
}
   class PersonMain
 {
    public static void main(String[] args) {
        Person num = new Person("hjhgg");
        try
          {
            num.checkStartingCharacter();
           } 
        catch (InvalidAlphabetException e)
          {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 