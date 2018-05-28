package pl.ttpsc.decorator;

public class AirBag extends Decorator {
    public AirBag(Car car) {
        super(car);
    }

    @Override
    protected double getMyWeight() {
        return 30;
    }
}
