
/**
 * SaltTester test the Salter class
 *
 * Author: Matthew Roesch
 * Version: 1.0
 * Date: 10/24/22
 */
public class SalterTester
{
    public static void main (String[] args)
    {
        Salter salt = new Salter ();
        salt.SaltData("SalterInput.csv", 10, 10);
    }
}
