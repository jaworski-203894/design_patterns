package pl.ttpsc.decorator;

public class AirConditioning extends Decorator {
    public AirConditioning(Car car) {
        super(car);
    }

    @Override
    protected double getMyWeight() {
        return 100;
    }
}
