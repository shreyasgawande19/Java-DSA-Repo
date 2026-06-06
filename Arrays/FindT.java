
import java.util.Arrays;

class FindT {

    public static void main(String[] args) {
        int Array[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 8;
        int[] ans = search(Array, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int arr[][], int target) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                if (arr[r][c] == target) {
                    return new int[]{r, c};
                }
            }
        }
        return new int[]{0, 0};
    }
}
