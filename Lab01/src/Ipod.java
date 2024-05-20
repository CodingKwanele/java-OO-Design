/*
@ author : Kwanele Dladla
@ Lecture : Jason Wilder
BCIT LAB1
 */

public class Ipod extends IDevice {

    private int numberOfTracksStored;
    private double maxVolumeInDecibels;

    public Ipod(int numberOfTracksStored, double maxVolumeInDecibels) {
        super("Music");
        this.numberOfTracksStored = numberOfTracksStored;
        this.maxVolumeInDecibels = maxVolumeInDecibels;
    }

    public int getNumberOfTracksStored() {
        return numberOfTracksStored;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ipod)) return false;
        Ipod ipod = (Ipod) o;
        return getNumberOfTracksStored() == ipod.getNumberOfTracksStored() && Double.compare(ipod.getMaxVolumeInDecibels(), getMaxVolumeInDecibels()) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + numberOfTracksStored;
        return result;
    }

    public double getMaxVolumeInDecibels() {
        return maxVolumeInDecibels;
    }

    @Override
    public String toString() {
        return "Ipod{" +
                "numberOfTracksStored=" + numberOfTracksStored +
                ", maxVolumeInDecibels=" + maxVolumeInDecibels +
                '}';
    }

    @Override
    public void printDetails() {
        System.out.println("The Number of Tracks Stored is:" + numberOfTracksStored);
        System.out.println("The Maximum volume is :"+ maxVolumeInDecibels);

    }
    public void setNumberOfTracksStored(int numberOfTracksStored) {
        this.numberOfTracksStored =numberOfTracksStored;
    }
    public void setMaxVolumeInDecibels(double maxVolumeInDecibels) {
        this.maxVolumeInDecibels = maxVolumeInDecibels;
    }
}
