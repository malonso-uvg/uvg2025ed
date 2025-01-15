package edu.uvg.example.model;

/**
 * Interface defining basic calculator operations.
 */
public interface ICalculator {

    /**
     * This method gets the sum of two numbers.
     * Example: num1 = 4, num2 = 2, then return 6.
     *
     * @param num1 The first integer number.
     * @param num2 The second integer number.
     * @return The sum of num1 and num2.
     */
    public int add(int num1, int num2);

    /**
     * This method gets the difference between two numbers.
     * Example: num1 = 4, num2 = 2, then return 2.
     *
     * @param num1 The first integer number.
     * @param num2 The second integer number.
     * @return The difference of num1 and num2.
     */
    public int subs(int num1, int num2);

    /**
     * This method multiplies two numbers.
     * Example: num1 = 4, num2 = 2, then return 8.
     *
     * @param num1 The first integer number.
     * @param num2 The second integer number.
     * @return The product of num1 and num2.
     */
    public int mult(int num1, int num2);

    /**
     * This method divides the first number by the second number.
     * Example: num1 = 4, num2 = 2, then return 2.
     * Note: Ensure num2 is not zero to avoid division by zero errors.
     *
     * @param num1 The numerator (integer).
     * @param num2 The denominator (integer).
     * @return The quotient of num1 and num2.
     */
    public int div(int num1, int num2);

    /**
     * This method calculates the remainder of the division between two numbers.
     * Example: num1 = 5, num2 = 2, then return 1.
     *
     * @param num1 The dividend (integer).
     * @param num2 The divisor (integer).
     * @return The remainder when num1 is divided by num2.
     */
    public int mod(int num1, int num2);
}
