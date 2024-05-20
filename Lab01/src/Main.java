/*
@ author : Kwanele Dladla
@ Lecture : Jason Wilder
BCIT LAB1
 */

public class Main {
    public static void main(String[] args) {
        // Creating an IPod object
        // Create a rocking music library on the go
        Ipod mightyMusicMachine = new Ipod(1000, 85.5);
        System.out.println("**Introducing the " + mightyMusicMachine.getClass().getSimpleName() + "**");
        System.out.println("Blast your favorite tunes with " + mightyMusicMachine.getNumberOfTracksStored() + " songs at your fingertips!");
        System.out.println("Turn it up to " + mightyMusicMachine.getMaxVolumeInDecibels() + " decibels without a single distortion!");
        System.out.println(mightyMusicMachine.toString() + "\n");

        // Creating an IPad object
        Ipad ipad = new Ipad(true, "iOS 14.5");
        System.out.println("IPad details:");
        ipad.printDetails();
        System.out.println(ipad.toString());
        System.out.println("IPad purpose: " + ipad.getPurpose());
        System.out.println();

        // Creating an IPhone object
        Iphone iphone = new Iphone(500, "Verizon");
        System.out.println("IPhone details:");
        iphone.printDetails();
        System.out.println(iphone.toString());
        System.out.println("IPhone purpose: " + iphone.getPurpose());
        System.out.println();

        // Creating an IPhoneFifteen object
        Iphone15 iphoneFifteen = new Iphone15(300, "AT&T", true, 128);
        System.out.println("IPhoneFifteen details:");
        iphoneFifteen.printDetails();
        System.out.println(iphoneFifteen.toString());
        System.out.println("IPhoneFifteen purpose: " + iphoneFifteen.getPurpose());
        System.out.println();

        // Demonstrating the equals() and hashCode() methods
        Ipod anotherIpod = new Ipod(1000, 75.0);
        System.out.println("IPod equals anotherIpod: " + ipad.equals(anotherIpod));
        System.out.println("IPod hashCode: " + ipad.hashCode());
        System.out.println("AnotherIpod hashCode: " + anotherIpod.hashCode());
        System.out.println();

        // Unleash your learning potential
        Ipad knowledgeTablet = new Ipad(true, "iOS 14.5");
        System.out.println("**Presenting the " + knowledgeTablet.getClass().getSimpleName() + "**");
        System.out.println("Expand your knowledge with a protective case (included!)");
        System.out.println("Stay ahead of the curve with the latest " + knowledgeTablet.getOperatingSystemVersion() + " update!");
        System.out.println(knowledgeTablet.toString() + "\n");


        Iphone anotherIphone = new Iphone(500, "T-Mobile");
        System.out.println("IPhone equals anotherIphone: " + iphone.equals(anotherIphone));
        System.out.println("IPhone hashCode: " + iphone.hashCode());
        System.out.println("AnotherIphone hashCode: " + anotherIphone.hashCode());
        System.out.println();

        Iphone15 anotherIphoneFifteen = new Iphone15(300, "Sprint", true, 64);
        System.out.println("IPhoneFifteen equals anotherIphoneFifteen: " + iphoneFifteen.equals(anotherIphoneFifteen));
        System.out.println("IPhoneFifteen hashCode: " + iphoneFifteen.hashCode());
        System.out.println("AnotherIphoneFifteen hashCode: " + anotherIphoneFifteen.hashCode());
    }
}
