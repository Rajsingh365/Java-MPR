package all;
import java.util.Scanner;
public class RegularPlan {
    static private double Equity;
    static private double Gold;
    static private double Bonds;
    static private int years;

    public RegularPlan(double equity,double gold1,double bonds1){
        RegularPlan.Equity=equity;
        RegularPlan.Gold=gold1;
        RegularPlan.Bonds=bonds1;
        RegularPlan.years=1;
    }
    static public void setEquity(double Equity1) {
        Equity=Equity1;
    }

    static public double getEquity() {
        return Equity;
    }

    static public double getGold() {
        return Gold;
    }

    static public void setGold(double Gold1) {
        Gold=Gold1;
    }


    static public double getBonds() {
        return Bonds;
    }

    static public void setBonds(double Bonds1) {
        Bonds=Bonds1;
    }
    static public void setYears(int years1) {
        years = years1;
    }
    static public int getYears() {
        return years;
    }
    static public double emergency() {
        return (30 * Budget.surplus() / 100);
    }
    static public double save() {
        return Budget.surplus() - emergency();
    }
    static double stockRange = ((Math.random() * 80) - 40) / 100;
    static double goldRange = ((Math.random() * 80) - 40) / 100;
    static public double stockReturn() {
        double stockResult = (Equity*save())/100;

        for (int i = 0; i < years; i++) {
            stockResult += stockResult * stockRange;
        }
        return stockResult;
    }
    static public double BondReturn()
    {
        double bondresults = (Bonds * save()) / 100;
        for (int i = 0; i < years; i++) {
            bondresults += (bondresults * 0.078);
        }
        return bondresults;
    }
    static public double GoldReturn(){
        double goldresults=(Gold*save())/100;
        for (int i = 0; i < years; i++) {
            goldresults += (goldresults * goldRange);
        }
        return goldresults;
    }
}