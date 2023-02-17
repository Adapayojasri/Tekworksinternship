import java.util.*;
class trafficlights
{
  public static void main(String args[]) 
  {
    System.out.println("trafficlights");
    System.out.println("Time of day is  equal to60 seconds");
    System.out.println("Enter the time:");
    Scanner s = new Scanner(System.in);
    int time = s.nextInt();

    if (time >= 1 && time <= 20) {
      System.out.println("Green");

      System.out.println("Go");
    } else if (time >= 20 && time <= 40) {
      System.out.println("Red");
      System.out.println("Stop");
    } else if (time >= 40 && time <= 60) {
      System.out.println("orange");
      System.out.println("ready");
    } else {
      System.out.println("enter valid time");
    }
  }
}