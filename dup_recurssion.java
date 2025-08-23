public class dup_recurssion {

    public static void removeDup(String str, int index, StringBuilder newStr, boolean map[]) {

        // base case
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);

        if (map[currentChar - 'a'] == true) {
            removeDup(str, index + 1, newStr, map);
        } else {
            map[currentChar - 'a'] = true;
            removeDup(str, index, newStr.append(currentChar), map);
        }
    }

    public static int friendsParing(int n){
        if (n == 1 || n == 2){
            return n;
        }

        //choice
        // single
        int fnm1 = friendsParing(n-1);

        // pair
        int fnm2 = friendsParing(n-2);
        int pairways = (n-1) * fnm2;

        int totalways = fnm1 + pairways;
        return totalways;
    }

    public static void main(String args[]) {
        String str = "nithin";

        System.out.println(friendsParing(5));
      


        // removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
