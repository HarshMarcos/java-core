package com.learning.core.day4session1;

import java.util.Scanner;
import java.util.Stack;

public class D04P09c {
	public static int evaluateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                int operand = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    operand = operand * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operandStack.push(operand);
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (operatorStack.peek() != '(') {
                    int result = performOperation(operandStack.pop(), operandStack.pop(), operatorStack.pop());
                    operandStack.push(result);
                }
                operatorStack.pop();
            } else if (isOperator(ch)) {
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(ch)) {
                    int result = performOperation(operandStack.pop(), operandStack.pop(), operatorStack.pop());
                    operandStack.push(result);
                }
                operatorStack.push(ch);
            }
        }
        while (!operatorStack.isEmpty()) {
            int result = performOperation(operandStack.pop(), operandStack.pop(), operatorStack.pop());
            operandStack.push(result);
        }
        return operandStack.pop();
    }
	
	 public static boolean isOperator(char ch) {
	        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	    }
	 public static int performOperation(int operand2, int operand1, char operator) {
	        switch (operator) {
	            case '+':
	                return operand1 + operand2;
	            case '-':
	                return operand1 - operand2;
	            case '*':
	                return operand1 * operand2;
	            case '/':
	                if (operand2 == 0) {
	                    throw new ArithmeticException("Division by zero is not allowed");
	                }
	                return operand1 / operand2;
	        }
	        return 0;
	    }

	 public static int precedence(char ch) {
	        if (ch == '+' || ch == '-')
	            return 1;
	        else if (ch == '*' || ch == '/')
	            return 2;
	        return -1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the expression: ");
	        String expression = scanner.nextLine();
	        scanner.close();

	        try {
	            int result = evaluateExpression(expression);
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
