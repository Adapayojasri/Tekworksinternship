/*create a class tax having parameter GST, import this property in to state class having its own property stateGst and find total tax need pay for nation and state*/
  import java.util.*;
class tax
  {
    double gst;
    double amount;
    tax(double gst,double amount)
    {
      this.gst=gst;
      this.amount=amount;
    }
    void getdetails()
    {
      System.out.println(gst+" "+amount);
    }
  }
class state extends tax
  {
    double stategst;
    state(double amount,double stategst)
    {
      this.amount=amount;
      this.stategst=stategst;
    }
    void getdetails()
    {
      System.out.println(stategst);
    }
    void calculatetax()
    {
      double totalnationtax;
      double totalstatetax;
      totalnationtax=amount+(amount*13/100);
      totalstatetax=amount+(amount*20/100);
      System.out.println("total tax"+totalnationtax);
       System.out.println("total tax"+totalstatetax);
      
      
    }
    
  }
class maintax
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the amount of gst and stategst");
      double amount=s.nextDouble();
      double gst=s.nextDouble();
      double sgst=s.nextDouble();
      tax t=new tax(gst,amount);
      state st=new state(am,gst,gst);
      t.getdetails();
      st.getdetails();
      st.calculatetax();
    }
  }