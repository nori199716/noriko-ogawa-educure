package src;

public class Main4 {
    public static void main(String[] args) {
        double pricePer100g = 138;
        double weight = 315.8;

        double total = pricePer100g*weight/100;

        int finalPrice = (int) total;//小数点以下切り捨て

        System.out.println("合計金額："+finalPrice+"円です");
    }
}
