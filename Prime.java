import java.util.*;

public class Prime {

    public static boolean isPrimeNum(int num){

        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2; i <= Math.pow(num, 0.5); i ++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
                
        }

        if (isPrime){
            System.out.println(num+" is a prime number");
        } else {
            System.out.println(num+" is not a prime number");
        }

        if (isPrimeNum(num)){
            System.out.println(num+" is a prime number");
        } else {
            System.out.println(num+" is not a prime number");
        }
        
        sc.close();
    }
}
