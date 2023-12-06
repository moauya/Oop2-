
package oop2_week2;

import javax.swing.JOptionPane;


public class Test2 {
    public static void main(String[] args) {
        String str1=JOptionPane.showInputDialog("enter a number");
        String str2=JOptionPane.showInputDialog("enter a number");
        int n1=Integer.parseInt(str1);
        int n2=Integer.parseInt(str2);
        int sum=n1+n2;
        System.out.println(sum);
    }
    
}
