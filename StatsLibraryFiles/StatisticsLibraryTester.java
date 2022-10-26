import java.util.*;
/**
 * StatisticsLibraryTester is the main method class for StatisticsLibrary to find different calculations and probabilities.
 *
 * Author: Matthew Roesch
 * Version: 1.0
 * Date: 10/21/22
 */
public class StatisticsLibraryTester
{
    public static void main (String[] args)
    {
        StatisticsExamples examples = new StatisticsExamples();
        System.out.println ("Examples of Set Opertaions: ");
        System.out.println (examples.getSetOperationExample());
        System.out.println ("Examples of Central Tendency and Variation: ");
        System.out.println (examples.getCentralTendencyAndVariationExample());
        System.out.println ("Examples of Factorials and Combination/Permutations: ");
        System.out.println (examples.getFactAndCombAndPermExample());
        System.out.println ("Examples of Probability Distributions: ");
        System.out.println (examples.getProbabilityDistributionExample());
        System.out.println ("Examples of Binomial Distribtuions: ");
        System.out.println (examples.getBinomialDistributionExample());
        System.out.println ("Examples of Geometric Distributions: ");
        System.out.println (examples.getGeometricDistributionExample());
        System.out.println ("Examples of Hyper Geometric Distributions: ");
        System.out.println (examples.getHyperGeometricDistributionExample());
        System.out.println ("Examples of Poisson Distributions: ");
        System.out.println (examples.getPoissonDistributionExample());
        System.out.println ("Examples of Chebysheff Theorems: ");
        System.out.println (examples.getChebysheffExample());
        
    }
}
