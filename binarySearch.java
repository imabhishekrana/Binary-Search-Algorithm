package binarySearch;

public class binarySearch {
    public static void main(String[] args) {

        int arr[] = { 4, 6, 8, 9, 21, 45, 68 };
        int target = 41;
        int ans = search(arr, target);
        System.out.println("Index for the target is : " + ans);
    }

    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid = 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }

}
