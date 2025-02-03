package U7T1;

import java.util.ArrayList;
import java.util.Arrays;

public class MoreTesting {
    public static void main(String[] args) {
        Car[] cars = {new Car("Ford F150", 2000), new Car("Mustang", 9000), new Car("Honda Civic", 240)};
        ArrayList<Car> carsList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carsList);    
    }

}