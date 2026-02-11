package org.example;

public class LoanProcessor {
    public LoanResult evaluate(LoanApplication app){
        if(app.getAge()<21||app.getAge()>60){
            throw new IllegalArgumentException("Invalid age");
        }
        if(app.getSalary()<=0||app.getLoanAmount()<=0){
            throw new IllegalArgumentException("Invalid financial data");
        }
        if(app.getLoanAmount()>app.getSalary()*20){
            return new LoanResult(false,0,"REJECTED");
        }
        if(app.getExistingEMI()>app.getSalary()*0.5){
            return new LoanResult(false,0,"REJECTED");
        }
        int score=app.getCreditScore();
        if(score>=750){
            return new LoanResult(true,8.0,"LOW");
        }
        else if(score>=650){
            return new LoanResult(true,10.0,"MEDIUM");
        }else if(score>=600){
            return new LoanResult(true,13.0,"HIGH");
        }else{
            return new LoanResult(false,0,"REJECTED");
        }
    }
}
