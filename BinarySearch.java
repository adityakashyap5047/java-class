public class BinarySearch {

    public static void binarySearch(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 9, 0, 2, 6};

        binarySearch(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
