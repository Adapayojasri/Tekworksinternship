import java.util.*;
class rockpapersciccor
  {
    public static void main(String args[])
    {
      int userChoice,computerChoice,rock, paper, scissors;
      Scanner s = new Scanner (System.in);
      Random rnd = new Random();  
      rock = 0;
      paper = 1;
      scissors = 2;
     System.out.println("Rock paper sciccors game");
      System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
       userChoice = s.nextInt();
  if (userChoice == 0)
       {
         System.out.println("User chose ROCK");
       }
      else if(userChoice== 1)
        {
          System.out.println("User chose PAPER");
        }
        else
        {
          System.out.println("User chose SCISSORS");
        }
      
System.out.println("Enter computer choice (0=rock, 1=paper, 2=scissors)");
       computerChoice = rnd.nextInt(2);
if (computerChoice == 0)
       {
         System.out.println("computer chose ROCK");
       }
       if(computerChoice== 1)
        {
          System.out.println("computer chose PAPER");
        }
       if(computerChoice==2)
        {
        System.out.println("computerchose SCISSORS");
        }
        if (userChoice == computerChoice)
          {
            System.out.println("game was tie");
          }
     if (computerChoice==rock && userChoice==paper){
        System.out.println("User won the game");
     }
       if (computerChoice==paper && userChoice==rock){
        System.out.println("Computer won the game");
       }
      if(computerChoice==scissors && userChoice==rock){
        
          System.out.println("user won the game");
      }
  if(computerChoice==rock && userChoice==scissors){
        System.out.println("computer won the game");
  }
  if(computerChoice==scissors&&userChoice==paper){
    System.out.println("user won the game");
  }
  if (computerChoice==paper&&userChoice==scissors){
           System.out.println("user won the game");
  }
  }
      
    
  }
