package src;

import java.util.List;

public class StandardDeviationCalculator {

    private double getMean(List<Integer> listOfNumbers) {

        double mean = 0;
        int numberLength = listOfNumbers.size();

        for (int number : listOfNumbers)
            mean += number;

        return (mean / numberLength);

    }

}
