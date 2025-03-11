/**
 *
 * @author egydestf
 */

public class Wheels {
    private int count;
    private String type;

    // Constructor untuk inisialisasi roda
    public Wheels(int count, String type) {
        this.count = count;
        this.type = type;
    }

    // Method untuk mensimulasikan perputaran roda
    public void rotate() {
        System.out.println("Wheels rotating: " + count + " wheels with " + type + " tires");
    }
}
