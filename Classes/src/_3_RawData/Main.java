package _3_RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //"{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType}
        // {Tire1Pressure} {Tire1Age} {Tire2Pressure} {Tire2Age} {Tire3Pressure} {Tire]’3Age} {Tire4Pressure} {Tire4Age}"
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> carsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] arr = input.split("\\s+");

            String model = arr[0];
            int engineSpeed = Integer.parseInt(arr[1]);
            int enginePower = Integer.parseInt(arr[2]);
            int cargoWeight = Integer.parseInt(arr[3]);
            String cargoType = arr[4];
            double tire1Pressure = Double.parseDouble(arr[5]);
            int tire1Age = Integer.parseInt(arr[6]);
            double tire2Pressure = Double.parseDouble(arr[7]);
            int tire2Age = Integer.parseInt(arr[8]);
            double tire3Pressure = Double.parseDouble(arr[9]);
            int tire3Age = Integer.parseInt(arr[10]);
            double tire4Pressure = Double.parseDouble(arr[11]);
            int tire4Age = Integer.parseInt(arr[12]);

            Engine engine = new Engine(
                    engineSpeed, enginePower
            );

            Cargo cargo = new Cargo(
                    cargoWeight, cargoType
            );

            Tire tires = new Tire(
                tire1Pressure, tire1Age, tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age
            );

            Car car = new Car(
                model, engine, cargo, tires
            );
            carsList.add(car);
        }
        String command = scanner.nextLine();

        switch (command){
            case "fragile":
                for (Car car:carsList) {
                    if(car.getCargo().getCargoType().equals("fragile") &&
                            (car.getTire().getTire1Pressure() < 1 ||
                    car.getTire().getTire2Pressure() < 1 ||
                    car.getTire().getTire3Pressure() < 1 ||
                    car.getTire().getTire4Pressure() < 1)){
                        printCars(car);
                    }
                }
                break;
            case "flamable":
                for (Car car:carsList) {
                    if(car.getCargo().getCargoType().equals("flamable") &&
                            car.getEngine().getEnginePower() > 250){
                        printCars(car);
                    }
                }
                break;
        }

    }
    public static void printCars(Car car){
        System.out.println(car.getModel());
    }
}
