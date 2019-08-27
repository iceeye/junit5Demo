package com.kay.junit5.utils;

/**
 * StringUtils
 * @author kay
 * @date 2019/08/27
 */
public class StringUtils {

    /**
     * 判断回文字符串
     * @param str the input string
     * @return is palindrome return true, else return false
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("The input string is null.");
        }
        int mid = (str.length() - 1) / 2;
        for (int i = 0; i <= mid; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;

    }
}
