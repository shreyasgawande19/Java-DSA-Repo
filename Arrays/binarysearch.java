
public class binarysearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 10, 11};
        int target = 9;
        int ans = bsearch(array, target);
        System.out.println(ans);
    }

    static int bsearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
