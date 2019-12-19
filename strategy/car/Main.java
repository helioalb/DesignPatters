import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>(Arrays.asList(new FordX(), new FerrariY()));
        double litres = 40;

        for(Car car : cars) {
            System.out.println(car.name() + " - " + car.fuel() + ", autonomy with " + litres + " litres: " + car.autonomy(litres));
        }
    }
}
