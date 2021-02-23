package additionaltask;

import java.util.Scanner;

public class NumberOfTheName {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
        String name = "LERA"; // "A" = 1;
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            int temp = (name.charAt(i) - 64);
            System.out.println(temp);
            sum = sum + temp;
        }
        System.out.println(sum);

    }
}
