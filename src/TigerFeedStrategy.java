public class TigerFeedStrategy implements FeedStrategy{
    // кормим тигра
    @Override
    public void feed() {
        System.out.println("Кормим свежим сырым мясом.");
    }
}