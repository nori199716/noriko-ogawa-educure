/**
 * このプログラムは、簡単な自己紹介を表示しています。
 * 名前・出身地・好きな食べ物を表示します。
 */
public class Main8 {
    public static void main(String[] args) {
        //自己紹介の情報を変数に代入
        String name="山田太郎";
        String birthplace="東京都";
        String favoriteFood="カレーライス";

        //区切り線を表示
        System.out.println("==== 自己紹介 ====");

        //各項目を表示
        System.out.println("名前："+name);
        System.out.println("出身地："+birthplace);
        System.out.println("好きな食べ物："+favoriteFood);
    }
}

