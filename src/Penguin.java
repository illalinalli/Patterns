public class Penguin extends Animals{
    public Penguin(){
        this.feedStrategy = new PenguinFeedStrategy();
    }
}

