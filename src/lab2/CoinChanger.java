/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author class
 */
public class CoinChanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       final int QUARTER_VALUE = 25;
       final int DIME_VALUE = 10;
       final int NICKLE_VALUE = 5;
        String input = JOptionPane.showInputDialog("Enter the amount of change: ");
        int d = Integer.parseInt(input);
        System.out.println(" The user entered: " + d);
        
        // TODO: compute the amount of change
        
        //TODO: Calculate the numbers of quarters
        int quarterCount = d/QUARTER_VALUE;
        System.out.println(" I now have "+ quarterCount + "quarter" );
        
        d %= QUARTER_VALUE;
        System.out.println("I have " + d + "left to go.");
        
        //TODO: Calculate the number of dimes
        int dimeCount;
        
        
        //TODO: Calculate the number of nickels
        int nickelCount = 0;
        
        //TODO: What's left in d is the amount of pennies.
        //TODO: Print the number of coins in each categories.
        //TODO: Print the total number of coins.
        
        
        
  
    }
    
}
