import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cars you want to create:");
        int numCars = scanner.nextInt();

        for (int i = 0; i < numCars; i++) {
            System.out.println("Enter make for Car " + (i + 1) + ":");
            String make = scanner.next();

            System.out.println("Enter model for Car " + (i + 1) + ":");
            String model = scanner.next();

            System.out.println("Enter year for Car " + (i + 1) + ":");
            int year = scanner.nextInt();

            Car car = new Car(make, model, year);
            car.displayInfo();
            System.out.println();
        }

    }
}