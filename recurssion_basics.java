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

    public static void main(String args[]) {
        int n = 10;
        printDec(n);
        System.out.println(); // for new line
        printInc(n);

    }
}
