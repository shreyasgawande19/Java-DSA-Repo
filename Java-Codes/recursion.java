
public class recursion {

    static void f(int n, int i) {
        if (i == 0) {
            return;
        }
        System.out.println(i);
        f(n, i - 1);
    }

    public static void main(String[] args) {
        f(5, 5);
    }
}
