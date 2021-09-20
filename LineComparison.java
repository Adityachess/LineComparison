package com.bridgelabz.Linecomapre;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Lone Comparison computation {Program");
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the values:");
		
		double x1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		double len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println("length is:" + len1);
	}

	}


