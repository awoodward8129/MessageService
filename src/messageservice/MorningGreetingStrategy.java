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
    private String newMessage;

    @Override
    public String returnMessage() {

        Random decider = new Random();

        return greetings[decider.nextInt(greetings.length)];
    }

    @Override
    public void addMessage() {
     System.out.println("What would you like to say for the Morning Greeting of the Day?");
        Scanner keyboard = new Scanner(System.in);
        newMessage= keyboard.nextLine();
        System.out.println(newMessage);
}
    
}
