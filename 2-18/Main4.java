public class Main4 {
    
    public static void main(String[] srgs){
        int[] prices = {100, 200, 300};
        int[] quantities = {1, 2, 3};

        int[] results = calcTotals(prices, quantities);

        System.out.print("商品価格：[");
        for(int i = 0; i < prices.length; i++){
            System.out.print(prices[i]);
            if (i < prices.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("数量：[");
        for(int i = 0; i < quantities.length; i++){
            System.out.print(quantities[i]);
            if (i < quantities.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("合計金額：[");
        for (int i = 0; i < results.length; i++){
            System.out.print(results[i]);
            if (i < results.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    

    public static int[] calcTotals(int[] prices, int[] quantities){

        int[] totals = new int[prices.length];

        for (int i = 0; i < prices.length; i++){
            int total = prices[i] * quantities[i];
            total = (int)(total * 1.1);
            totals[i] = total;
        }

        return totals;
    }
}
