import java.util.Scanner;

public class feeCalculator {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        double fee = 1.002;
        double boughtPrice, numBought, newBalance, salePrice, totalProfit, invested, feePrice, total;
        String cryptoName;


        System.out.print("Crypto Name: ");
        cryptoName = input.next();

        System.out.print("Price When Bought: ");
        boughtPrice = input.nextDouble();

        System.out.print("Number Bought: ");
        numBought = input.nextDouble();

        feePrice = boughtPrice * fee;

        System.out.println(" ");
        System.out.println(" ");


        System.out.println("**********************");
        System.out.println(".3% Profit: ");
        salePrice = feePrice * 1.003;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println(".5% Profit: ");
        salePrice = feePrice * 1.005;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println("1% Profit: ");
        salePrice = feePrice * 1.01;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println("2% Profit: ");
        salePrice = feePrice * 1.02;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println("3% Profit: ");
        salePrice = feePrice * 1.03;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println("4% Profit: ");
        salePrice = feePrice * 1.04;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println("5% Profit: ");
        salePrice = feePrice * 1.05;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println("8% Profit: ");
        salePrice = feePrice * 1.08;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println("10% Profit: ");
        salePrice = feePrice * 1.1;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println("20% Profit: ");
        salePrice = feePrice * 1.2;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println("30% Profit: ");
        salePrice = feePrice * 1.3;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println("40% Profit: ");
        salePrice = feePrice * 1.4;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("**********************");
        System.out.println("50% Profit: ");
        salePrice = feePrice * 1.5;
        System.out.println("**********************");
        System.out.println("Sale Price: " + salePrice);
        System.out.println("----------------------");
        newBalance = salePrice * numBought;
        invested = numBought * feePrice;
        totalProfit = newBalance - invested;
        System.out.println("Total Profit: " + totalProfit);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

    }
}
