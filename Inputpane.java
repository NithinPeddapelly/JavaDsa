import javax.swing.JOptionPane;
public class Inputpane {
    public static void main(String args[]){
        String username,output;
        username = JOptionPane.showInputDialog("Enter your name");
        output = "Hello"+" "+username;

        JOptionPane.showMessageDialog(null,output,"Welcome", JOptionPane.PLAIN_MESSAGE);

    }
    
}
