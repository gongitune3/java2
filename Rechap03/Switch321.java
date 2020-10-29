//list 3-17 スイッチ文、ブレイク文の腹きを確認

import java.util.Scanner;

class Switch321 {
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("整数：");
        int n = stdIn.nextInt();
        
        switch (n) {
            case 0 :    System.out.print("A");
            System.out.print("B");
            break;
            case 2 :    System.out.print("C");
            System.out.print("D");
            break;
            case 5 :    System.out.print("F");
            System.out.print("L");
            break;
            // case 6 :
            case 7,8 :    System.out.print("G");
            break;
            
            default:    System.out.print("M");
            break;
        }
        System.out.println();
    }
}
