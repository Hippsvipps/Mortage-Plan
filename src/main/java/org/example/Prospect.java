package org.example;

public class Prospect {
    private final String customerName;
    private final double totalLoan;
    private final double interest;
    private final int years;
    private double monthlyPayment;
    public Prospect(String customerName, double totalLoan, double interest, int years) {
        this.customerName = customerName;
        this.totalLoan = totalLoan;
        this.interest = interest;
        this.years = years;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalLoan() {
        return totalLoan;
    }

    public double getInterest() {
        return interest;
    }

    public int getYears() {
        return years;
    }
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}