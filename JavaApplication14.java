import javax.swing.*;

public class JavaApplication14 {

    public static void main(String[] args) {
    String name = JOptionPane.showInputDialog ("please enter an Integer : ");
    int n = Integer.parseInt(name);
    String message;
    if(n%2==0)
    {
        message = "your number is even ";
    }
    else
    {
        message = "your number is odd ";
    }
    JOptionPane.showMessageDialog(null, message);
    }
    
}
