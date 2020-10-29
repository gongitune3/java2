//list 4-3 数あてゲーム

import java.util.Random;
import java.util.Scanner;

class Kazu234 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(100); //当てるべき数、０〜９９の乱数を生成

        System.out.println("数当てゲーム開始！！");
        System.out.println("０〜９９の数を当ててください。");

        int x;
        do {
            System.out.print("ランダムに数が生成されました、いくつでしょうか。");
            x = stdIn.nextInt();

            if (x > no)
                System.out.println("もっとアンダー");
            else if (x < no)
                System.out.println("もっとオーバー");
        } while (x != no);

        System.out.println("正解です。");
    }
}
