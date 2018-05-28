package pl.ttpsc.decorator;

public abstract class Decorator implements Car {
    public Decorator(Car car) {
        this.car = car;
    }

    protected Car car;
    protected abstract double getMyWeight();
    @Override
    public double getWeight() {
        return car.getWeight() + getMyWeight();
    }
}
