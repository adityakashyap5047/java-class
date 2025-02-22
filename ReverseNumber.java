import java.util.*;

public class ReverseNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        int revNum = 0;
        int sumDigit = 0;

        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            sumDigit += rem;
            revNum = revNum * 10 + rem;
            temp = temp / 10;
        }

        System.out.println("The reverse of "+num+" is: "+revNum);
        System.out.println("The sum of all digits of "+num+" is: "+sumDigit);

        sc.close();
    }
}