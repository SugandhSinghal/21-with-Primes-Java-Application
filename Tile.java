
/**
 * The tile class stores each individual tile which can be used by the player to play the game
 * 
 * @author (Sugandh Singhal)
 * @version (14-09-2019)
 */
public class Tile
{
    
    private int score;
    private int value;

    
    /**
     * Default Constructor for objects of class Tile
     */
    public Tile()
    {
        
        score = 0;
        value = 0;
    
    }
    
    
    
    /**
     * Non Default Constructor for objects of class RNG
     * 
     * @param newScore int to define the score of the Tile
     * @param newValue int to define the value of the Tile
     */
    public Tile(int newScore, int newValue)
    {
        
        score = newScore;
        value = newValue;
        
    }
    
    
    
    /**
     * Method to display value of fields
     * 
     * @return A single string which contains the value and the score of tile
     */
    public String displayTile()
    {
        
        return value +" " + score;
    
    }

    
  
    /**
     * Accessor Method to get the score of the tile
     * 
     * @return A integer which contains the score of the tile 
     */ 
    public int getScore()
    {
        
        return score;
        
    }
    
    
    
    /**
     * Accessor Method to get the value of the tile
     * 
     * @return A integer which contains the value of the tile 
     */
    public int getValue()
    {
        
        return value;
        
    }
    
    
    
    /**
     * Mutator Method to set the score of the tile
     * 
     * @param newTileScore integer to define the score of the tile
     */
    public void setScore(int newTileScore)
    {
        
        score = newTileScore;
        
    }
    
    
    /**
     * Mutator Method to set the value of the tile
     * 
     * @param newTileValue integer to define the value of the tile
     */
    
    public void setValue(int newTileValue)
    {
        
        value = newTileValue;
        
    }
   
    
    
}
