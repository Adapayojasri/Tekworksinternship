import java.util.*;
class AarogyaHospitalMain
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            char ch;
           int choice; 
            AarogyaHospitalImp obj=new AarogyaHospitalImp();
            System.out.println("1.Add patient");
            System.out.println("2.View Patient");
            System.out.println("3.Search by patient id");
            System.out.println("4.Search by patient age");
            System.out.println("5.Search by patient city");
            System.out.println("6.Delete the patient details");

            do{
                System.out.println("Enter your choice");
                choice=sc.nextInt();
                switch(choice)
                    {
                        case 1:obj.addpatient();
                            break;
                        case 2:obj.viewpatient();
                            break;
                       case 3:obj.searchbyid();
                            break;
                        case 4:obj.searchbyage();
                            break;
                        case 5:obj.searchbycity();
                            break;
                         case 6:obj.deletepatient();
                            break;
                        default :System.out.println("Invalid Option");
                            break;
                    }
                System.out.println("Do tou want to continue one more Operation(y/n)");
                ch=sc.next().charAt(0);
            }while(ch!='n');
        }
    }