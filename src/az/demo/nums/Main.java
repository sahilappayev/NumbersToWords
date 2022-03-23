package az.demo.nums;

import az.demo.nums.util.NumbersToWordsUtil;
import az.demo.nums.util.ScannerUtil;

public class Main {

    public static void main(String[] args) {
        while (true) {
            int number = ScannerUtil.getIntFromClientWithMessage("Type any number: ");
            System.out.println(NumbersToWordsUtil.numberToWord(number));
        }
    }

}
