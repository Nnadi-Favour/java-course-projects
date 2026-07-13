import java.util.ArrayList;

public class Unit4{

    // Method to calculate the average stock price
    public static float calculateAveragePrice(float[] prices) {
        float sum = 0;

        for (float price : prices) {
            sum += price;
        }

        return sum / prices.length;
    }

    // Method to find the maximum stock price
    public static float findMaximumPrice(float[] prices) {
        float max = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }

        return max;
    }

    // Method to count occurrences of a target price
    public static int countOccurrences(float[] prices, float targetPrice) {
        int count = 0;

        for (float price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }

        return count;
    }

    // Method to compute cumulative sum using ArrayList
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> prices) {

        ArrayList<Float> cumulative = new ArrayList<>();

        float sum = 0;

        for (float price : prices) {
            sum += price;
            cumulative.add(sum);
        }

        return cumulative;
    }

    public static void main(String[] args) {

        // Array of stock prices
        float[] stockArray = {
                150.5f, 152.3f, 149.8f, 155.0f, 151.2f,
                153.7f, 155.0f, 150.5f, 154.4f, 156.1f
        };

        // ArrayList of stock prices
        ArrayList<Float> stockList = new ArrayList<>();

        for (float price : stockArray) {
            stockList.add(price);
        }

        System.out.println("Stock Prices:");

        for (float price : stockArray) {
            System.out.print(price + " ");
        }

        System.out.println("\n");

        System.out.println("Average Stock Price: "
                + calculateAveragePrice(stockArray));

        System.out.println("Maximum Stock Price: "
                + findMaximumPrice(stockArray));

        float target = 150.5f;

        System.out.println("Occurrences of " + target + ": "
                + countOccurrences(stockArray, target));

        System.out.println("Cumulative Sum:");

        ArrayList<Float> cumulative = computeCumulativeSum(stockList);

        for (float value : cumulative) {
            System.out.println(value);
        }
    }
}