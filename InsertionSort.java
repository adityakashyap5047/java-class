public class InsertionSort {

    public static void insertionSort(int numbers[]){

        for (int i = 0; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j+1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int numbers[] = {5, 1, 4, 9, 2, 7};

        insertionSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
