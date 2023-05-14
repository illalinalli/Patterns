// класс пользователей
public abstract class User
{
    private IHelpChat mediator;
    private String id;
    private String name;

    public User(IHelpChat chatWindow, String id, String name){
        this.mediator = chatWindow;
        this.name = name;
        this.id = id;
    }

    public abstract void Send(String msg, String userId);
    public abstract void Receive(String msg);

    public IHelpChat getMediator() {
        return mediator;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
