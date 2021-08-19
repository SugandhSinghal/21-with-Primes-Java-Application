/**
 * The Player class specifies the attributes and behaviours of a player
 * 
 * @author (Sugandh Singhal)
 * @version (14-09-2019)
 */
public class Player
{
    // Declared class field here.
    private String name;
    private int score;
    private Tile[] tiles;
    private int roundsWon;
    private Tile lastTilePlayed;
    

    /**
     * Default Constructor for objects of class Player
     */
    public Player()
    {
        // initialise instance variables
        name = "";
        score = 0;
        tiles = new Tile[]{new Tile(5, 1), new Tile(4, 2), new Tile(3, 3), new Tile(2, 5), new Tile(1, 7)};
        roundsWon = 0;
        lastTilePlayed = new Tile();
        
        
    }
    
    
    /**
     * Non Default Constructor for objects of class Player
     * 
     * @param newName String to define the name of the player
     * @param newScore integer to define the score of the player
     * @param newTiles array of tile objects which are used to play the game
     * @param newRoundsWon integer to define the rounds won by the player
     * @param newLastTilePlayed tile object representing the last tile which was played by the player
     */
    public Player(String newName, int newScore, Tile[] newTiles, int newRoundsWon, Tile newLastTilePlayed)
    {
        // initialise instance variables
        name = newName;
        score = newScore;
        tiles = newTiles;
        roundsWon = newRoundsWon;
        lastTilePlayed = newLastTilePlayed;
        
        
    }

    
    
    /**
     * Accessor Method to get the name of the player
     * 
     * @return A String which contains the name of the player 
     */ 
    public String getName()
    {
        
        return name;
        
    }
    
    
    
    /**
     * Accessor Method to get the score of the player
     * 
     * @return A integer which contains the score of the player
     */ 
    public int getScore()
    {
        
        return score;
        
    }
    
    
    
    /**
     * Accessor Method to get the tiles used to play the game 
     * 
     * @return A array of tile objects which are used to play the game
     */ 
    public Tile[] getTiles()
    {
        
        return tiles;
        
    }
    
    
    
    /**
     * Accessor Method to get the rounds won by the player 
     * 
     * @return A integer which contains the rounds won by the player 
     */ 
    public int getRoundsWon()
    {
        
        return roundsWon;
        
    }
    
    
    
    /**
     * Accessor Method to get the last tile which was played by the player
     * 
     * @return the last tile which was played by the player 
     */
    public Tile getLastTilePlayed()
    {
        
        return lastTilePlayed;
        
    }
    

    /**
     * Mutator Method to set the name of the player
     * 
     * @param newName String to define the name of the player
     */
    public void setName(String newName)
    {
        
        name = newName;
        
    }  
    
    
    /**
     * Mutator Method to set the score of the player
     * 
     * @param newScore String to define the score of the player
     */
     public void setScore(int newScore)
    {
        
        score = newScore;
        
    } 
    
    
    /**
     * Mutator Method to set the tiles used to play the game
     * 
     * @param newTiles array of tile objects which are used to play the game
     */
     public void setTiles(Tile[] newTiles)
    {
        
        tiles = newTiles;
        
    } 
    
    
    /**
     * Mutator Method to set the rounds won by player
     * 
     * @param newRoundsWon integer to define the rounds won by the player
     */
     public void setRoundsWon(int newRoundWon)
    {
        
        roundsWon = newRoundWon;
        
    } 
    
    
    /**
     * Mutator Method to set the last tile played by player
     * 
     * @param newLastTilePlayed tile object representing the last tile which was played by the player
     */
        public void setLastTilePlayed(Tile newLastTilePlayed)
    { 
           
        lastTilePlayed = newLastTilePlayed;

    }
    

   
}
