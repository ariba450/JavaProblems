class Car {
    String owner;
    String brand;
    String serialNumber;
    double fuel;

    Car(String owner, String brand, String serialNumber, double fuel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuel = fuel;
    }

    void start() {
        if (fuel > 0) {
            System.out.println("Car started");
        } else {
            System.out.println("No fuel");
        }
    }

    void stop() {
        System.out.println("Car stopped");
    }

    void CheckFuel() {
        System.out.println("Fuel: " + fuel + " liters");
    }
}

public class CarDesign {
    public static void main(String[] args) {
        Car c = new Car("Anika", "Toyota", "12345A", 10);

        c.start();
        c.CheckFuel();
        c.stop();
    }
}