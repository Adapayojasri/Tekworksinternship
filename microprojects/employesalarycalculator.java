import java.util.*;
class employesalarycalculator
  {
    public static void main(String args[])
    {
      int salary,tax;
      Scanner s = new Scanner(System.in);
      System.out.println("enter employee id");
      int amount=s.nextInt();
      System.out.println("enter employee name");
       char name=s.next().charAt(0);
        salary=20000;
            System.out.println("Enter the employee salary:");
      salary =s.nextInt();
      int annualsalary=salary*12;
      if(annualsalary>=300000 && annualsalary<=400000)
      {
        tax=annualsalary*10/100;
      }
      else if(annualsalary>=400000 && annualsalary<=500000)
      {
       tax=annualsalary*20/100;
      }
      else{
         tax=annualsalary*40/100;
      }
  System.out.println("Employee Annual Salary is:"+annualsalary);
  System.out.println("Employee Tax is:"+tax);
  int netsalary=annualsalary-tax;
  System.out.println("Employee Net salary is:"+netsalary);
    }
  }