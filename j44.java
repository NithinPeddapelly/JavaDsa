public class j44{
    // public static void subarr(int arr[]){
    //     for(int i = 0;i<arr.length;i++){

    //         for(int j=i;j<arr.length;j++){

    //             for (int k = i;k<=j;k++){
    //                 System.out.print(arr[k]+" ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();

    //     }
    // }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        Subarr(arr);
    }
    public static void Subarr(int arr[]){
        for(int i = 0;i <= arr.length-1;i++){
            for(int j = i;j<arr.length;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}