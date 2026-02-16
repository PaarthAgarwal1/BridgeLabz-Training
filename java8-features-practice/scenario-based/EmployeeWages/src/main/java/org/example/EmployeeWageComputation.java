package org.example;

import java.util.Scanner;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Employee Wage Computation Program");

        IEmployeeWageBuilder empWageBuilder = new EmpWageBuilder();

        System.out.print("Enter number of companies: ");
        int numberOfCompanies = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < numberOfCompanies; i++) {

            System.out.println("\nEnter details for Company " + (i + 1));

            System.out.print("Company Name: ");
            String companyName = sc.nextLine();

            System.out.print("Wage Per Hour: ");
            int wagePerHour = sc.nextInt();

            System.out.print("Max Working Days: ");
            int maxWorkingDays = sc.nextInt();

            System.out.print("Max Working Hours: ");
            int maxWorkingHours = sc.nextInt();
            sc.nextLine(); // consume newline

            empWageBuilder.addCompany(
                    companyName,
                    wagePerHour,
                    maxWorkingDays,
                    maxWorkingHours
            );
        }

        System.out.println("\nComputing Employee Wages...\n");
        empWageBuilder.computeEmpWage();

        System.out.print("\nEnter company name to get total wage: ");
        String queryCompany = sc.nextLine();

        int totalWage = empWageBuilder.getTotalWage(queryCompany);

        if (totalWage == 0) {
            System.out.println("Company not found.");
        } else {
            System.out.println("Total Wage for " + queryCompany + " is: " + totalWage);
        }

        sc.close();
    }
}
