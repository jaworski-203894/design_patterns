package pl.ttpsc.observer;

public class TvStation2 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("TV2 : " + message);
    }
}
