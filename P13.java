import java.util.Scanner;

public class P13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of cities and days from the user
        System.out.print("Enter the number of cities: ");
        int numCities = input.nextInt();

        System.out.print("Enter the number of days: ");
        int numDays = input.nextInt();

        // Create a 2D array to store the temperatures
        double[][] temperatures = new double[numCities][numDays];

        // Get the name of each city and its temperatures for each day
        for (int i = 0; i < numCities; i++) {
            System.out.print("Enter the name of city #" + (i+1) + ": ");
            String cityName = input.next();

            System.out.println("Enter the temperatures for " + cityName + " (in degrees Celsius):");
            for (int j = 0; j < numDays; j++) {
                System.out.print("Day " + (j+1) + ": ");
                temperatures[i][j] = input.nextDouble();
            }
        }

        // Find the highest and lowest temperatures
        double highestTemp = temperatures[0][0];
        double lowestTemp = temperatures[0][0];
        String highestCity = "";
        String lowestCity = "";

        for (int i = 0; i < numCities; i++) {
            for (int j = 0; j < numDays; j++) {
                if (temperatures[i][j] > highestTemp) {
                    highestTemp = temperatures[i][j];
                    highestCity = "City #" + (i+1) + " on Day #" + (j+1);
                }

                if (temperatures[i][j] < lowestTemp) {
                    lowestTemp = temperatures[i][j];
                    lowestCity = "City #" + (i+1) + " on Day #" + (j+1);
                }
            }
        }

        // Print out the highest and lowest temperatures and their corresponding cities and dates
        System.out.println("Highest temperature: " + highestTemp + " degrees Celsius in " + highestCity);
        System.out.println("Lowest temperature: " + lowestTemp + " degrees Celsius in " + lowestCity);
    }
}
