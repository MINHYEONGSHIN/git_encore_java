package com.encore.lambda;

public class LambdaImpl implements ILambda {

	@Override
	public void printInfo(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	
}
