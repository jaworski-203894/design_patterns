package pl.ttpsc.decorator;

public class RadioWithExtraBass extends Decorator {
    public RadioWithExtraBass(Car car) {
        super(car);
    }

    @Override
    protected double getMyWeight() {
        return 10;
    }
}
