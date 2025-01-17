public class SwapNumbers {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        //swapping 
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping the value of a = "+b);
        System.out.println("After Swapping the value of b = "+a);
    }
}
