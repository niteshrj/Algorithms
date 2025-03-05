package org.example;

// https://leetcode.com/problems/palindrome-number/description/
public class Palindrome {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int digits = (int) Math.log10(x) + 1;
        int divisor = (int) Math.pow(10, digits - 1);

        while(x > 0) {
            int first = x / divisor;
            int last = x % 10;
            if(first != last) return false;
            x = (x % divisor) / 10;
            divisor /= 100;
            if (x == 0) break;
        }
        return true;
    }
}
