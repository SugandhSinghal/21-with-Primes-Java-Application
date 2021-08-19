import java.util.*;

/**
 * The Game class manages the playing of a game
 * 
 * @author (Sugandh Singhal)
 * @version (14-09-2019)
 */
public class Game
{
   
    private Player human;
    private Player computer;
    

    /**
     * Default Constructor for objects of class Game
     */
    public Game()
    {
        
        human = new Player();
        computer = new Player();
        
    }

    
    /**
     * starMethod method - This method manages the main game
     *
     *
     */
    public void starMethod()
    {
    
        int n = 0;
        String rName = "";
        human.setRoundsWon(0);
        computer.setRoundsWon(0);
       
        do
        {
            System.out.println("please select from the following options");
            System.out.println("Press 1 to register a player");
            System.out.println("Press 2 to start a new game");
            System.out.println("Press 3 to view a help menu");
            System.out.println("press 4 to exit");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            
            switch(n)
            {
                
                case 1:
                    int validUser = 0;
                    while(validUser == 0)
                    {
                        System.out.println("Enter your name");
                        Scanner sc1 = new Scanner(System.in);
                        rName = sc1.nextLine();
                        human.setName(rName);
                        computer.setName("Computer");
                      
                      
                        if ((2 < rName.length()) && 
                           (rName.length() < 11))
                        {
                            System.out.println("player name is " +rName);
                            System.out.println("player is registered...");
                            validUser = 1;
                        }
                        else
                        {
                            System.out.println("please enter valid name");
                            rName = "";
                            validUser = 0;
                        }
                    }
                    break;
              
                case 2:
                    if(rName.length() > 0)
                    {
                        System.out.println("Please enter the number of rounds..."); 
                        int t = sc.nextInt();
                        if((t > 0) &&
                          (t < 10))
                        {
                            for(int i = 1; i <= t; i++)
                            {
                                System.out.println("Game "+i);
                                if(rngMethod() % 2 == 0)
                                    player(true);
                                else
                                    player(false);
                                
                                if(human.getRoundsWon() > computer.getRoundsWon())
                                    System.out.println("Human won the game by " + human.getRoundsWon());
                                else
                                    System.out.println("Computer won the game by " +computer.getRoundsWon());
                                    
                                Tile[] hTiles = new Tile[]{new Tile(5, 1), new Tile(4, 2), new Tile(3, 3), new Tile(2, 5), new Tile(1, 7)};
                                Tile[] cTiles = new Tile[]{new Tile(5, 1), new Tile(4, 2), new Tile(3, 3), new Tile(2, 5), new Tile(1, 7)};
                                human.setTiles(hTiles);
                                computer.setTiles(cTiles);
            
                            }
                                       
                        }
                        else
                            System.out.println("invalid number of rounds...");
                    
                    }
                    else
                        System.out.println("please register the player first...");
                    break;
              
                case 3:
                    System.out.println("Help");
                    System.out.println("Game Rules");
                    System.out.println("Each player start the game with initial zero score.");
                    System.out.println("After that the players are scored based on the tile they choose.");
                    System.out.println("Game total is the sum of tiles used by player and it should be less than 21 for a game.");
                    System.out.println("Minus 3 points will be deducted if a player doesn't choose tile 5.");
                    System.out.println("Plus 5 points will be added to the winner of the round.");
                    System.out.println("Each round will have a winner and overall game winner will also be declared.");
                    System.out.println();
                    break;
                  
                case 4:
                    System.out.println("Game Exit...");
                    break;
              
                default:
                    System.out.println("enter correct option");

            
          }
          
        }
        while(n != 4);
        
    }
    
    
    /**
     * rngMethod method - This method generates the random value.
     *
     * @return A integer which is random number between maximum and minimum value.
     */
    private int rngMethod()
    {
    
        RNG rng = new RNG(50, 0);
        int x = (int)(Math.random() * ((rng.getMaximumValue() - rng.getMinimumValue()) + 1)) + rng.getMinimumValue();
        return x;
       
    }
    
    
    /**
     * player method - This method plays the games as human and computer.
     *
     * @param playerSwitch boolean is used to switch player between human and computer.
     */
    private void player(boolean playerSwitch)
    {
        human.setScore(0);
        computer.setScore(0);
        int gameTotal = 0;
        int humanTileValue = 0 ;
        int computerTileValue = 0;
        int comprandtile = 0;
        boolean switchPlayer = playerSwitch;
        
        if(switchPlayer)  // will be used for computer logic
          comprandtile = 0;
        else
          comprandtile = 1;
          
        while(gameTotal < 21)
        {
            
            if(switchPlayer)
            {
                System.out.println(human.getName()+" playes the tile ...");
                System.out.print("Selecting from the following tiles = {");
                for(Tile h : human.getTiles()) 
                {
                    if(h.getValue() > 0)
                        System.out.print(h.getValue() + ",");
                }
                System.out.println("}");
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter the tile value you wish to play from the above list");
                humanTileValue = input.nextInt();
                boolean conditionValidity = false;
                while(!conditionValidity)
                {
                    for(Tile t : human.getTiles())
                    {
                        if(t.getValue() == humanTileValue)
                        {
                            System.out.println("player has played tile " + humanTileValue);
                            System.out.println();
                            System.out.println();
                            gameTotal = gameTotal + humanTileValue;
                            System.out.println("Game Total is "+ gameTotal);
                            System.out.println();
                            System.out.println();
                            conditionValidity = true;
                            if(gameTotal <= 21)
                            {
                                int y = t.getScore();
                                System.out.println("Human Player current score is "+ human.getScore());
                                int humanScore = human.getScore() + y;
                                human.setScore(humanScore);
                                System.out.println("Human Player new score is  "+human.getScore());
                                human.setLastTilePlayed(t);
                             
                            }
                            t.setValue(0);
                            break;
                                
                        } 
                    }      
                    if(!conditionValidity) 
                    {
                        System.out.println("Please select correct tile");
                        humanTileValue = input.nextInt();
                    }    
                }
                switchPlayer = false;
            }  
            
            else
            {
                System.out.println(computer.getName()+" playes the tile...");
                System.out.print("Selecting from the following tiles = {");
                int i = 0;
                for(Tile h : computer.getTiles()) 
                {
                    if(h.getValue() > 0)
                    {
                        System.out.print(h.getValue() + ",");
                        if(i == comprandtile)
                            computerTileValue = h.getValue();
                        i++;
                    }
                  
                }
                System.out.println("}");
                
                if (comprandtile == 1 ) 
                    comprandtile = 0;
                else
                    comprandtile = 1;
                    
                System.out.println("computer has played tile " + computerTileValue);
                gameTotal = gameTotal + computerTileValue;
                System.out.println();
                System.out.println();
                System.out.println("Game Total is "+ gameTotal);
                System.out.println();
                System.out.println();
                for(Tile x : computer.getTiles())
                {
                    if(x.getValue() == computerTileValue)
                      {
                          if(gameTotal <= 21)
                          {
                              int y = x.getScore();
                              System.out.println("Computer current score is "+ computer.getScore() );
                              int computerScore = computer.getScore() + y;
                              computer.setScore(computerScore);
                              System.out.println("Computer new score is  "+ computer.getScore());
                              computer.setLastTilePlayed(x);
                        
                          }
                          x.setValue(0);
                          break;
                          
                      }
                    
                }
                switchPlayer = true;
        
            }
        
        }
        System.out.println();
        System.out.println("Calculating final score..."); 
        System.out.println();
       
        for(Tile h:human.getTiles()) 
        {
            if(h.getValue() == 5)
            {
                human.setScore(human.getScore() - 3);
                System.out.println("Human player has not used the tile with value 5: penality applied");
            }   
            
        }
        
        for(Tile c:computer.getTiles()) 
        {
            if(c.getValue() == 5)
            {
                computer.setScore(computer.getScore() - 3);
                System.out.println("Computer player has not used the tile with value 5: penality applied");
            }   
           
        }
        
        if(human.getScore() > computer.getScore()) 
        {
            int h = human.getScore() + 5;
            int r = human.getRoundsWon() + 1;
            human.setScore(h);
            human.setRoundsWon(r);
            System.out.println("Human player final score " + human.getScore());
            System.out.println("Computer player final score " + computer.getScore());
            System.out.println("Winner of the round is  " + human.getName());
         } 
        else 
        {
            int c = computer.getScore() + 5;
            int r = computer.getRoundsWon() + 1;
            computer.setScore(c);
            computer.setRoundsWon(r);
            System.out.println("Human player final score " + human.getScore());
            System.out.println("Computer player final score " + computer.getScore());
            System.out.println("Winner of the round is  " + computer.getName());
        }
       
    }
}
    
 
 
        
  
    
    
    
    

