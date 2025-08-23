public class power {
    public static int optimizedPower(int x , int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2) * optimizedPower(x, n/2);

        if (n % 2 != 0){
            halfPower = x * halfPower;
        }
        return halfPower;
    }
}
 public static void main(String args[]) {
     int x = 2;
     int n = 5;
     System.out.println(power.optimizedPower(x, n));
 }