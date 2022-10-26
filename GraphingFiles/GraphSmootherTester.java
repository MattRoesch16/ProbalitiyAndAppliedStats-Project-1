import java.util.*;
import java.io.*;
import java.lang.Math;
/**
 * GraphSmootherTester tests GraphSmoother on the SalterOutput.csv
 *
 * Author: Matthew Roesch
 * Version: 1.0
 * Date: 10/24/22
 */
public class GraphSmootherTester
{
    public static void main (String[] args)
    {
        GraphSmoother butter = new GraphSmoother();
        butter.SmoothData("SalterOutput.csv");
    }
}
