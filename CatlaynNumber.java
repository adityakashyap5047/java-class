public class CatlaynNumber {
    public static void main(String[] args) {
        int n = 5; // Example input
        long catlaynNumber = calculateCatlaynNumber(n);
        System.out.println("Catlayn number for n = " + n + " is: " + catlaynNumber);
    }

    public static long calculateCatlaynNumber(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long catlaynNumber = 0;
        for (int i = 0; i < n; i++) {
            catlaynNumber += calculateCatlaynNumber(i) * calculateCatlaynNumber(n - 1 - i);
        }
        return catlaynNumber;
    }
}
