/*
@ author : Kwanele Dladla
@ Lecture : Jason Wilder
BCIT LAB1
 */

public class Iphone extends IDevice {
    private double minutesRemainingOnPlan;
    private String carrier;

    public Iphone(double minutesRemainingOnPlan, String carrier) {
        super("talking");
        this.minutesRemainingOnPlan = minutesRemainingOnPlan;
        this.carrier = carrier;
    }

    public double getMinutesRemainingOnPlan() {
        return minutesRemainingOnPlan;
    }

    public void setMinutesRemainingOnPlan(double minutesRemainingOnPlan) {
        this.minutesRemainingOnPlan = minutesRemainingOnPlan;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @Override
    public void printDetails() {
        System.out.println("Minutes remaining on plan: " + minutesRemainingOnPlan);
        System.out.println("Carrier: " + carrier);
    }

    @Override
    public String toString() {
        return "IPhone [minutesRemainingOnPlan=" + minutesRemainingOnPlan + ", carrier=" + carrier + ", "
                + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Iphone other = (Iphone) obj;
        return minutesRemainingOnPlan == other.minutesRemainingOnPlan;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp = Double.doubleToLongBits(minutesRemainingOnPlan);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
