public class Till {
     public static int tilling(int n){
        if (n == 0 || n == 1 ||n == 2 ||n == 3 ||n == 4 ||n == 5){
            return 1;
        }
        if ( n == 6){
            return 2;
        }

        //vertical choice
        int fnm1 = tilling(n-1);

        //horizontal choice
        int fnm6 = tilling(n-6);

        int totalways  = fnm1 + fnm6;
        return totalways;

     }

    public static void main (String args[]){
        int n = 12;
        System.out.println(tilling(n));
    }
}
