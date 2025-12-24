public class CalclateWindChill {
    public static double windChill(int temperature, int windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        int windCSpeed = sc.nextint();
        System.out.println(windChill(temperature, windCSpeed));
    }
}
