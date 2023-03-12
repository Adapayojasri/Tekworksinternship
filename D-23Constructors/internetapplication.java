import java.util.*;
class internetapplication
  {
    String username;
      int password;
      int IFSC;
   internetapplication(String s,int r)
    {
      username=s;
      password=r;
      System.out.println("The username is:"+s);
      System.out.println("The password is:"+r);
    }
    void getdata()
    {
    System.out.println("Internet banking application");
    Scanner y=new Scanner(System.in);
 //System.out.println("enter username is:");
      //username =y.nextLine();
     // System.out.println("Username is " +username);
 // System.out.println("enter password is:");
    //  password =y.nextInt();
      //System.out.println("Password is " +password);
       System.out.println("enter IFCS code is:");
      IFSC =y.nextInt();
      System.out.println("IFSC code is " +IFSC);  
  }
    void checkusername()
    {
      if(username=="bbb")
      {
        System.out.println("You are a valid user");
      }
      else
      {
        System.out.println("You are an invalid user");
      }
    }
    void checkpassword()
    {
      if(password==11111)
      {
        System.out.println("Password is valid");
      }
      else
      {
        System.out.println("Password is invalid");
      }
    }
public static void main(String args[])
  {
    internetapplication c=new internetapplication("tgg",11151);
  c.getdata();
  c.checkusername();
  c.checkpassword();
  }
  }