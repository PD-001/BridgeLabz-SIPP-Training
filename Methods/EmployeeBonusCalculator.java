package Methods;

import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to generate salaries and years of service
    public static int[][] generateEmployeeData(int count) {
        int[][] data = new int[count][2]; // [][0] = salary, [][1] = years of service
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = rand.nextInt(11); // 0 to 10 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate bonuses and new salaries
    public static double[][] calculateBonusAndNewSalaries(int[][] data) {
        double[][] result = new double[data.length][2]; // [][0] = bonus, [][1] = new salary

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Method to display the result in tabular format
    public static void displayReport(int[][] data, double[][] computed) {
        int totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("EmpID\tSalary\tYears\tBonus\t\tNew Salary");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus = computed[i][0];
            double newSalary = computed[i][1];

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%5d\t%6d\t%5d\t%8.2f\t%10.2f\n", i + 1, salary, years, bonus, newSalary);
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("Total\t%d\t\t%8.2f\t%10.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int employeeCount = 10;
        int[][] employeeData = generateEmployeeData(employeeCount);
        double[][] computedData = calculateBonusAndNewSalaries(employeeData);
        displayReport(employeeData, computedData);
    }
}
