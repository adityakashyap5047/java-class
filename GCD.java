public class GCD {
    
    public static void main(String[] args) {
        int a = 56, b = 98;
        int gcd = 1;

        // Find GCD using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        gcd = a;

        System.out.println("GCD of the given numbers is: " + gcd);
    }
}
