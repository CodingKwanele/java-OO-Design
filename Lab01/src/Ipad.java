/*
@ author : Kwanele Dladla
@ Lecture : Jason Wilder
BCIT LAB1
 */

import java.util.Objects;

public class Ipad extends IDevice {
    private final boolean hasACase;
    private final String operatingSystemVersion;

    public Ipad(boolean hasACase, String operatingSystemVersion) {
        super("Learning");
        this.hasACase = hasACase;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public boolean isHasACase() {
        return hasACase;
    }

    @Override
    public String toString() {
        return "Ipad{" +
                "hasACase=" + hasACase +
                ", operatingSystemVersion='" + operatingSystemVersion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ipad)) return false;
        Ipad ipad = (Ipad) o;
        return isHasACase() == ipad.isHasACase() && Objects.equals(getOperatingSystemVersion(), ipad.getOperatingSystemVersion());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((operatingSystemVersion == null) ? 0 : operatingSystemVersion.hashCode());
        return result;
    }

    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }



    @Override
    public void printDetails() {
        System.out.println("Has case: " + hasACase);
        System.out.println("Operating system version: " + operatingSystemVersion);
    }
}
