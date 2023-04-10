/*Add a patient’s details to the system whenever there is a new patient admitted. 

The patient details should include his/her name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian's name, guardian’s address, guardian’s contact number. Assign a unique id to each patient admitted. 

Note: Validate user entered data. Such as 

Number of digits in age is 1 or 2 digits. 

Aadhar card number should contains 12 digits. 

Contact number should contain 10 digits only. 

The system can show the list of patients at any point of time. Basically, the system should be dynamic and a real time system. In other words, it can provide results at any point of time without any delays. Display proper error message if patients list is empty. 

Given the unique id assigned to a patient, provide all the details of that patient. 

In other words, the system should provide details about a patient using his/her unique id or name. 

The system can provide the list of all the patients from a particular city or a state. Also provide the list of patients belonging to a particular age group. For example, you can be asked to give the list of patients in the age group 50-60. Handle Null Pointer Exception if user entered values are empty. 

Mark the patient recovered when he starts working fine. 

The system should be able to delete the information of a patient when asked to.  Handle Null Pointer Exception if user entered patient id is not present in list. 

Implement these features using efficient data structures, collections and OOP concepts learnt in the Java Foundation course. Write clean and organized codes using proper objects and methods.*/
import java.util.*;
class InputValidation extends Exception
  {
    public InputValidation(String message)
    {
      super(message);
    }
  }
class AarogyaHospitalImp implements AarogyaHospitalInterface
  {
    String patientID;
   HashMap<patientID,AarogyaHospitalData> h=new HashMap<>();
    public void addpatient() throws InputValidation
    {
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter Patientid");
       String Patientid=sc.nextLine();
      System.out.println(" Patient name:");
    String Patientname=sc.nextLine();
      System.out.println("PatientAge:");
      String Patientage=sc.nextLine();
      try{
      if(Patientage.length()!=0 && Patientage.length()>2)
        throw new InputValidation("Invalid Age");}
      catch(InputValidation e)
        {
          System.out.println(e.getMessage());
        }
      System.out.println(" Enter patient gender: ");
      char gender=sc.next().charAt(0);
      System.out.println("Enter patient Aadharcard number:");
      String aadharcardnumnber=sc.nextLine();
      try{
        if(aadharcardnumber.length()<12 || aadharcardnumber.length()>12)
          throw new InputValidation("Invalid AadharNo.");
      }
      catch(InputValidation e1)
        {
          System.out.println(e1.getMessage());
        }
      System.out.println("Enter Patient Phoneumber:");
      String phonenumber=sc.nextLine();
      try{
        if(phonenumber.length()<10 ||phonenumber.length()>10)
          throw new InputValidation("Invalid ContactNo");
      }
      catch(InputValidation e1)
        {
          System.out.println(e1.getMessage());
        }
      System.out.println("city:");
      String city=sc.nextLine();
    System.out.println("Adress:");
      String adresss=sc.nextLine();
      System.out.println("Enter Date of admission");
      String dateofadmission=sc.nextLine();
      System.out.println("enter Guardian's Name:");
      String guardiansname=sc.nextLine();
       System.out.println("enter Guardian's Adress:");
      String guardiansadress=sc.nextLine();
       System.out.println("Enter Guardian's ContactNo:");
      String guardaianscontactnumber=sc.nextLine();
      h.put(patientid,new AarogyaHospitalData(Patientname,Patientage,gender,aadharcardnumber,phonenumber,city,adresss,dateofadmission,guardiansname,guardiansaddress,guardianscontactnumber));
     }
   public void viewpatient()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Do you want to view patient List?(Y/N)");
      char ch=sc.next().charAt(0);
      if(ch=='Y' || ch=='y')
        System.out.println(h);
      else
      System.out.println("Thank You");
          }
   public void searchpatient()
    {
       if(h.size()==0)
           System.out.println("No PatientData is available to Search");
        else
       {
               Scanner sc=new Scanner(System.in);
           System.out.println("Enter PatientID to Search");
           String patientid=sc.nextLine();
           String verify=null;
           for(String k:h.keySet())
               {
                 if(patientid.equals(k))
                 {
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
            System.out.println(h.get(patientid));
           else
            System.out.println("Not found any Data");
        }      
    }
  public  void searchbyage()
    {
      if(h.size()==0)
        System.out.println("no data to search");
      else{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Patient Age to search");
      String Patientage=sc.nextLine();
      try{
      if(Patientage.length()!=0 && Patientage.length()>2)
        throw new InputValidation("Invalid Age Error");}
      catch(InputValidation e)
        {
          System.out.println(e.getMessage());
        }
      searchbyage();
      String verify=null;
      ArrayList<AarogyaHospitalData>searchage=new ArrayList<>();
      for(AarogyaHospitalData itr:h.values())
        {
          if(Patientage.equals(itr.getPatientage()))
          {
            searchage.add(itr);
            verify="found";
          }
        }
      if(verify!=null)
        System.out.println(searchage);
      else
        System.out.println("EnteredAge data not found");
      }
    }
    public void searchbycity()
    {
      if(h.size()==0)
           System.out.println("No PatientData is available");
          else
           {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter city to search");
      String Patientcity=sc.nextLine();
      String verify=null;
      ArrayList<AarogyaHospitalData> ad=new ArrayList<>();
      for(AarogyaHospitalData itr:h.values())
        {
          if(Patientcity.equals(itr.getCity()))
          {
            ad.add(itr);
            verify="found"; 
          }
        }
      if(verify!=null)
        System.out.println(ad);
      else
        System.out.println("No such city found!");
           }
      
    }
   public void searchbydate()
    {
      if(h.size()==0)
           System.out.println("No PatientData is available");
      else
       {
      Scanner sc=new Scanner(System.in);
         System.out.println("Enter Date of Patient admitted ");
         String date=sc.nextLine();
         String verify=null;
         ArrayList<AarogyaHospitalData> searchdate=new ArrayList<>();
      for(AarogyaHospitalData itr:h.values())
        {
          if(date.equals(itr.getDateofadmission()))
          {            
    {
       if(h.size()==0)
           System.out.println("No PatientData is available to delete");
        else
       {
               Scanner sc=new Scanner(System.in);
           System.out.println("Enter PatientID to delete");
           String patientid=sc.nextLine();
           String verify=null;
           for(String k:h.keySet())
               {
                 if(patientid.equals(k))
                 {
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
           h.remove(patientid);
        else 
            System.out.println("not found any Data");
       }
    }
  