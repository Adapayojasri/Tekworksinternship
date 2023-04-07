import java.util.*;
class rbi 
{
  public void display(String s1) 
  {
    if (s1 == "Savings")
      {
      System.out.println("valid account");
      }
    else 
      {
      System.out.println("invalid account");
       }

  }
  public void interest(int minimuminterest, long balanceallow)
  {

    if (balanceallow > 20000)
    {
      double total = balanceallow + minimuminterest;
    } 
    else
    {
      System.out.println("no interest");
    }
  }

  public void withdraw(long withdrawllimit) {
    if (withdrawllimit <= 50000) {
      System.out.println("proceed");
    } else {
      System.out.println("please enter valid cash");
    }
  }
}

class customer extends rbi {
  public void show() {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the customer name:");
    String name = s.next();
    System.out.println("enter the customer number:");
    long accnum = s.nextLong();
  }

}

class Account extends rbi
  {
  String account;
  public void account() {
    Scanner s = new Scanner(System.in);
    account = s.next();
  }

  public void acctype() {
    if (account == "Savings") {
      double intersest = 0.04;
    }
  }
}

class SBI extends rbi {
  public void display(String s1) {
    if (s1 == "Savings") {
      System.out.println("valid account");
    } else {
      System.out.println("invalid account");
    }
  }

  public void interest(int minimuminterest, long balanceallow) {

    if (balanceallow > 20000) {
      double total = balanceallow + minimuminterest;
    } else {
      System.out.println("no interest");
    }

  }

  public void withdraw(long withdrawllimit) {
    if (withdrawllimit <= 50000) {
      System.out.println("proceed");
    } else {
      System.out.println("please enter valid cash");
    }
  }
}

class ICICI extends rbi {
  public void display(String s1) {
    if (s1 == "Savings") {
      System.out.println("valid account");
    } else {
      System.out.println("invalid account");
    }
  }

  public void interest(int minimuminterest, long balanceallow) {

    if (balanceallow > 20000) {
      double total = balanceallow + minimuminterest;
    } else {
      System.out.println("no interest");
    }

  }

  public void withdraw(long withdrawllimit) {
    if (withdrawllimit <= 50000) {
      System.out.println("proceed");
    } else {
      System.out.println("please enter valid cash");
    }
  }
}

class PNB extends rbi {
  public void display(String s1) {
    if (s1 == "Savings") {
      System.out.println("valid account");
    } else {
      System.out.println("invalid account");
    }
  }

  public void interest(int minimuminterest, long balanceallow) {

    if (balance_allow > 20000) {
      double total = balanceallow + minimuminterest;
    } else {
      System.out.println("no interest");
    }

  }

  public void withdraw(long withdrawllimit) {
    if (withdrawllimit <= 50000) {
      System.out.println("proceed");
    } else {
      System.out.println("please enter valid cash");
    }
  }
}

class MainBank {
  public static void main(String[] args) {
    RBI rb = new RBI();
    customer c = new customer();
    Scanner s = new Scanner(System.in);
    System.out.println("enter the bank type:");
    String s1 = new String(s.next());
    System.out.println("enter the minimum interest of RBI");
    int minimum_interest = s.nextInt();
    System.out.println("enter the minimum balance allowed of RBI");
    long balance_allow = s.nextLong();
    System.out.println("enter minimumwithdrawl limit:");
    long withdrawl_limit = s.nextLong();

    rb.display(s1);
    rb.withdraw(withdrawllimit);
    rb.interest(minimuminterest, balanceallow);
    c.show();

  }
}