public class BinarySearch {

    public static int binarySearch(int arr[], int target){

        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = (si + ei)/2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }

        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 3, 9, 12, 34, 23};

        int idx = binarySearch(arr, 12);
        System.out.println(idx);

    }
}
