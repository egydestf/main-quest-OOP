/**
 *
 * @author egydestf
 */

public class Transmission {
    private String type;

    // Constructor untuk inisialisasi transmission
    public Transmission(String type) {
        this.type = type;
    }

    // Method untuk mengganti gigi/transmisi
    public void shiftGear() {
        System.out.println("Shifting gears in " + type + " transmission");
    }
}
