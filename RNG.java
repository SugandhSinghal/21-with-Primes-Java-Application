/**
 * An object of the RNG class generates a random number from a minimum value to a maximum
 * value.
 * 
 * @author (Sugandh Singhal)
 * @version (14-09-2019)
 */
public class RNG
{
    
    private int maximumValue;
    private int minimumValue;

    
    /**
     * Default Constructor for objects of class RNG
     */
    public RNG()
    {
        
        maximumValue = 0;
        minimumValue = 0;
       
    }
  
     
    /**
     * Non Default Constructor for objects of class RNG
     * 
     * @param newMax integer to define the new maximum value for the random number
     * @param newMin integer to define the new minimum value for the random number
     */
    public RNG(int newMax, int newMin)
    {
        
        maximumValue = newMax;
        minimumValue = newMin;
       
    }

    
    /**
     * Method to display value of fields
     * 
     * @return A single string which contains the maximum and minimum value for random number seperated by spaces
     */
    public String displayRNG()
    {
        
        return maximumValue + " " + minimumValue;
        
    }
    
    
    /**
     * Accessor Method to get the maximum value for random number generation
     * 
     * @return A integer which contains the maximum value 
     */ 
    public int getMaximumValue()
    {
        
        return maximumValue;
        
    }
    
    
    /**
     * Accessor Method to get the minimum value for random number generation
     * 
     * @return A integer which contains the minimum value 
     */
    public int getMinimumValue()
    {
        
        return minimumValue;
        
    }
    
    
    /**
     * Mutator Method to set the maximum value for random number generation
     * 
     * @param newMaximumValue integer to define the the maximum value
     */
    public void setMaximumValue(int newMaximumValue)
    {
        
         maximumValue = newMaximumValue;
         
    }
    
    
    /**
     * Mutator Method to set the minimum value for random number generation
     * 
     * @param newMinimumValue integer to define the the minimum value 
     */
    public void setMinimumValue(int newMinimumValue)
    {
        
        minimumValue = newMinimumValue;
        
    }
    
 

}
