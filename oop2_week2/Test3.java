
package oop2_week2;

import javax.swing.JOptionPane;


public class Test3 {
    public static void main(String[] args) {
        int n1=ReadNumber();
        int n2=ReadNumber();
        int sum=n1+n2;
        System.out.println(sum);
        
        
    }
    public static int ReadNumber(){
        String str1=JOptionPane.showInputDialog("enter a number");
        int number =Integer.parseInt(str1);
        return number;
            
        }
    
}
