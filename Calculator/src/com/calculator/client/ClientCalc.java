package com.calculator.client;

import java.util.Scanner;

import com.calculator.factory.Calculator;

import com.calculator.factory.CalculatorFactory;

public class ClientCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char op;
		Float num1;
		Float num2;
		Float ans;
		Scanner scn = new Scanner(System.in);
		System.out.print("\nEnter type of calculator (Basic, Graphing, Scientific): ");
		String type = scn.nextLine();
		System.out.print("Enter two numbers: ");
        num1 = scn.nextFloat();
        num2 = scn.nextFloat();
        System.out.print("\nEnter an operator (+, -, *, /, %): ");
        
        Calculator cal=	CalculatorFactory.getCalculator(type, num1,num2);
    	
        
        op = scn.next().charAt(0);
        switch(op) {
           case '+': ans = cal.addition(num1, num2);
              break;
           case '-': ans = cal.subtraction(num1, num2);
              break;
           case '*': ans = cal.multiplication(num1, num2);
              break;
           case '/': ans = cal.division(num1, num2);
              break;
           case '%': ans = cal.mod(num1, num2);
              break;
        default: System.out.printf("Error! Enter correct operator");
           return;
        }
        System.out.print("\n Result for " + cal + " is " );
        System.out.println();
        System.out.println(num1 + " "+op  + " " + num2 + " = " + ans);
     }
        
	

	}


