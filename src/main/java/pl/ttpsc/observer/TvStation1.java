package pl.ttpsc.observer;

public class TvStation1 implements Observer {

    @Override
    public void update(String message) {
        System.out.println("TV1 : " + message);
    }
}
