public class LanguageBasics1 {
    public static void main(String[] args) {
        // Constants
        double diameterEarth = 7600.0; // in miles
        double diameterSun = 865000.0; // in miles

        // Calculate radii
        double radiusEarth = diameterEarth / 2.0;
        double radiusSun = diameterSun / 2.0;

        // Calculate volumes using the formula V = (4/3) * pi * r^3
        double volumeEarth = (4.0 / 3.0) * Math.PI * Math.pow(radiusEarth, 3);
        double volumeSun = (4.0 / 3.0) * Math.PI * Math.pow(radiusSun, 3);

        // Calculate the ratio of the Sun's volume to Earth's volume
        double ratio = volumeSun / volumeEarth;

        // Output the results
        System.out.printf("The volume of the Earth is %.2f cubic miles%n", volumeEarth);
        System.out.printf("The volume of the Sun is %.2f cubic miles%n", volumeSun);
        System.out.printf("The ratio of the volume of the Sun to the volume of the Earth is %.2f%n", ratio);
    }
}
