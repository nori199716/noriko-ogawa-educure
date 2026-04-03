public class Main1 {
    
    public static void main(String[] args) {
     
        int[] scores = new int[5];

        scores[0] = 85;
        scores[1] = 90;
        scores[2] = 75;
        scores[3] = 95;
        scores[4] = 80;

        for (int i = 0; i < scores.length; i++){
            System.out.println((i + 1) + "番目の生徒：" + scores[i] + "点");
        }
        
    }
}
