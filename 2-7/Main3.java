package src;

public class Main3 {
    public static void main(String[] args){
        int attack = 15;
        int defense = 5;

        //int同士の割り算は小数点以下が切り捨てられる
        int damage = (attack*2-defense)/3;

        System.out.println("与えるダメージ："+damage);
    }
}

