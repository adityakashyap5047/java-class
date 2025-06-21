public class ArrayReversal{

    public static void reverse(int numbers[]){
        int n = numbers.length;

        int temp;
        for(int i = 0; i <= n/2; i++){
            temp = numbers[i];
            numbers[i] = numbers[n - i -1];
            numbers[n - i -1] = temp;
        }
    }

    public  static void printArr(int numbers[]){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};

        System.out.print("The Array is: ");
        printArr(numbers);
        reverse(numbers);
        System.out.print("The Reverse of Array is: ");
        printArr(numbers);
        
    }
}