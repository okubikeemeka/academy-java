package com.bptn.course._wk2_05_big_data_friday;

public class Stock {
// Create instance variables 
private String tickerSymbol;
private String companyName;
private int price;
private double percentChange;
private int totalShares;
private long marketCap;

// Constructor taking in the specified variables
 public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
    this.tickerSymbol = tickerSymbol.toUpperCase(); // Convert to uppercase
    this.companyName = companyName;
    this.price = price;
    this.totalShares = totalShares;
    this.percentChange = 0.0; // Default percent change
    this.marketCap = calculateMarketCap(); // Calculate market cap
}

// Create the methods 
// Calculate MarketCap using the method below

private long calculateMarketCap () {
return (long) price * totalShares;
}


// Use this method to adjust price
public void adjustPrice (int change) {
//Calculating the new price
int newPrice = price + change;

// Update price and market cap
price = newPrice;
marketCap = calculateMarketCap();

//Calculate percent change
percentChange = ((double) change / price) * 100;
}

// toString method
@Override
public String toString() {
    return ("Ticker Symbol: " + tickerSymbol + "\nCompany: " + companyName + "\nCurrent Price: $" + price + " (" + percentChange + "%)" + "\nMarket Cap: $" + marketCap);
}


// Don't modify the code below:
public static void main(String[] args) {
    Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
    System.out.println(stock);
    stock.adjustPrice(20);
    System.out.println(stock);
}
}

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
