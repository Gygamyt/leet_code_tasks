package com.geightgeight;

public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        int originalInt;
        int reversedInt;

        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        originalInt = x;
        reversedInt = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            reversedInt = reversedInt * 10 + lastDigit;
            x = x / 10;
        }

        return originalInt == reversedInt;
    }
}
