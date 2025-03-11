/**
 *
 * @author egydestf
 */

class Car {
    private String brand;
    private String model;
    private int year;
    private Engine engine;
    private Transmission transmission;
    private Wheels wheels;
    private Turbo turbo;

    // Constructor untuk inisialisasi mobil
    public Car(String brand, String model, int year, Engine engine, Transmission transmission, Wheels wheels, Turbo turbo) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.turbo = turbo;
    }

    // Method untuk menyalakan mobil
    public void startCar() {
        System.out.println(year + " " + brand + " " + model + " is starting...");
        engine.start();
        transmission.shiftGear();
        wheels.rotate();
        turbo.activateTurbo();
    }
}