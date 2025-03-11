/**
 *
 * @author egydestf
 */

public class Engine {
    private String type;
    private int horsepower;

    // Constructor untuk inisialisasi engine
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    // Method untuk menyalakan mesin
    public void start() {
        System.out.println("Engine started: " + type + " with " + horsepower + " HP");
    }
}
