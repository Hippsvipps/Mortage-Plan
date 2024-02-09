package org.example;

public class MonthlyPaymentCalculator {
    public static double calculateMonthlyPayment(Prospect prospect) {

        double totalLoan = prospect.getTotalLoan();
        double interest = prospect.getInterest();
        int years = prospect.getYears();

        // To count the interest monthly
        Double monthInterest = (interest) / (12 * 100);
        // To cange it to months
        int toMonths = years * 12;
        // The Calculation E = U[b(1 + b)^p]/[(1 + b)^p - 1]
        Double monthlyPay = totalLoan * (monthInterest * (power((1 + monthInterest), toMonths))) / ((power((1 + monthInterest), toMonths)) - 1);

        return monthlyPay;
    }

    public static double power(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

}
