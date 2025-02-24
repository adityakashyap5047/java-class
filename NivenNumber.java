import java.util.Scanner;

public class NivenNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sumOfDigits = 0;
        int temp = num;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (num % sumOfDigits == 0) {
            System.out.println(num + " is a Niven number.");
        } else {
            System.out.println(num + " is not a Niven number.");
        }

        sc.close();
    }
}