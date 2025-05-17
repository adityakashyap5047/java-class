import java.util.Scanner;

public class Swap {

    public static void swap(int a, int b) {
       a = a + b;
       b = a - b;
       a = a - b;

        System.out.println("After Swapping the value of a = " + b);
        System.out.println("After Swapping the value of b = " + a);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = sc.nextInt();

        sc.close();
        System.out.println("Before Swapping the value of a = " + a);
        System.out.println("Before Swapping the value of b = " + b);
        swap(a, b);
        System.out.println("After Swapping the value of a = " + b);
        System.out.println("After Swapping the value of b = " + a);
    }
}
