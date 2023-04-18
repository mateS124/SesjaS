package sesja_samodzielna.task1;

import java.util.Scanner;

public class ReverseNumberByWhile {
    public static void main(String[] args) {
        int   num = 0;
        int reversenum = 0;
        System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        while (num != 0 ){
            System.out.println(reversenum = reversenum * 10);
            System.out.println(reversenum = reversenum + num % 10);
            System.out.println(num = num / 10);
        }
        System.out.println("Reverse  of input number is: " + reversenum);
    }
}
