abstract class Employee{
    static final int MAX_DAYS=20;
    static final int MAX_HOURS=100;
    static final int WAGE_PER_HOUR=20;

    int [] dailyHours=new int[20];
    int totalDaysPresent=0;
    int totalWorkingHours=0;

    public void markAttendence(int day,int hours){
        dailyHours[day]=hours;
        if (hours>0){
            totalDaysPresent++;
            totalWorkingHours+=hours;
        }
    }
    public abstract int calculateMonthlyWages();

}

class FullTimeEmployee extends Employee{

    static final int FULL_TIME_HOURS=8;

    @Override
    public int calculateMonthlyWages(){
        int totalWage=totalWorkingHours*WAGE_PER_HOUR;
        return totalWage;
    }
    
}

class PartTimeEmployee extends Employee{
    static final int PART_TIME_HOURS=8;

    @Override
    public int calculateMonthlyWages(){
        int totalWage=totalWorkingHours*WAGE_PER_HOUR;
        return totalWage;
    }
}

public class EmployeeWageComputation {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wages Computation Program");

        Employee employee = new FullTimeEmployee(); // Polymorphism

        int day = 0;

        while (day < Employee.MAX_DAYS &&
               employee.totalWorkingHours < Employee.MAX_HOURS) {

            int attendance = (int) (Math.random() * 3);
            int hoursWorked = 0;

            switch (attendance) {
                case 1:
                    hoursWorked = FullTimeEmployee.FULL_TIME_HOURS;
                    break;
                case 2:
                    hoursWorked = PartTimeEmployee.PART_TIME_HOURS;
                    break;
                default:
                    hoursWorked = 0;
            }

            // Prevent exceeding max hours
            if (employee.totalWorkingHours + hoursWorked > Employee.MAX_HOURS) {
                hoursWorked = Employee.MAX_HOURS - employee.totalWorkingHours;
            }

            employee.markAttendence(day, hoursWorked);
            day++;
        }

        System.out.println("Total Days Present: " + employee.totalDaysPresent);
        System.out.println("Total Working Hours: " + employee.totalWorkingHours);
        System.out.println("Total Monthly Wage: ₹" + employee.calculateMonthlyWages());
    }
    
}
