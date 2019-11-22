package np.com.luhnimplementaion;

/**
 * Java program to implement Luhn algorithm. It is used to validate credit card, PAN number, etc
 *
 * @author Parbati Budhathoki <parbatibudhathoki3@gmail.com>
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
            int digit = Character.getNumericValue(cardNum.charAt(i));          
              if (i % 2 == 0) {
                oddSum += digit;
            } else {
                int multiplyByTwo = (digit * 2) < 9 ? (digit * 2) : (digit * 2) - 9;
                evenSum += multiplyByTwo;
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
        String cardNum = "6578490065031703";    //any credit card number
        System.out.println(checkLuhn(cardNum));
    }

}
