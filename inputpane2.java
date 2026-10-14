import javax.swing.JOptionPane;

public class inputpane2 {
public static void main (String args[]){

    String username,UserAge ,output;
    int age , ageNextBirthday;
     username = JOptionPane.showInputDialog("Enter your name");
     UserAge = JOptionPane.showInputDialog("Enter your age");
     age = Integer.parseInt(UserAge);
     ageNextBirthday = age+1;
     output = "Hello"+" "+username+" "+"you will be"+" "+ageNextBirthday+" "+"years old on your next birthday";
     JOptionPane.showMessageDialog(null,output,"Welcome", JOptionPane.PLAIN_MESSAGE);

}    
}
