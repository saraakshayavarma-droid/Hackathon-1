import java.util.Scanner;

public class SolarEnergyCalculator {

    // Method to calculate total energy generated
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read morning energy generation
        System.out.print("Enter morning energy generation (in kWh): ");
        double morningEnergy = scanner.nextDouble();

        // Read evening energy generation
        System.out.print("Enter evening energy generation (in kWh): ");
        double eveningEnergy = scanner.nextDouble();

        // Call the method to calculate total energy
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        // Display the total energy generated
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        scanner.close();
    }
}