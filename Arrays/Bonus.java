
package Arrays;
import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        int index = 0;
        while (index < 10) {
            System.out.print("Enter salary for employee " + (index + 1) + ": ");
            double salary = input.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary. Please enter a positive number.");
                continue; // Skip to the next iteration
            }
            salaries[index] = salary;
            totalOldSalary += salary;

            System.out.print("Enter years of service for employee " + (index + 1) + ": ");
            double years = input.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service. Please enter a non-negative number.");
                continue; // Skip to the next iteration
            }
            yearsOfService[index] = years;

            // Calculate bonus and new salary
            if (years > 5) {
                bonuses[index] = salary * 0.05; // 5% bonus
            } else {
                bonuses[index] = salary * 0.02; // 2% bonus
            }
            newSalaries[index] = salary + bonuses[index];

            totalBonus += bonuses[index];
            totalNewSalary += newSalaries[index];

            index++;
        }
        // Display total bonus, old salary, and new salary
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        // Display individual employee details
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("  Old Salary: " + salaries[i]);
            System.out.println("  Years of Service: " + yearsOfService[i]);
            System.out.println("  Bonus: " + bonuses[i]);
            System.out.println("  New Salary: " + newSalaries[i]);
        }
        input.close();
    }
}