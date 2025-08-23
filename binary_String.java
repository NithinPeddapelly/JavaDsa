public class binary_String {
    static int count = 0;

    public static void print_binary_Strings(int n, int lastplace, String newStr) {

        // base case
        if (n == 0) {
            System.out.println(newStr);
            count++;

            return;
        }

        // if (lastplace == 0) {
        // print_binary_Strings(n - 1, 0, newStr.append("0"));
        // print_binary_Strings(n - 1, 1, newStr.append("1"));
        // } else {
        // print_binary_Strings(n - 1, 0, newStr.append("0"));
        // }

        print_binary_Strings(n - 1, 0, newStr + "0");
        if (lastplace == 0) {
            print_binary_Strings(n - 1, 1, newStr + "1");

        }
    }

    public static void main(String args[]) {
        print_binary_Strings(6, 0, new String(""));
        System.out.println("total number of binary strings are : " + count);
    }
}
