package az.demo.nums.util;

import java.util.Scanner;

public class ScannerUtil {

    private ScannerUtil() {
        throw new IllegalCallerException();
    }

    public static int getIntFromClientWithMessage(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
