# Luhn-Algorithm

In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. The algorithm is useful to determine if a card number is entered correctly or if a credit card is scanned correctly by a scanner. Almost all credit card numbers are generated following this validity check, commonly know as the Luhn check or the Modulus 10 check. The algorithm is specified in ISO/IEC 7812-1. The algorithm was designed to protect against accidental errors.
Any credit card number should pass following test:

From the rightmost digit, we should double every second digit. If the double is greater than 9, then add the both digits so that final number is of single digit.
Now sum all the digits in the number, the unchanged numbers and the doubled numbers.
The final sum should be multiple of 10 or mod 10 of the number should be 0. If it’s not then its not a valid credit card number.

Let’s check it with an example credit card number 12345678903555.

Digits are : 1,2,3,4,5,6,7,8,9,0,3,5,5,5
After doubling : 2,2,6,4,1,6,5,8,9,0,6,5,1,5
Sum of digits : 2+2+6+4+1+6+5+8+9+0+6+5+1+5 = 60 = 6*10 and hence a valid credit card number.


