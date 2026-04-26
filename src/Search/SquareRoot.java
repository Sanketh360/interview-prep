package Search;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 27;
        double ans = sqrt(num);
        System.out.printf( "%.2f",ans);
    }

    public static double sqrt(int num) {
        if (num == 0 || num == 1) {
            return num;
        }

        int s = 1, e = num, ans = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // To prevent overflow use long
            long square = (long) mid * mid;

            if (square == num) {
                return mid; // exact root
            }
            if (square < num) {
                ans = mid;    // store possible answer
                s = mid + 1;  // move right
            } else {
                e = mid - 1;  // move left
            }
        }
        
        double result = ans;
        double increment = 0.1;
        for (int i = 0; i < 2; i++) { 
            while (result * result <= num) {
                result += increment;
            }
            result -= increment; 
            increment /= 10; // move to next decimal place
        }
        return result;
    }
}
