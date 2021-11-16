package sender;

import facebook.FacebookUser;
import twitter.TwitterUser;
import users.User;

public class MessageSender {
    public String send(String message, User user, String country){
        if (user.getCountry() == country && user.getLastActive() != null){
            System.out.println("This message was sent:");
            System.out.println(message);
        }
        return "The message can not be sent";
    }
}
