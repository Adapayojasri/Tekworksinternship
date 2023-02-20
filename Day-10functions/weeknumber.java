import java.util.*;
class weeknumber
  {
    public static void alpha(int n1)
    {
      switch(n1)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
             case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }
      public static void main(String args[])
        {
        Scanner s=new Scanner(System.in); 
        int n1=s.nextInt();
        weeknumber y=new weeknumber();
        y.alpha(n1); 
      }
  }