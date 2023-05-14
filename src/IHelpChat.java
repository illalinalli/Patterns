// интерфейс медиатора - конкретно чата поддержки
public interface IHelpChat {
    public void sendMessage(String msg, String userId);
    public void ConnectUser(User user);
}

