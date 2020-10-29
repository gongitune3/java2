//list 4-8 正の値を読み込んで逆順に表示

import java.util.Scanner;

class Rever12 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("正の整数値を逆順に表示します。");
        int x;
        do {
            System.out.print("正の整数値：");
            x = stdIn.nextInt();
        } while ( x <= 0);

        System.out.print("逆から読むと");
        while (x > 0) {
            System.out.print(x % 10);
            x /= 10; //左オペランドの値を右のオペランドで割ること
        }
        System.out.println("です。");
    }
}
