/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import java.awt.Component;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class MorningGreetingStrategy implements MessageStrategy {

    String[] greetings = {"Hello", "Good Morning", "Would you like some bacon?",
                            "Enjoy your day", "I am bacon cake", "Sure is cold out today..."};
    //private String newMessage;
    private Component frame;

    @Override
    public String returnMessage() {

        Random decider = new Random();

        return greetings[decider.nextInt(greetings.length)];
    }

    @Override
    public void addMessage() {
Object[] options = {"Yes, please",
                    "No way!"};
int n = JOptionPane.showOptionDialog(frame,
    "Would you like green eggs and ham?",
    "A Silly Question",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,     //do not use a custom Icon
    options,  //the titles of buttons
    options[0]); //default button title

if (n == JOptionPane.YES_OPTION) {
          JOptionPane.showMessageDialog(null, "HELLO");
        }
        else {
           JOptionPane.showMessageDialog(null, "GOODBYE");
           System.exit(0);
        }
}
    
}
