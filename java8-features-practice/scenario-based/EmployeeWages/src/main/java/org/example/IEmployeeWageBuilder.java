package org.example;
public interface IEmployeeWageBuilder {

    void addCompany(String companyName, int wagePerHour,
                    int maxWorkingDays, int maxWorkingHours);

    void computeEmpWage();

    int getTotalWage(String companyName);
}
