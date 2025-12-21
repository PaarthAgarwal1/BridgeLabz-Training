import java.util.Scanner;
public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double [] salaries = new double[10];
        double [] bonuses = new double[10];
        double [] newSalaries = new double[10];
        double [] yearsOfServiceArr = new double[10];
        double totalNewSalary = 0.0;
        double totalOldSalary=0.0;
        double totalBonus = 0.0;
        for(int i=0;i<salaries.length;i++){
            System.out.print("Enter the salary of employee "+(i+1)+": ");
            double salary = sc.nextDouble();
            System.out.print("Enter the years of service of employee "+(i+1)+": ");
            double yearsOfService = sc.nextDouble();
            if(salary<0||yearsOfService<0){
                System.out.println("Invalid Input");
                i--;
                continue;
            }
            salaries[i]=salary;
            yearsOfServiceArr[i]=yearsOfService;
        }
        
        for(int i=0;i<salaries.length;i++){
            double bonusP;
            if(yearsOfServiceArr[i]>5){
                bonusP = 0.05;
            }else{
                bonusP = 0.02;
            }
            double bonus = salaries[i]*bonusP;
            bonuses[i]=bonus;
            newSalaries[i]=salaries[i]+bonus;
            totalBonus+=bonus;
            totalNewSalary+=newSalaries[i]; 
            totalOldSalary+=salaries[i];  
        }
        System.out.println("\n================ FINAL REPORT ================\n");
        System.out.println("Total Old Salary Paid by Zara: INR" + totalOldSalary);
        System.out.println("Total Bonus Paid by Zara:      INR" + totalBonus);
        System.out.println("Total New Salary Paid by Zara: INR" + totalNewSalary);

        System.out.println("\n================ DETAILS =====================\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(
                "Emp " + (i + 1) + " | Old Salary: INR" + salaries[i] +
                " | Years: " + yearsOfServiceArr[i] + 
                " | Bonus: INR" + bonuses[i] +
                " | New Salary: INR" + newSalaries[i]);
        }

        sc.close();

    }
}