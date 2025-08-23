public class tilling_amazon {
    
    public static int tillingProblem(int n){  // 2 * n (floor size)
        
        //vertical choice
         int fnm1 = tillingProblem(n-1);

        //horizontal choice
         int fnm2 = tillingProblem(n-2);

         int totalWays = fnm1 + fnm2;
         return totalWays;
    }

    public static void main(String args[]){

    }

}
