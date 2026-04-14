package util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    public static String getString(String message) {
        System.out.print(message);
        sc.nextLine(); // clear buffer
        return sc.nextLine();
    }
}