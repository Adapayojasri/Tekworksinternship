import java.util.*;
class firstandlast
{  
    public static void main(String args[])
    {  
        int number = 123456789;
        int firstnumber = 0;
        int lastnumber = 0;
        lastnumber = number%10;
        System.out.println("Last number: "+lastnumber);
        while(number!=0) {
            firstnumber = number%10;
            number=number/10;
        }
        System.out.println("First number: "+firstnumber);
    }
}
 