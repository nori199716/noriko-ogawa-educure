public class Main3 {
    
    public static void main(String[] args){
        String input = "Hello";

        String result = reverse(input);

        System.out.println("入力：" + input);
        System.out.println("出力：" + result);
    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
