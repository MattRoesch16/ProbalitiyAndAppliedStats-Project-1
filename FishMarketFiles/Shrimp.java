import java.util.*;
/**
 * Shrimp creates a Seafood object that is a shrimp
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class Shrimp extends Seafood
{
    Random rnd = new Random();
    public Shrimp(int placement)
    {
        super(placement, 1.5, "Shrimp");
    }
}