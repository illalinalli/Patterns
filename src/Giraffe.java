public class Giraffe extends Animals{
    public Giraffe(){
        this.feedStrategy = new GiraffeFeedStrategy();
    }
}
