import java.util.*;
 class UpperInvalidAlphabetException extends Exception
  {
     public UpperInvalidAlphabetException(String message)
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
 
    public void checkStartingCharacter() throws UpperInvalidAlphabetException {
      if(string.charAt(0)>'A'||string.charAt(0)<'Z')
        {
         throw new UpperInvalidAlphabetException("Invalid alphabet: " + alphabet);
        }
       System.out.println("Your alphabet  is valid ");
       
    }
}
   class PersonMain
 {
    public static void main(String[] args) {
        Person num = new Person("hfgh");
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
 