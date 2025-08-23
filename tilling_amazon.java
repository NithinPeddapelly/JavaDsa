public class tilling_amazon {
    
    public static int tillingProblem(int n){  // 2 * n (floor size)
        
        //base case
        if (n ==0 || n ==1){
            return 1;
        }
        //vertical choice
         int fnm1 = tillingProblem(n-1);

        //horizontal choice
         int fnm2 = tillingProblem(n-2);

         int totalWays = fnm1 + fnm2;
         return totalWays;
    }

    public static void main(String args[]){
        int n = 4;
        System.out.println(tillingProblem(n));

    }

}
