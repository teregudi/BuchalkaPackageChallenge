package hu.teregudi.package_challenge;

// @author Telegdi Tamás
public class Series {
    
    /**
     * @param n An integer.
     * @return Returns the sum of all numbers from 0 to n.
     */
    public static long nSum(int n){
        long result = 0;
        for (int i=0; i<=n; i++){
            result += i;
        }
        return result;
    }
    
    /**
     * @param n An integer.
     * @return Returns the product of all numbers from 0 to n.
     */
    public static long factorial(int n){
        if (n == 0) return 1;
        long result = 1;
        for (int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }
    
    /**
     * @param n The position of the Fibonacci number you are looking for.
     * @return Returns the nth Fibonacci number.
     */
    public static long fibonacci(int n){
        if (n < 2) return (long)n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}