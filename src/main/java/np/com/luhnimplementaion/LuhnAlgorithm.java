package np.com.luhnimplementaion;

/**
 * Java program to implement Luhn algorithm.
 *
 * @author Parbati Budhathoki <parbati@moco.com.np>
 * @Creation Date Jun 24, 2019 10:52:56 AM
 */
public class LuhnAlgorithm {

    /**
     * Returns true if given card number is valid
     *
     * @param cardNum Card number
     * @return true if card number is valid else false
     */
    private static boolean checkLuhn(String cardNum) {
        int cardlength = cardNum.length();
        int evenSum = 0, oddSum = 0, sum;
        for (int i = cardlength - 1; i >= 0; i--) {
            System.out.println(cardNum.charAt(i));
            int digit = Character.getNumericValue(cardNum.charAt(i));
            if (i % 2 == 0) {
                int multiplyByTwo = digit * 2;
                if (multiplyByTwo > 9) {
                    /* Add two digits to handle cases that make two digits after doubling */
                    String mul = String.valueOf(multiplyByTwo);
                    multiplyByTwo = Character.getNumericValue(mul.charAt(0)) + Character.getNumericValue(mul.charAt(1));
                }
                evenSum += multiplyByTwo;
            } else {
                oddSum += digit;
            }
        }
        sum = evenSum + oddSum;
        if (sum % 10 == 0) {
            System.out.println("valid card");
            return true;
        } else {
            System.out.println("invalid card");
            return false;
        }

    }

    public static void main(String[] args) {
        String cardNum = "4101490065031703";
        System.out.println(checkLuhn(cardNum));
    }

}
