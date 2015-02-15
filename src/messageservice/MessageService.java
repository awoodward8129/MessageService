

package messageservice;

import java.util.Scanner;


public class MessageService {

    private MessageStrategy messageStrategy;
     private String newMessage = "";
    public MessageService() {
    }

    public MessageService(MessageStrategy messageStrategy) {
        this.messageStrategy = messageStrategy;
    }

    public MessageStrategy getMessageStratety() {
        return messageStrategy;
    }

    public void setMessageStratety(MessageStrategy messageStrategy) {
        this.messageStrategy = messageStrategy;
    }
    
    public void showMessage() {
        System.out.println(messageStrategy.returnMessage());
    }
     
 public void setAddMessage(MessageStrategy messageStrategy) {
        this.messageStrategy = messageStrategy;
    }

   public void addMessage() {
       messageStrategy.addMessage();
   }
}
    
