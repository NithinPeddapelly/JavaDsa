public class tilling_Amazon2 {
    public static int tillingProblem(int n){
        if (n == 0 || n == 1|| n == 2 || n == 3){
            return 1;
        }
        if (n == 4 ){
            return 2;
        }

        //vertical choice
         int fnm1 = tillingProblem(n-1);

         //horizontal choice
         int fnm4 = tillingProblem(n-4);

         int totalWays = fnm1 + fnm4;
         return totalWays;
    }
    public static void main(String args[]){
        int n = 8;
        System.out.println(tillingProblem(n));
    }
}
