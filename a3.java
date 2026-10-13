import java.util.Scanner;
public class a3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); // Taking input from user 
        int a = sc.nextInt(); // Taking input from user and assigning it to variable a
        int b = sc.nextInt(); // Taking input from user and assigning it to variable b
        int c = sc.nextInt(); // Taking input from user and assigning it to variable c
        int average = (a+b+c) / 3; // Calculating average
        System.out.println(average);
        sc.close();
    }
    
}
