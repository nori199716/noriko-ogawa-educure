import java.util.Scanner;

public class Main4 {

    public static void main(String[] args){

        int[][] seats = new int[5][6];

        seats[0][2] = 1;
        seats[1][1] = 1;
        seats[1][4] = 1;
        seats[3][0] = 1;
        seats[3][5] = 1;
        seats[4][2] = 1;

        System.out.println("予約前の座席状況");
        for (int i = 0; i < seats.length; i++){
            for (int j = 0; j < seats[i].length; j++){
                System.out.print("[" + seats[i][j] + "]");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("行番号(1-5)：");
        int row = sc.nextInt();

        System.out.print("列番号(1-6)：");
        int col = sc.nextInt();

        row--;
        col--;

        if (row < 0 || row >= 5 || col < 0 || col >= 6) {
            System.out.println("無効な座席番号です。");
        }

        else if (seats[row][col] == 1) {
            System.out.println("指定された座席はすでに予約済みです。");
        }
            
        else {
            seats[row][col] = 1;
            System.out.println((row + 1) + "行" + (col + 1) + "列の座席を予約しました");

        System.out.println("予約後の座席状況：");
        for (int i = 0; i < seats.length; i++){
            for (int j = 0; j < seats[i].length; j++){
                System.out.print("[" + seats[i][j] + "]");
            }
            System.out.println();
        }
    }
        sc.close();
     }
        

}
    
