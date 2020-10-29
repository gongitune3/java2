//list 3-15 ジャンケン

import java.util.Scanner;

class Fing432 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("手を選んでください（０…グー／１…チョキ／２…パー）：");
        int hand = stdIn.nextInt();

        if (hand == 0)
            System.out.println("グー");
        if (hand == 1)
            System.out.println("チョキ");

    }
}
