
class sortedinfinitearray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 10, 12, 15, 18, 20};
        int target = 11;
        int ans = ans(array, target);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return bsearch(arr, target, start, end);
    }

    static int bsearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
