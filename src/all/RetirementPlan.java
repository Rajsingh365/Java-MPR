package all;
public class RetirementPlan {
    static private double stockRange;
    static private double mutualRange;
    static private double goldRange;
    static private double bondRange;
    static private double savingRange;
    static private double total;
    static private double amount;

    static public double getTotal() {
        return total;
    }
    static public void setTotal(double total1) {
        total = total1;
    }
    static public double getAmount() {
        return amount;
    }
    static public void setAmount(double amount1) {
        amount = amount1;
    }

    static public double getStockRange() {
        return stockRange;
    }

    static public double getMutualRange() {
        return mutualRange;
    }

    static public double getGoldRange() {
        return goldRange;
    }

    static public double getBondRange() {
        return bondRange;
    }

    static public double getSavingRange() {
        return savingRange;
    }

    public RetirementPlan(double stockRangePercentage, double mutualRangePercentage, double goldRangePercentage, double bondRangePercentage, double savingRangePercentage) {
        setAmount(Budget.surplus());
        double stocksPercentage =stockRangePercentage;
        RetirementPlan.stockRange = (((Math.random() * 80) - 40) / 100) * ((stocksPercentage / 100) * amount);

        System.out.println("mutual funds: ");
        double mutualFundsPercentage = mutualRangePercentage;
        RetirementPlan.mutualRange = (((Math.random() * 40) - 20) / 100) * ((mutualFundsPercentage / 100) * amount);

        System.out.println(" gold: ");
        double goldPercentage = goldRangePercentage;
        RetirementPlan.goldRange = 0.07 * ((goldPercentage / 100) * amount);

        System.out.println("bonds: ");
        double bondsPercentage = bondRangePercentage;
        RetirementPlan.bondRange = 0.089 * ((bondsPercentage / 100) * amount);

        System.out.println("saving accounts: ");
        double savingAccountsPercentage = savingRangePercentage;
        RetirementPlan.savingRange = 0.04 * ((savingAccountsPercentage / 100) * amount);

        RetirementPlan.setTotal( stockRange + mutualRange + goldRange + bondRange + savingRange);
        RetirementPlan.setAmount(Budget.surplus());
    }

}
