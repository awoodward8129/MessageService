

package messageservice;

import java.util.Scanner;


public class MessageService {

    private MessageStrategy messageStrategy;
    
  
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
        messageStrategy.returnMessage();
    }
     
 
   public void addMessage() {
       messageStrategy.addMessage();
   }
}
    
