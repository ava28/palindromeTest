/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

/**
 *
 * @author abrah
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //PalindromeString p = new PalindromeString();
        String word="radar";
        String word2="ana";
        
        System.out.println("The word "+word +" is Palindrome? "+ PalindromeString.isPalindrome(word));
        System.out.println("");
         System.out.println("The word "+word2 +" is Palindrome? "+ PalindromeString.isPalindromeRecursive(word2));
        System.out.println("");
    }
}
