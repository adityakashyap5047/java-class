import java.util.*;

public class ArmstrongNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        int temp = num;
        int numLen = Integer.toString(num).length();
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, numLen);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }
}
