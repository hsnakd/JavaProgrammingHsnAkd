package day36_Inheritance.Z_6_CryptoTokenTask;

public class CryptoTokenClass {
    private double price;
    private int quantity;
    private long marketCap;
    private long circulatingSupply;
    private boolean isMineable;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0 ){
            System.err.println("Invalid Price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0 ){
            System.err.println("Invalid Quantity: " + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public long getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(long circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public CryptoTokenClass(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setCirculatingSupply(circulatingSupply);
        setMineable(isMineable);
    }

    public double totalPrice(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return "CryptoTokenClass{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                ", total price=" + totalPrice() +
                '}';
    }
}

/*
6. CryptoTokenTask:*
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 subclasses of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset

 */