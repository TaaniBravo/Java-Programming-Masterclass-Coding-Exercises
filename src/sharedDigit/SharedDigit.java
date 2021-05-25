package sharedDigit;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // Should return true since the digit 2 appears in both numbers
        System.out.println(hasSharedDigit(9,99)); // Should return false since 9 is not within the range of 10-99
        System.out.println(hasSharedDigit(15, 55)); // Should return true since the digit 5 appears in both numbers.
    }

    public static boolean hasSharedDigit ( int a, int b ) {
        // IF either a or b are not withing valid range then RETURN FALSE.
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) return false;

        // Set the integers to strings so that we can read individual chars.
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);

        // We need to use two for loops so that we can compare the chars correctly.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                // IF the aStr char matches either of the bStr chars then RETURN TRUE...
                if (aStr.charAt(i) == bStr.charAt(j)) return true;
            }
        }

        // Otherwise RETURN false.
        return false;

    }
}
