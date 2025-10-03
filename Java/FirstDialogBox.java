package Java;

import javax.swing.JOptionPane;

public class FirstDialogBox {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "Your height is: "+height);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age: "));
        JOptionPane.showMessageDialog(null, "Your age is: "+age);
    }
}
