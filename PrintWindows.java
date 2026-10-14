import javax.swing.JOptionPane; // allows us to use a special window
public class PrintWindows {
    public static void main (String args[]){
String myName = "Nithin";
int age = 24;
String output;

output = "My name is " + myName + " and I am " + age + " years old.";

JOptionPane.showMessageDialog(null,output,"A Message",
JOptionPane.INFORMATION_MESSAGE);
    }
}
