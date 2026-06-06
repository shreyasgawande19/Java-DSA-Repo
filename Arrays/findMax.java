
public class findMax {

    public static void main(String[] args) {
        int Array[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int ans = search(Array);
        System.out.println((ans));
    }

    static int search(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                if (arr[r][c] > max) {
                    max = arr[r][c];
                }
            }
        }
        return max;
    }
}
