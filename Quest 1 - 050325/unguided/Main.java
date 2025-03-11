/**
 *
 * @author egydestf
 */

public class Main {
    public static void main(String[] args) {
        // Membuat objek komponen mobil
        Engine engine = new Engine("RB26DETT", 276); // mesin
        Transmission transmission = new Transmission("6-speed manual"); // transmisi
        Wheels wheels = new Wheels(4, "Performance"); // tipe roda
        Turbo turbo = new Turbo("HKS GTIII-SS"); // model turbo

        // Membuat objek mobil dengan spesifikasi Nissan Skyline GT-R R34
        Car car = new Car("Nissan", "Skyline GT-R R34", 1999, engine, transmission, wheels, turbo);
        
        // Menyalakan mobil
        car.startCar();
    }
}