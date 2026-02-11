package org.example;

public class LoanApplication {
    private int age;
    private double salary;
    private int creditScore;
    private double loanAmount;
    private double existingEMI;
    public LoanApplication(int age,double salary,int creditScore,double loanAmount,double existingEMI){
        this.age=age;
        this.salary=salary;
        this.creditScore=creditScore;
        this.loanAmount=loanAmount;
        this.existingEMI=existingEMI;
    }
    public int getAge(){return age;}
    public double getSalary(){return salary;}
    public int getCreditScore(){return creditScore;}
    public double getLoanAmount(){return loanAmount;}
    public double getExistingEMI(){return existingEMI;}
}
