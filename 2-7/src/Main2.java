package src;

public class Main2 {
    
    public static void main(String[] args){
        double price = 2500;
        double discountRate = 0.2;

        double discount = price*discountRate;
        double finalPrice = price-discount;

        System.out.println("割引額"+discount+"円");
        System.out.println("販売価格"+finalPrice+"円");

    }
}

