package org.example;
import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {

    private String companyName;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;

    private int totalEmpWage;
    private List<Integer> dailyWages;

    public CompanyEmpWage(String companyName, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.dailyWages = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getMaxWorkingDays() {
        return maxWorkingDays;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public void addDailyWage(int wage) {
        dailyWages.add(wage);
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public List<Integer> getDailyWages() {
        return dailyWages;
    }

    @Override
    public String toString() {
        return "Company: " + companyName +
                " | Total Wage: " + totalEmpWage +
                " | Daily Wages: " + dailyWages;
    }
}
