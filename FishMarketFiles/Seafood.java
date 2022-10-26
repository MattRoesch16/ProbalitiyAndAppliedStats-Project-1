import java.util.*;
/**
 * Seafood creates objects that have a type, price, and weight.
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class Seafood
{
    private double weight;
    private double priceperlb;
    private String foodType;
    private int index;
    Random rnd = new Random();
    public Seafood(int placement, double price, String type)
    {
        // initialise instance variables
        double heaft = 0;
        heaft = heaft + rnd.nextInt(7) + rnd.nextDouble();
        weight = heaft;
        priceperlb = price;
        foodType = type;
        index = placement;
    }
    
    public String getWeight()
    {
        String result = "" + weight;
        return result;
    }
    
    public String getPrice()
    {
        String result = "" + priceperlb;
        return result;
    }
    
    public String getType()
    {
        return foodType;
    }
    
    public String toString()
    {
        String result = "" + index + "," + foodType + "," + weight + "," + priceperlb;
        return result;
    }
}
