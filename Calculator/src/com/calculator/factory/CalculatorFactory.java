package com.calculator.factory;

import java.util.Scanner;

import com.calculator.factory.impl.Basic;
import com.calculator.factory.impl.Graphing;
import com.calculator.factory.impl.Scientific;

public class CalculatorFactory {

	private  CalculatorFactory() {
		
	}


public static Calculator getCalculator(String type, Float num1, Float num2) {
	
		if(type.equalsIgnoreCase("Basic")){
	         return new Basic(num1, num2);
	         
	      } else if(type.equalsIgnoreCase("Graphing")){
	         return new Graphing(num1, num2);
	         
	      } else if(type.equalsIgnoreCase("Scientific")){
	         return new Scientific(num1, num2);
	      }
	      
		return null;
	
	}
}


