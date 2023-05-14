// класс - чат потенциального клиента и сотрудника
public class ChatUser extends User {

    public ChatUser(IHelpChat chatWindow, String id, String name) {
        super(chatWindow, id, name);
    }

    @Override
    public void Send(String msg, String userId) {
        System.out.println(this.getName() + " -- Идёт отправка сообщения : " + msg);
        getMediator().sendMessage(msg, userId);
    }

    @Override
    public void Receive(String msg) {
        System.out.println(this.getName() + " -- Полученное сообщение : " + msg);
    }

}
