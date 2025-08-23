public class poweroptimised {
    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        int halfPowersq = halfPower * halfPower ;

        if (n % 2 != 0) {
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;
    }

    public static void main(String args[]) {
        int x = 2;
        int n = 5;
        System.out.println(optimizedPower(x, n));
    }
}
