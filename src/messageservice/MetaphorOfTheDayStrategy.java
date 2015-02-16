/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class MetaphorOfTheDayStrategy implements MessageStrategy {
    private String newMessage = "";

    String[] greetings = {"Built like a brick House", "The world is a stage", "His heart is cold iron", 
                            "Drink like a fish"};

    @Override
    public void returnMessage() {

        Random decider = new Random();

        System.out.println( greetings[decider.nextInt(greetings.length)]);
    }

    @Override
    public void addMessage() {
          System.out.println("What would you like to say for the Metaphor of the Day?");
        Scanner keyboard = new Scanner(System.in);
        newMessage= keyboard.nextLine();
        System.out.println(newMessage);
    }

  

   
}
