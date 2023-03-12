import java.util.*;
interface interfaceexample1
  { 
    String patientdetails();
    void  Hospitalbills();
    int Hospitaltimings();  
  }
  class hospital implements interfaceexample1
  {
     public String patientdetails()
    {
      System.out.println("Patient details:");
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the patient name");
      String patientname=s.next();
      System.out.println("Patient name is " + patientname);
      System.out.println("Enter the patient age");
      int patientage=s.nextInt();
      System.out.println("Patient age is "+patientage);
      System.out.println("Enter the patient gender:");
      String patientgender=s.next();
      System.out.println("The patient gender is :" +patientgender);
      return patientname;
    }
    public  void Hospitalbills()
    {
      System.out.println("Hospital bills :");
       Scanner s=new Scanner(System.in);
      System.out.println("Enter the patient name");
      String patientname=s.nextLine();
      System.out.println("Patient name is " + patientname);
      System.out.println("Enter how many days the patient stay");
      int days=s.nextInt();
      System.out.println(days);
      System.out.println("Enter the bill for one day: ");
      int bill=s.nextInt();
      System.out.println("Bill for one day is " +bill);
      System.out.println("Enter the bill for total days");
      int totalbill=bill*days;
      System.out.println("Total bill is "+totalbill);
    }
   public  void Hospitaltimings()
    {
      System.out.println("Hospital timings:");
      Scanner s=new Scanner(System.in);
      System.out.println("Enter staring timing");
      int starttime=s.nextInt();
      System.out.println("Enter ending timing");
      int endtime=s.nextInt();
      System.out.println("End timing is"+endtime);
      //return starttime; 
    }
  }
class interfaceexample 
 {
     public static void main(String args[])
    {
     hospital hos=new hospital();
      hos.patientdetails();
      hos.Hospitalbills();
      hos. Hospitaltimings();
     }
 }