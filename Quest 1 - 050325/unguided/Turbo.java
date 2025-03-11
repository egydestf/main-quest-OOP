/**
 *
 * @author egydestf
 */

public class Turbo {
    private String model;
    private boolean isActive;

    // Constructor untuk inisialisasi turbo
    public Turbo(String model) {
        this.model = model;
        this.isActive = false;
    }

    // Method untuk mengaktifkan turbo mode
    public void activateTurbo() {
        isActive = true;
        System.out.println("Turbo " + model + " activated!");
    }
}
