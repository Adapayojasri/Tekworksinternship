import java.util.*;
class student
  {
     String name;
     int age;
     String address;
    public student()
    {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }
    public void setInfo(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    public void setInfo(String name, int age, String address) 
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void showInfo()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Address: " + address);
    }
}
public static void main(String[] args)
  {
    student stu1 = new student();
    stu1.setInfo("abc", 20, "adsdss");
    stu1.showInfo();
    student stu2 = new student();
    stu2.setInfo("hhgjh", 18);
    stu2.showInfo();
}