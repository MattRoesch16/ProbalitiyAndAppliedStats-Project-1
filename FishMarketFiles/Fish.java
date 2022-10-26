import java.util.*;
/**
 * Fish creates a Seafood object that is a fish
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class Fish extends Seafood
{
    Random rnd = new Random();
    public Fish(int placement)
    {
        super(placement, 3.5, "Fish");
    }
}
