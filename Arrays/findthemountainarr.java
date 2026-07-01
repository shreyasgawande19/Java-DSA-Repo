
class findthemountainarr {

    static int findPeakElement(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                high = mid;
            }
        }
        return -1;
    }

    static int findinAsc(int arr[], int start, int peak, int target) {
        while (start <= peak) {
            int mid = start + (peak - start) / 2;

            if (target < arr[mid]) {
                peak = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findinDes(int arr[], int start, int peak, int target) {
        int low = peak + 1;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target < arr[mid]) {
                low = mid + 1;
            } else if (target > arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String Args[]) {

    }
}
