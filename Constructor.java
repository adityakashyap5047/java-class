import java.util.Scanner;

public class Constructor {
    
    public Constructor() {
        System.out.println("Default constructor called");
    }

    public Constructor(int value) {
        System.out.println("Integer constructor called with value: " + value);
    }

    public Constructor(String message) {
        System.out.println("String constructor called with message: " + message);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 1 to 3: ");
        int n = sc.nextInt();
        if (n == 1) {
            new Constructor();
        } else if (n == 2) {
            new Constructor(10);
        } else if (n == 3) {
            new Constructor("Hello");
        }

        sc.close();
    }
}