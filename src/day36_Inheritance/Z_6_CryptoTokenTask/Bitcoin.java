package day36_Inheritance.Z_6_CryptoTokenTask;

public class Bitcoin extends CryptoTokenClass {
    public Bitcoin(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }
}
