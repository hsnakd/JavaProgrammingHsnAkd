package day36_Inheritance.Z_6_CryptoTokenTask;

public class Cardano extends CryptoTokenClass{
    public Cardano(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }
}
