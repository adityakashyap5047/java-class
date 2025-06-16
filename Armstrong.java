import java.util.Scanner;

public class Armstrong {

    public static boolean armstrong(int num){
        String numStr = Integer.toString(num);
        int numLen = numStr.length();

        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, numLen);
            temp = temp / 10;
        }

        if(sum == num){
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (armstrong(num)) {
            System.out.println("The number "+ num + " is an Armstrong number");
        } else {
            System.out.println("The number "+ num + " is not an Armstrong number");
        }
        sc.close();
    }
}
