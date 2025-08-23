public class binary_String {

    public static void print_binary_Strings(  int n , int lastplace,StringBuilder newStr){

        if(lastplace == 0){
            print_binary_Strings(n-1, 0, newStr.append("0"));
            print_binary_Strings(n-1, 1, newStr.append("1"));
        }else{
            print_binary_Strings(n-1, 0, newStr.append("0"));
        }

    }
    
    public static void main(String args){

    }
}

