
class findpeakelement {

    public static void main(String args[]) {
        

    static int find(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            }
        }
        return -1;
    }
}
