/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author abrah
 */
public class PalindromeString {
    public static boolean isPalindrome(String word){
        int count=word.length() - 1;
        for(int i=0; i< word.length(); i++){
            if(word.charAt(i)!=word.charAt(count)){
                return false;
            }
            count--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String word){
        if (word == null || word.length() <= 1) {
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }
        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
