package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmpWageBuilder implements IEmployeeWageBuilder {

    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    private List<CompanyEmpWage> companyList;

    private Random random;

    public EmpWageBuilder(Random random) {
        this.companyList = new ArrayList<>();
        this.random = random;
    }

    public EmpWageBuilder() {
        this(new Random());
    }


    @Override
    public void addCompany(String companyName, int wagePerHour,
                           int maxWorkingDays, int maxWorkingHours) {
        companyList.add(new CompanyEmpWage(
                companyName, wagePerHour,
                maxWorkingDays, maxWorkingHours));
    }

    @Override
    public void computeEmpWage() {

        for (CompanyEmpWage company : companyList) {

            int totalWorkingHours = 0;
            int totalWorkingDays = 0;
            int totalWage = 0;

            while (totalWorkingDays < company.getMaxWorkingDays()
                    && totalWorkingHours < company.getMaxWorkingHours()) {

                totalWorkingDays++;

                int empCheck = this.random.nextInt(3);
                int dailyHours = 0;

                switch (empCheck) {
                    case IS_FULL_TIME:
                        dailyHours = 8;
                        break;
                    case IS_PART_TIME:
                        dailyHours = 4;
                        break;
                    default:
                        dailyHours = 0;
                }

                totalWorkingHours += dailyHours;
                int dailyWage = dailyHours * company.getWagePerHour();

                company.addDailyWage(dailyWage);
                totalWage += dailyWage;
            }

            company.setTotalEmpWage(totalWage);
            System.out.println(company);
        }
    }


    @Override
    public int getTotalWage(String companyName) {

        for (CompanyEmpWage company : companyList) {
            if (company.getCompanyName().equalsIgnoreCase(companyName)) {
                return company.getTotalEmpWage();
            }
        }
        return 0;
    }
}
