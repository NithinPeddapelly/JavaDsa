public class recurssion_basics {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");  printDec(n - 1); // head recursion
        
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        printInc(n - 1); System.out.print(" " + n); // tail recursion
        
    }

    public static int fact(int n){ 
        if (n == 0){
            return 1; // base case
        }

        int a = fact(n-1);             // head recursion
        int b = n* fact(n-1);         // tail recursion
        return b;                     // head recursion
         
    }

    public static int calSum(int n){
        if (n == 1){
            return 1;
        }
        int Snm1 = calSum(n-1);
        int sn = n + Snm1;
        return sn; // head recursion
    }

    public static int fib(int n){

        if (n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1); // head recursion
        int fnm2 = fib(n-2); // tail recursion
        int fn = fnm1 + fnm2; // head recursion
        return fn;
    }

    public static boolean isSorted (int arr[], int i){
        if (i == arr.length-1){
            return true;
        }
         if (arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[] ,int key, int i){
        if(i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[] ,int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }


 
    public static void main(String args[]) {
        int key = 3;
        int n = 5;
        int x = 2;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 3};

        System.out.println(power(x, n));

        // System.out.println(lastOccurence(arr, key, 0));

        // System.out.println(firstOccurence(arr, 71, 0));

        // System.out.println(isSorted(arr,0));

        // System.out.println(fib(n)); // prints fibonacci of n

        // System.out.println(calSum(n)); // prints sum of n
        // System.out.println(fact(n)); // prints factorial of n
        // printDec(n);
        // System.out.println(); // for new line
        // printInc(n);

    }
}
