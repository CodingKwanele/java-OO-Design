/*
@ author : Kwanele Dladla
@ Lecture : Jason Wilder
BCIT LAB1
 */

public class Iphone15 extends Iphone {
    private boolean highResolutionCamera;
    private int gigabytesOfMemory;

    public Iphone15(double minutesRemainingOnPlan, String carrier, boolean highResolutionCamera,
                    int gigabytesOfMemory) {
        super(minutesRemainingOnPlan, carrier);
        this.highResolutionCamera = highResolutionCamera;
        this.gigabytesOfMemory = gigabytesOfMemory;
    }

    public boolean isHighResolutionCamera() {
        return highResolutionCamera;
    }

    public void setHighResolutionCamera(boolean highResolutionCamera) {
        this.highResolutionCamera = highResolutionCamera;
    }

    public int getGigabytesOfMemory() {
        return gigabytesOfMemory;
    }

    public void setGigabytesOfMemory(int gigabytesOfMemory) {
        this.gigabytesOfMemory = gigabytesOfMemory;
    }

    @Override
    public String toString() {
        return "IPhoneFifteen [highResolutionCamera=" + highResolutionCamera + ", gigabytesOfMemory="
                + gigabytesOfMemory + ", " + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Iphone15 other = (Iphone15) obj;
        return highResolutionCamera == other.highResolutionCamera
                && getMinutesRemainingOnPlan() == other.getMinutesRemainingOnPlan();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (highResolutionCamera ? 1231 : 1237);
        long temp = Double.doubleToLongBits(getMinutesRemainingOnPlan());
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
