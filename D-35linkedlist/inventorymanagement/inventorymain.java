import java.util.*;
class inventorymain
  {
    public static void main(String[] args)
    {
      char ch;
      int option;
      Scanner s=new Scanner(System.in);
      inventoryimp t=new inventoryimp();
  System.out.println("1.add any task");
  System.out.println("2.edit any task");
  System.out.println("3.delete any task");                     
      do{
        System.out.println("enter your choice");
        option=s.nextInt();
        switch(option)
          {
            case 1:t.add_products();
              break;
            case 2:t.edit_products();
              break;
            case 3:t.delete_products();
              break;
           case 4:t.delete_products();
              break;
            default: 
              System.out.println("invalid option");
          }
        System.out.println("do you want to continue one more operation");
        ch=s.next().charAt(0);
      }
        while(ch!='n');
           }
      }
    