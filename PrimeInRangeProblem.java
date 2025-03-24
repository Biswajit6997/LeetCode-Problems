
import java.util.*;
public class PrimeInRangeProblem {
    static boolean primeInRange(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {  // Optimization: check divisibility only up to sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upperLimit = sc.nextInt(); // Read upper limit
        int sum = 0;

        // Loop from 2 to the upper limit
        for (int i = 2; i <= upperLimit; i++) {
            if (primeInRange(i)) {
                sum += i;
            }
        }

        // Output the sum of primes in the range [2, upperLimit]
        System.out.println(sum);
    }
}
