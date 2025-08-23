import javax.swing.plaf.synth.SynthScrollPaneUI;

public class j65_Plaindrome {
    public static boolean plaindromecheck(String name){
        int length1 = name.length();
        int length = length1-1;

        for (int i = 0; i < length / 2 ; i++){
            if(name.charAt(i) != name.charAt(length-i)){ // length - i   will be equal to other side of the string
                System.out.println("Not plaindrome");
                return false;
            }
        }
        System.out.println("plaindrome");
        return true;
    }
    public static void main(String args[]) {
        String name = "rrdrr";
        plaindromecheck(name);
        
    }

}
