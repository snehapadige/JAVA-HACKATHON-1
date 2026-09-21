public class SalaryCalculator {
    public static void main(String[] args) 

        // Prompt the user to enter the basic salary
        System.out.print("Enter the Basic Salary of the employee: ");
        double basicSalary = scanner.nextDouble();

        // Variables to store calculated HRA and DA
        double hra = 0.0;
        double da = 0.0;
        // Determine HRA and DA based on conditional salary tiers
 import java.util.Scanner;
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the basic salary
        System.out.print("Enter the Basic Salary of the employee: ");
        double basicSalary = scanner.nextDouble();
        // Variables to store calculated HRA and DA
        double hra = 0.0;
        double da = 0.0;
        // Determine HRA and DA based on conditional salary tiers
        if (basicSalary <= 10000) {
            hra = 0.20 * basicSalary; // 20% of Basic Salary
            da = 0.80 * basicSalary;  // 80% of Basic Salary
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary; // 25% of Basic Salary
            da = 0.90 * basicSalary;  // 90% of Basic Salary
        } else {
       if (basicSalary <= 10000) {
            hra = 0.20 * basicSalary; // 20% of Basic Salary
            da = 0.80 * basicSalary;  // 80% of Basic Salary
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary; // 25% of Basic Salary
            da = 0.90 * basicSalary;  // 90% of Basic Salary
        } else {
            }
  }      
