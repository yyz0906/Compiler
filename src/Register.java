public class Register {
    public int registerNumber;
    public String label;
    public int value;

    public Register(int size) {
        this.registerNumber = size;
    }

    public Register(int registerNumber, String label) {
        this.registerNumber = registerNumber;
        this.label = label;
    }
}
