/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package messageservice;

/**
 *
 * @author Alex
 */
public class Startup {

    public static void main(String[] args) {
        MessageService messageService = new MessageService(
                //new MetaphorOfTheDayStrategy());
               new MorningGreetingStrategy()
               // new GuiMessage();
        );
        System.out.println(messageService.showMessage()); 
   messageService.addMessage();
    }
    
}
