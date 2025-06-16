import java.util.Scanner;

public class PrintPrime {

    public static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void printPrime(int num){
        for(int i = 2; i <= num; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("The prime numbers up to " + num + " are: ");
        printPrime(num);
        sc.close();
    }
}
