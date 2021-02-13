public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(70000);
        System.out.println( "Conversion Complete.");
    }
    public static int printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }

        else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " = " + megaBytes + "MB and " + remainingKiloBytes + " KB");
        }
        return kiloBytes;
    }
}
