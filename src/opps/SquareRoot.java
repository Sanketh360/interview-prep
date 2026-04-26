package opps;

public class SquareRoot {
    public static int sqrt(int n) {
        if (n == 0 || n == 1) {
            return n; // sqrt(0)=0, sqrt(1)=1
        }

        int start = 1, end = n, ans = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            long sq=(long)mid*mid;

            if (sq == n) {
                return mid; // Perfect square
            }

            if (sq < n) {
                start = mid + 1;
                ans = mid;  // Store floor of sqrt(n)
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 2147395599;
        System.out.println("Square root of " + n + " is " + sqrt(n));
    }
}

