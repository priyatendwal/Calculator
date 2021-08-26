package com.calculator.factory.impl;

import com.calculator.factory.Calculator;

public class Graphing implements Calculator {

	private float a;
	private float b;
	
	public Graphing(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public float addition(float a, float b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public float subtraction(float a, float b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public float multiplication(float a, float b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public float division(float a, float b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public float mod(float a, float b) {
		// TODO Auto-generated method stub
		return a%b;
	}

	@Override
	public String toString() {
		return "Graphing [a=" + a + ", b=" + b + "]";
	}

}
