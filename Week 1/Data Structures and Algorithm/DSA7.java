//Exercise 7
/*Recursion is a technique where a method calls itself to solve a problem by breaking it into smaller subproblems.
A recursive solution consists of:
Base Case: Stops the recursion.
Recursive Case: Calls itself with a smaller input.
Recursion simplifies problems such as factorial calculation, tree traversal, Fibonacci series, and financial forecasting.*/
public class DSA7 {
    static double predictFutureValue(double currentValue,
                                     double growthRate,
                                     int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictFutureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1);
    }
    public static void main(String[] args) {
        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;
        double futureValue = predictFutureValue(
                currentValue,
                growthRate,
                years);

        System.out.println("Future Value: " + futureValue);
    }
}