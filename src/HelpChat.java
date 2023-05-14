import java.util.HashMap;
import java.util.Map;

public class HelpChat implements IHelpChat {

    private Map<String, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId)
    {
        User u = usersMap.get(userId);
        u.Receive(msg);
    }

    @Override
    public void ConnectUser(User user) {
        this.usersMap.put(user.getId(), user);
    }

}