package az.demo.nums.util;

public class NumbersToWordsUtil {

    private NumbersToWordsUtil() {
        throw new IllegalCallerException();
    }

    public static String numberToWord(int num) {
        StringBuilder sb = new StringBuilder();
        if (num < 0) {
            sb.append("menfi ");
            num *= -1;
        }
        String numStr = String.valueOf(num);
        int[] nums = new int[numStr.length()];

        for (int i = 0; i < nums.length; i++) {
            int number = num % 10;
            num = num / 10;
            nums[(nums.length - 1) - i] = number;
        }

        for (int i = 0; i < nums.length; i++) {
            int unity = nums.length - i;
            if (nums.length > 1 && i == nums.length - 1 && nums[i] == 0) continue;
            String numberStr = checkUnity(unity, nums[i]);
            sb.append(numberStr);
        }
        return sb.toString();
    }

    private static String checkUnity(int unity, int number) {
        switch (unity) {
            case 1:
                return one(number);
            case 2:
            case 5:
                return decimal(number);
            case 3:
            case 6:
                switch (number) {
                    case 0:
                        return "";
                    case 1:
                        return "yuz ";
                    default:
                        return one(number) + "yuz ";
                }
            case 4:
                return number == 0 ? "min " : one(number) + "min ";
            case 7:
                return one(number) + "milyon ";
            default:
                return "";
        }
    }

    private static String decimal(int num) {
        switch (num) {
            case 1:
                return "on ";
            case 2:
                return "iyirmi ";
            case 3:
                return "otuz ";
            case 4:
                return "qirx ";
            case 5:
                return "elli ";
            case 6:
                return "altimis ";
            case 7:
                return "yetmis ";
            case 8:
                return "seksen ";
            case 9:
                return "doxsan ";
            default:
                return "";
        }
    }

    private static String one(int num) {
        switch (num) {
            case 1:
                return "bir ";
            case 2:
                return "iki ";
            case 3:
                return "uc ";
            case 4:
                return "dord ";
            case 5:
                return "bes ";
            case 6:
                return "alti ";
            case 7:
                return "yeddi ";
            case 8:
                return "sekkiz ";
            case 9:
                return "doqquz ";
            default:
                return "sifir ";
        }
    }

}
