package day05_Concatenation;

public class MyAddress {

    public static void main(String[] args) {
        String name = "Hasan AKDOĞAN";
        String neighbourhood = "Paşakent";
        String streetName = "1069 Kısa";
        String buildingNumber = "6";
        String doorNumber = "2";
        String zipCode = "10200";
        String locality = "Bandırma";
        String province = "Balıkesir";

        System.out.println( name + "\n" + neighbourhood + " Mahallesi " + "\n" + streetName + " Sokak " +
                            "No:" + buildingNumber + "/" + doorNumber + "\n" + zipCode + "\n" +
                            locality + "/" + province);




    }
}
