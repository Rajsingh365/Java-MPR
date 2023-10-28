 package all;

import java.util.Scanner;

public class Budget {
    private static double income;
    private static double rent;
    private static double tax;
    private static double utilities;
    private static double luxuries;
    private static double buffer;
    private static double expenses;

    public Budget(double rent, double tax, double utilities, double luxuries, double buffer) {
        Budget.rent = rent;
        Budget.tax = tax;
        Budget.utilities = utilities;
        Budget.luxuries = luxuries;
        Budget.buffer = buffer;
        setExpenses(rent + tax + utilities + luxuries + buffer);
    }

    public static double getIncome() {
        return income;
    }

    public static void setIncome(double income) {
        Budget.income = income;
    }

    public static double getRent() {
        return rent;
    }

    public static void setRent(double rent) {
        Budget.rent = rent;
    }

    public static double getTax() {
        return tax;
    }

    public static void setTax(double tax) {
        Budget.tax = tax;
    }

    public static double getUtilities() {
        return utilities;
    }

    public static void setUtilities(double utilities) {
        Budget.utilities = utilities;
    }

    public static double getLuxuries() {
        return luxuries;
    }

    public static void setLuxuries(double luxuries) {
        Budget.luxuries = luxuries;
    }

    public static double getBuffer() {
        return buffer;
    }

    public static void setBuffer(double buffer) {
        Budget.buffer = buffer;
    }

    public static double getExpenses() {
        return expenses;
    }

    public static void setExpenses(double expenses) {
        Budget.expenses = expenses;
    }

    public static double surplus() {
        return income - expenses;
    }
}