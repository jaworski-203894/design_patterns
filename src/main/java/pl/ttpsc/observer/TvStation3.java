package pl.ttpsc.observer;

public class TvStation3 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("TV3 : " + message);
    }
}
