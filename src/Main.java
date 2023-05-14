public class Main {
    public static void main(String[] args) {

        // --------- Mediator --------------
        IHelpChat helpChatWindow = new HelpChat();

        User client = new ChatUser(helpChatWindow,"1", "Client: Ivan");
        User employee = new ChatUser(helpChatWindow,"2", "Employee: Andrew");

        // присоединяем к чату клиента и сотрудника
        helpChatWindow.ConnectUser(client);
        helpChatWindow.ConnectUser(employee);

        client.Send("Hello! Could you help me?", "2");
        employee.Send("Hello. Of course. What's a problem?", "1");

        // -------- Strategy ----------------
        Animals tiger = new Tiger();
        Animals giraffe = new Giraffe();
        Animals penguin = new Penguin();

        tiger.feed();
        giraffe.feed();
        penguin.feed();
    }
}