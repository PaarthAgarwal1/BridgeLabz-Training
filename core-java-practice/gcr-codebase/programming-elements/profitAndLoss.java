public class ProfitAndLoss {
    public static void main(String[] args) {
        double costPrice = 129.0; // Example cost price (given in question)
        double sellingPrice = 191.0; // Example selling price (given in question)

        System.out.println("The Cost Price is INR "+ costPrice + " and Selling Price is INR " + sellingPrice);

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercentage = Math.round(((profit / costPrice) * 100)*100.0)/100.0;
            System.out.println("The profit is INR " + profit + " and Profit Percentage is "+ profitPercentage+"%");
        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercentage = Math.round(((loss / costPrice) * 100)*100.0)/100.0;
            System.out.println("The loss is INR " + loss + " and Loss Percentage is "+ lossPercentage+"%");
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}
