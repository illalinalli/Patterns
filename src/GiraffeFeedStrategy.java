// определяем, чем кормить каждое животное

public class GiraffeFeedStrategy implements FeedStrategy{
    // кормим жирафа
    @Override
    public void feed() {
        System.out.println("Кормим свежим сеном.");
    }
}


