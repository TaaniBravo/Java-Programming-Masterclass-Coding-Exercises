package lastDigitChecker;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        // Should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit (23, 32, 42));
        // Should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit (9, 99, 999));
        // Should return false since 9 is not within the range of 10-1000
    }

    public static boolean hasSameLastDigit ( int a, int b, int c ) {
         if (!isValid(a) || !isValid(b) || !isValid(c)) return false;

        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        String cStr = Integer.toString(c);
        int aLength = aStr.length();
        int bLength = bStr.length();
        int cLength = cStr.length();

        if ((aStr.charAt(aLength -1) == bStr.charAt(bLength -1)) || (aStr.charAt(aLength -1) == cStr.charAt(cLength -1)) || (bStr.charAt(bLength -1) == cStr.charAt(cLength -1))) return true;

        return false;

    }

    public static boolean isValid (int num) {
        if (num < 10 || num > 1000) return false;

        return true;
    }
}
