import java.util.*;
/**
 * Crab creates a Seafood object that is a Crab
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class Crab extends Seafood
{
    Random rnd = new Random();
    public Crab(int placement)
    {
        super(placement, 4.5, "Crab");
    }
}