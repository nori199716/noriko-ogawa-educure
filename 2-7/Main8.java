package src;

import java.util.Scanner;

public class Main8 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("攻撃力を入力してください");
        String attackInput = sc.nextLine();
        int attack = Integer.parseInt(attackInput);

        System.out.print("防御力を入力してください");
        String defenseInput = sc.nextLine();
        int defense = Integer.parseInt(defenseInput);

        int normalDamage = attack - defense;
        double critical = normalDamage * 1.5;
        int criticalDamage = (int)critical;

        System.out.println("通常ダメージ："+normalDamage);
        System.out.println("クリティカルダメージ："+criticalDamage);

        sc.close();
    }
}

