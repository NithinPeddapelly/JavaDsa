public class dup_recurssion {
    
    public static int removeDup( String str , int index, StringBuilder newStr, boolean map[]) {
        
        //base case
        if (index == str.length()){
            System.out.println(newStr);
            return 0;
        }

        char currentChar = str.charAt(index);

        if(map[currentChar - 'a'] == true){
            removeDup(str, index+1, newStr, map)
        }
    
        }
  
            
        }

        
        
        
        
        
        
    }


    public static void main(String args[]){}
}
