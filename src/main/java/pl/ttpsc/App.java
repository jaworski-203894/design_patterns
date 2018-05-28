package pl.ttpsc;

import pl.ttpsc.decorator.*;
import pl.ttpsc.observer.InformationSource;
import pl.ttpsc.observer.TvStation1;
import pl.ttpsc.observer.TvStation2;
import pl.ttpsc.observer.TvStation3;

public class App {

    public static void main(String args[]) {
        InformationSource source = new InformationSource();
        source.subcribe(new TvStation1());
        source.subcribe(new TvStation2());
        source.subcribe(new TvStation3());
        source.setMessage("MESSAGE");

        System.out.println("======================");
        Car car = new Sedan();
        System.out.println(car.getWeight());
        Car car2 = new RadioWithExtraBass(car);
        System.out.println(car2.getWeight());
        Car car3 = new AirBag(car2);
        System.out.println(car3.getWeight());
        Car car4 = new AirConditioning(car3);
        System.out.println(car4.getWeight());
        System.out.println("Hello world!");
    }
}
