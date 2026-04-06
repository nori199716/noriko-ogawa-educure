public class Main2 {
    
    public static void main(String[] args){
        int score = 85;

        String result = judge(score);

        System.out.println("得点：" + score);
        System.out.println("成績：" + result);
    }

    public static String judge(int score){
        if (score >= 80) {
            return "優";
        } else if (score >= 70) {
            return "良";
        } else if (score >= 60) {
            return "可";
        } else {
            return "不可";
        }
    }
}
