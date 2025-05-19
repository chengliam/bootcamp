import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of individuals: ");
        int n = scanner.nextInt();

        // Arrays to store weights, heights, and BMI results
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmiResults = new double[n];

        // Input weight and height for each individual
        for (int i = 0; i < n; i++) {
            System.out.println("Individual " + (i + 1) + ":");
            System.out.print("Enter weight in kg: ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height in meters: ");
            heights[i] = scanner.nextDouble();
        }

        // Calculate BMI for each individual
        for (int i = 0; i < n; i++) {
            bmiResults[i] = weights[i] / (heights[i] * heights[i]);
        }

        // Print BMI results and categories
        for (int i = 0; i < n; i++) {
            System.out.printf("BMI for Individual %d: %.2f%n", (i + 1), bmiResults[i]);

            // Determine BMI category
            if (bmiResults[i] < 18.5) {
                System.out.println("Category: Underweight");
            } else if (bmiResults[i] >= 18.5 && bmiResults[i] < 24.9) {
                System.out.println("Category: Normal weight");
            } else if (bmiResults[i] >= 25 && bmiResults[i] < 29.9) {
                System.out.println("Category: Overweight");
            } else {
                System.out.println("Category: Obese");
            }

            System.out.println(); // Blank line for readability
        }

        scanner.close();
    }
}