/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package messageservice;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class GuiMessage implements MessageStrategy  {
    
    
 
    @Override
    
    public void returnMessage() {
       Object[] options = {"Yes, please",
                    "No way!"};
int n = JOptionPane.showOptionDialog(
        null,// no frame
    "Would you like green eggs and ham?",
    "A Silly Question",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,     //do not use a custom Icon
    options,  //the titles of buttons
    options[0]); //default button title

if (n == JOptionPane.YES_OPTION) {
          JOptionPane.showMessageDialog(null, "Awesome!");
        }
        else {
           JOptionPane.showMessageDialog(null, "Not so awesome...");
           System.exit(0);
        }
    }

    @Override
    
    public void addMessage() {
         String message = JOptionPane.showInputDialog("Enter Your Message: ");
          JOptionPane.showMessageDialog(null, message);
    
    }
    
}
