package org.example;

public class LoanResult {
    private boolean approve;
    private double interestRate;
    private String riskCategory;

    public LoanResult(boolean approve,double interestRate,String riskCategory){
        this.approve=approve;
        this.interestRate=interestRate;
        this.riskCategory=riskCategory;
    }
    public boolean isApproved(){return approve;}
    public double getInterestRate(){return interestRate;}
    public String getRiskCategory(){return riskCategory;}
}
