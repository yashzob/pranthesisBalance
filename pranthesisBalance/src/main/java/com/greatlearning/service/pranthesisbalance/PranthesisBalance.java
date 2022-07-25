/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.greatlearning.service.pranthesisbalance;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class PranthesisBalance {

    public static void main(String[] args) {
        System.out.println("Enter the string");
        
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        if (IsParenthesisBalanced(inputString)) {
            System.out.println("The entered string has balanced brackets");
        } 
        else {
            System.out.println("The entered string do not balanced brackets");
        }
    }
    
    private static boolean IsParenthesisBalanced(String inptstr){
        char peekElement;
        Stack myStack = new Stack();
        for (int i = 0; i < inptstr.length(); i++) {
            char c = inptstr.charAt(i);
            if ((c == '(') || (c == '[') || (c == '{')) {
                myStack.push(c);   
            } 
            if (myStack.empty()) {
                return false;
            }
            peekElement = (char) myStack.peek();
            if (inptstr.charAt(i) == ')' && peekElement == '(' || inptstr.charAt(i) == ']' && peekElement == '[' || inptstr.charAt(i) == '}' && peekElement == '{') {
                myStack.pop();
            }  
        }
        return myStack.empty();
    }
}