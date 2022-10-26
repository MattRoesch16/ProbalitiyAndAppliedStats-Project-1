import java.util.*;
/**
 * Scallop creates a Seafood object that is a scallop
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class Scallop extends Seafood
{
    Random rnd = new Random();
    public Scallop(int placement)
    {
        super(placement, 2.0, "Scallop");
    }
}