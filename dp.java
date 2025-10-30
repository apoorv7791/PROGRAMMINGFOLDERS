// Fibonacci series using dynamic programming 
public class dp {
    public int Fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            System.out.print(new dp().Fib(i) + " ");
        }
        System.out.println();
    }
}

// Use of dynamic programming
// Time complexity: O(n)
// Space complexity: O(n)
// Explanation:
// We are using dynamic programming to find the nth Fibonacci number.
// We are using an array to store the Fibonacci numbers.
// We are using a for loop to find the Fibonacci numbers.
// We are using a base case to return the Fibonacci numbers.
// We are using a recursive function to find the Fibonacci numbers.
// We are using a main function to test the Fibonacci function.
// We are using a for loop to print the Fibonacci numbers.
// the technique which is used is called bottm up approach meaning tabulation.
// we are building the solution from the bottom up.