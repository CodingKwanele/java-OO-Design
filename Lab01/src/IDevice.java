/*
@ author : Kwanele Dladla
@ Lecture : Jason Wilder
BCIT LAB1
 */

public abstract class IDevice {
    private final String purpose;

    public IDevice(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public abstract void printDetails();

    @Override
    public String toString() {
        return "Iphone{" +
                "purpose='" + purpose + '\'' +
                '}';
    }
}
