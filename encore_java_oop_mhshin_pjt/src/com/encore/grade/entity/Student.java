package com.encore.grade.entity;

public class Student extends Employee {
	private int oracle_scr ;
	private int java_scr;
	private int servlet_scr ;
	private int totalScore ;
	private int averageScore ;
	
	public Student (String name, String emp_no, int age, int oracle_scr, int java_scr, int servlet_scr) {
		super(name, emp_no, age);
		this.oracle_scr = oracle_scr;
		this.java_scr = java_scr;
		this.servlet_scr = servlet_scr;
	}

	public int getOracle_scr() {
		return oracle_scr;
	}

	public void setOracle_scr(int oracle_scr) {
		this.oracle_scr = oracle_scr;
	}

	public int getJava_scr() {
		return java_scr;
	}

	public void setJava_scr(int java_scr) {
		this.java_scr = java_scr;
	}

	public int getServlet_scr() {
		return servlet_scr;
	}

	public void setServlet_scr(int servlet_scr) {
		this.servlet_scr = servlet_scr;
	}
	
	public int totalScore(int oracle_scr, int java_scr, int servlet_scr) {
		totalScore = oracle_scr + java_scr + servlet_scr ;
		return totalScore;
	}
	
	public int averageScore(int oracle_scr, int java_scr, int servlet_scr) {
		averageScore = (oracle_scr + java_scr + servlet_scr)/3;
		return averageScore;
	}

	@Override
	public String toString() {
		return "Student [oracle_scr=" + oracle_scr + ", java_scr=" + java_scr + ", servlet_scr=" + servlet_scr  + ", totalScore=" + totalScore + ", averageScore=" + averageScore + "]";
	}
	
	
	
	
}
